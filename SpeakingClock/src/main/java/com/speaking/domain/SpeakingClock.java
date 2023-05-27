/**
 * 
 */
package com.speaking.domain;

/**
 * @author vyas_
 *
 */

public class SpeakingClock {
	private int hours;
    private  int minutes;
    private String result;

    public static final String[] TENS = {
            "oh ", "", "twenty ", "thirty ", "forty ", "fifty "
    };

    public static final String[] ONES = {
            "twelve ", "one ", "two ", "three ", "four ", "five ",
            "six ", "seven ", "eight ", "nine ", "ten ", "eleven ",
            "twelve ", "thirteen ", "fourteen ", "fifteen ",
            "sixteen ", "seventeen ", "eighteen ", "nineteen "
    };

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    /**
     * Initializes a newly created {@code SpeakingClock} object so that initializes
     * the hours, minutes and result.
     *
     * @param  hour the initial string hour entered.
     */
    public SpeakingClock()
    {
		this.hours = 0;
		this.minutes = 0;
    	
    }
    
    public void populateData(String hour)
    {
    	 try {
             hour.trim().split(":");
         } catch (NumberFormatException e) {
             throw new NumberFormatException("You need to pass a valid 24 hour format hour");
         }

         String[] hours = hour.trim().split(":");

         try {
             Integer.parseInt(hours[0]);
             Integer.parseInt(hours[1]);
         } catch (NumberFormatException e) {
             throw new NumberFormatException("You need to pass a valid 24 hour format hour");
         }

         this.hours = Integer.parseInt(hours[0]);
         this.minutes = Integer.parseInt(hours[1]);
         this.result = "";
    	
    }
    public SpeakingClock(String hour) {

        try {
            hour.trim().split(":");
        } catch (NumberFormatException e) {
            throw new NumberFormatException("You need to pass a valid 24 hour format hour");
        }

        String[] hours = hour.trim().split(":");

        try {
            Integer.parseInt(hours[0]);
            Integer.parseInt(hours[1]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("You need to pass a valid 24 hour format hour");
        }

        this.hours = Integer.parseInt(hours[0]);
        this.minutes = Integer.parseInt(hours[1]);
        this.result = "";
    }
}
