/**
 * 
 */
package com.speaking;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.speaking.controllers.SpeakingClockController;

/**
 * @author vyas_
 *
 */

@WebMvcTest(SpeakingClockController.class)
public class SpeakingControllerTest {

	  @Autowired
	  private MockMvc mvc;
	  
	  @Test
	  	  public void getTime() throws Exception 
	  {
	  
	  }
}
