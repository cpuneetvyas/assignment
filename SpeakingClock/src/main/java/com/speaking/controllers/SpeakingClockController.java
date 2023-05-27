/**
 * 
 */
package com.speaking.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
/**
 * @author vyas_
 *
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.speaking.dto.UserInputDTO;
import com.speaking.service.SpeakingClockService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@RestController
@RestControllerAdvice
@EnableSwagger2
public class SpeakingClockController {
	
	@Autowired
	private SpeakingClockService speakingClockService;

	@PostMapping(value="/getimeinwords",produces="application/json" )
	 
	    public String getTimeInWords(@Valid @RequestBody  UserInputDTO time) {
		 
		  String  hour = time.getTime();
	       
		  String response=speakingClockService.convertToWordsFormat(hour);
		 
		 return response;
	    }
}
