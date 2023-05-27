/**
 * 
 */
package com.speaking.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

/**
 * @author vyas_
 * specify proper user input pattern for time format
 * 
 * The valid time in the 24-hour format must satisfy the following conditions. 

It should start from 0-23 or 00-23.
It should be followed by a ‘:'(colon).
It should be followed by two digits from 00 to 59.
It should not end with ‘am’, ‘pm’ or ‘AM’, ‘PM’.
 */
public class UserInputDTO
{

	
	@NotEmpty
	@Pattern(regexp="([01]?[0-9]|2[0-4]):[0-5][0-9]",message="Please specify proper 24 format It should start from 0-24\n or 00-24.\r\n"
			+ "\nIt should be followed by a ‘:'(colon)\n It should be followed by two digits from 00 to 59\nIt should not end with 'am', 'pm' or 'AM', 'PM'")  
	private String time;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
}
