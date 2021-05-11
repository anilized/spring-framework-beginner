package com.springin5steps.springin5steps;

import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.springin5steps.springin5steps.basic.MainAlgoClass;
import com.springin5steps.springin5steps.scope.PersonDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Springin5stepsScopeApplication{
	
	
	private static Logger LOGGER = LoggerFactory.getLogger(Springin5stepsComponentScanApplication.class);

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(Springin5stepsComponentScanApplication.class, args);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class); 
		
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		
		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());
	}

}












