/**
 * 
 */
package com.speaking.interfaceImpl;

import com.speaking.domain.SpeakingClock;
import com.speaking.interfaces.ConvertTimeIntoWords;

/**
 * @author vyas_
 *
 */
/**
 * Converts given a {@code int} hour and minutes to a hour in words.
 *
 * @param hour      {@code int} hour
 * @param minutes   {@code int} minutes
 * @return          the {@code String} hour
 */
public class SpeakingClockImpl implements ConvertTimeIntoWords
{
@Override
public String convertToWords(SpeakingClock speakingClock) {
	
	StringBuilder result = new StringBuilder();
	int hour=speakingClock.getHours();
    int minutes=speakingClock.getMinutes();

    if (speakingClock.getMinutes() == 0) {

        if (speakingClock.getHours() == 12) {
            return result.append("It's Midday").toString();
        }

        if (speakingClock.getHours() == 24) {
            return result.append("It's Midnight").toString();
        }

        result.append("It's ").append(SpeakingClock.ONES[hour % 12]);

    } else if (minutes % 10 == 0) {
        result.append("It's ").append(SpeakingClock.ONES[hour % 12]).append(SpeakingClock.TENS[minutes / 10]);
    } else if (minutes < 10 || minutes > 20) {
        result.append("It's ").append(SpeakingClock.ONES[hour % 12]).append(SpeakingClock.TENS[minutes / 10]).append(SpeakingClock.ONES[minutes % 10]);
    } else {
       
        result.append("It's ").append(SpeakingClock.ONES[hour % 12]).append(SpeakingClock.ONES[minutes]);
    }

    return result.toString();
	
	
}

}
