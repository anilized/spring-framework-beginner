package com.springin5steps.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MainAlgoClass {
	
	@Autowired //this is a dependency and autowiring with name
	@Qualifier("second")
	private Sorting sortAlgo;
	
	/*
	 * CONSTRUCTOR DEP INJECTION
	 * 
	public MainAlgoClass(Sorting sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}
	*/



	public int searchMyThings(int[] numbers, int number) {
		//Sort numbers
		int[] sortedNums = sortAlgo.sort(numbers);
		System.out.println(sortAlgo);
		//Search number in numbers
		//Return result
		return 3;
	}

}
