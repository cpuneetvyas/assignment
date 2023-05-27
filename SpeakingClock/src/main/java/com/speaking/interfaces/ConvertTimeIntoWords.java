/**
 * 
 */
package com.speaking.interfaces;

import com.speaking.domain.SpeakingClock;

/**
 * @author vyas_
 *In future if implementation changes for different speaking clock we can write different implementation
 */

public interface ConvertTimeIntoWords {
	

	public String convertToWords(SpeakingClock clock);
}
