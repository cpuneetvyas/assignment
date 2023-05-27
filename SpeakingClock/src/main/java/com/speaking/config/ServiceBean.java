/**
 * 
 */
package com.speaking.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.speaking.domain.SpeakingClock;
import com.speaking.interfaceImpl.SpeakingClockImpl;
import com.speaking.service.SpeakingClockService;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author vyas_
 *
 */
@Configuration
public class ServiceBean {

	 @Bean
	    public SpeakingClockService getSpeakingClockService() {
	        return new SpeakingClockService();
	    }
	 
	 @Bean
	    public SpeakingClock getSpeakingClockDomain() {
	        return new SpeakingClock();
	    }
	 
	 @Bean
	 
	 public SpeakingClockImpl getSpeakingClockAlgoImpl()
	 {
		 return new SpeakingClockImpl();
	 }
	 
	
}
