package com.springin5steps.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.springin5steps.springin5steps.basic.MainAlgoClass;

@SpringBootApplication
public class Springin5stepsBasicApplication {
	

	//What are the beans? --> MainAlgoClass FirstSortingAlgo and SecondAlgo
	//What are the dependencies of a bean? --> Sorting.java
	//Where to search for beans? ---> No need to do this because they are on same package
	

	public static void main(String[] args) {
		
		// Loose coupling with interfaces
		// Sort algorithm is a dependency of MainAlgoClass<
		
		//MainAlgoClass binarySearch = new MainAlgoClass(new SecondSortingAlgo());
		
		//int result = binarySearch.searchMyThings(new int[] {12,4,6}, 3);
		
		// APPLICATION CONTEXT WILL MAINTAIN ALL THE BEANS
		
		ApplicationContext applicationContext = SpringApplication.run(Springin5stepsBasicApplication.class, args);
		MainAlgoClass mainAlgo = applicationContext.getBean(MainAlgoClass.class); 

		MainAlgoClass mainAlgo2 = applicationContext.getBean(MainAlgoClass.class); 
		
		System.out.println("First: " + mainAlgo);
		System.out.println("Second: " + mainAlgo2);
		
		int result = mainAlgo.searchMyThings(new int[] {12,4,6}, 3);
		System.out.println(result);
	}

}
