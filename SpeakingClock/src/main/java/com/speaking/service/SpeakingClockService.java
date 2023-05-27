/**
 * 
 */
package com.speaking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.speaking.domain.SpeakingClock;
import com.speaking.interfaceImpl.SpeakingClockImpl;

/**
 * @author vyas_
 *
 */
@Service
public class SpeakingClockService {

	@Autowired
	private ApplicationContext context;

	@Autowired
	private SpeakingClockImpl speakingClockimpl;

	public String convertToWordsFormat(String inputHour) {

		SpeakingClock speakingClockTest = context.getBean(SpeakingClock.class);

		speakingClockTest.populateData(inputHour);

		String convertedTime = speakingClockimpl.convertToWords(speakingClockTest);

		return convertedTime;

	}

	/*
	 * private String convertToWords(SpeakingClock speakingClock) {
	 * 
	 * StringBuilder result = new StringBuilder(); int
	 * hour=speakingClock.getHours(); int minutes=speakingClock.getMinutes();
	 * 
	 * if (speakingClock.getMinutes() == 0) {
	 * 
	 * if (speakingClock.getHours() == 12) { return
	 * result.append("It's Midday").toString(); }
	 * 
	 * if (speakingClock.getHours() == 24) { return
	 * result.append("It's Midnight").toString(); }
	 * 
	 * result.append("It's ").append(SpeakingClock.ONES[hour % 12]);
	 * 
	 * } else if (minutes % 10 == 0) {
	 * result.append("It's ").append(SpeakingClock.ONES[hour %
	 * 12]).append(SpeakingClock.TENS[minutes / 10]); } else if (minutes < 10 ||
	 * minutes > 20) { result.append("It's ").append(SpeakingClock.ONES[hour %
	 * 12]).append(SpeakingClock.TENS[minutes /
	 * 10]).append(SpeakingClock.ONES[minutes % 10]); } else {
	 * 
	 * result.append("It's ").append(SpeakingClock.ONES[hour %
	 * 12]).append(SpeakingClock.ONES[minutes]); }
	 * 
	 * return result.toString();
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
}
