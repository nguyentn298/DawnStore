package com.dante.learn.core;

public class TestReturn {
	public static void main(String[] args) {
		printString("ng");
	}
	
	// If the method returns void then return; just exits out 
	// of the method at that statement, not running the following statements.
	
	//  it returns nothing
	public static void printString(String a) {
		String b = "this is my String";
		if(b.contains(a)) {
			return;
		} else {
			System.out.println("no no");
		}
		
	}
}
