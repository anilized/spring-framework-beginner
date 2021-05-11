package com.springin5steps.springin5steps;

import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springin5steps.basics.componentscan.ComponentDAO;
import com.springin5steps.springin5steps.basic.MainAlgoClass;
import com.springin5steps.springin5steps.scope.PersonDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication // DOES NOT WORK BEACUSE AUTOMATICALLY LOOKS PACKAGE TO COMPONENTS BUT THEY ARE ON DIFFERENT PACKAGE
@ComponentScan("com.springin5steps.basics.componentscan") // Check specified package for components
public class Springin5stepsComponentScanApplication {
	
	
	private static Logger LOGGER = LoggerFactory.getLogger(Springin5stepsScopeApplication.class);

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(Springin5stepsScopeApplication.class, args);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		LOGGER.info("{}", componentDAO);
		
		
	}

}