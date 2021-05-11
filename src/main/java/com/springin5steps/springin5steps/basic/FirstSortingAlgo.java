package com.springin5steps.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("first")
public class FirstSortingAlgo implements Sorting{
	
	public int[] sort(int[] numbers) {
		return numbers;
	}

}
