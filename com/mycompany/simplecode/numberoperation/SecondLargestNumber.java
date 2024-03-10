package com.mycompany.simplecode.numberoperation;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber{
	public static void main(String[] args) {

		List<Integer> listOfIntigers = Arrays.asList(45,12,56,15,24,75,31,89);
		Integer result = listOfIntigers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(result);
		
	}
}