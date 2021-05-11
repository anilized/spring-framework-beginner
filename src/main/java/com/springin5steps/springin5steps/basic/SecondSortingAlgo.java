package com.springin5steps.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("second")
public class SecondSortingAlgo implements Sorting {
	
	public int[] sort(int[] numbers) {
		// Sort
		// Return
		
		return numbers;
	}
}
