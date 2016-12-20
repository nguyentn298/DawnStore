package com.dante.learn.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
	
	private static String REGEX = "dog\\s+";
	
	public static void main(String[] args) {
		String animal = "this is a dog dog dog";
//		checkValues(animal);
		
//		String oldString = "this is asus";
//		String newString = "dell";
//		String fullString = oldString.replace("/asus/gi",newString);
//		System.out.println(fullString);
		System.out.println(animal.replaceAll("dog", "cat"));
	}
	
	public static void checkValues(String input) {
		String anotherRegex = "cat";
		Pattern pattern = Pattern.compile(REGEX);
		Matcher matcher = pattern.matcher(input);
		//input = matcher.replaceAll(anotherRegex);
		System.out.println(matcher.matches());
		
	}
}
