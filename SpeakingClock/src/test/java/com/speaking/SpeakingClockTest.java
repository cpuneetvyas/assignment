package com.speaking;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.beans.factory.annotation.Autowired;

import com.speaking.domain.*;
import com.speaking.service.*;

import static org.junit.Assert.*;

public class SpeakingClockTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    
    @Autowired
    SpeakingClockService service;
    

    @Test
    public void whenEnteredLettersInsteadOfIntegers_thenShouldReturnException() {
        exceptionRule.expect(NumberFormatException.class);
        exceptionRule.expectMessage("You need to pass a valid 24 hour format hour");
        String inputTime= "12:aa";
        service.convertToWordsFormat(inputTime);
        
        
       // speakingClock.solve();
    }

    @Test
    public void whenEnteredSemicolonInsteadOfColon_thenShouldReturnException() {
        exceptionRule.expect(NumberFormatException.class);
        exceptionRule.expectMessage("You need to pass a valid 24 hour format hour");
        String inputTime= "12;13";
       // SpeakingClock speakingClock = new SpeakingClock(inputTime);
        service.convertToWordsFormat(inputTime);
      
    }

    @Test
    public void whenEnteredMidday_thenShouldReturnItsMidday() {
    	  String inputTime= "12:00";
        SpeakingClock speakingClock = new SpeakingClock(inputTime);
       // speakingClock.solve();
        service.convertToWordsFormat(inputTime);
        assertEquals("It's Midday", speakingClock.getResult());
    }

    @Test
    public void whenEnteredMidnight_thenShouldReturnItsMidnight() {
    	 String inputTime= "24:00";
        SpeakingClock speakingClock = new SpeakingClock(inputTime);
        
        assertEquals("It's Midnight", speakingClock.getResult());
    }

    @Test
    public void whenEnteredTwelveFifty_thenShouldReturnItsTwelveFifty() {
    	 String inputTime= "12:50";
        SpeakingClock speakingClock = new SpeakingClock(inputTime);
        service.convertToWordsFormat(inputTime);
        //speakingClock.solve();
        assertEquals("It's twelve fifty ", speakingClock.getResult());
    }

    @Test
    public void whenEnteredOne_thenShouldReturnItsOne() {
    	
    	 String inputTime= "13:00";
         
        
        SpeakingClock speakingClock = new SpeakingClock(inputTime);
        service.convertToWordsFormat(inputTime);
        assertEquals("It's one ", speakingClock.getResult());
    }

    @Test
    public void whenEnteredTwoOhSix_thenShouldReturnItsTwoOhSix() {
    	 String inputTime= "14:06";
         SpeakingClock speakingClock = new SpeakingClock(inputTime);
        service.convertToWordsFormat(inputTime);
        assertEquals("It's two oh six ", speakingClock.getResult());
    }

    @Test
    public void whenEnteredFiveFifteen_thenShouldReturnItsFiveFifteen() {
    	 String inputTime= "17:15";
         SpeakingClock speakingClock = new SpeakingClock(inputTime);
         service.convertToWordsFormat(inputTime);
              assertEquals("It's five fifteen ", speakingClock.getResult());
    }
}
