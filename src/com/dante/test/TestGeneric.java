package com.dante.test;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	// phuong thuc generic co ten la printArray
	public static <E> void printArray(E[] inputArray) {
		// Hien thi cac phan tu mang
		for (E element : inputArray) {
			System.out.printf("%s, ", element);
		}
		System.out.println();
	}

	public static void printList(List<?> list) {
		for (Object e : list) {
			System.out.printf("%s ", e);
		}
	}

	public static void main(String args[]) {
		// Tao cac mang Integer, Double va Character
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		List<Integer> listInteger = new ArrayList<Integer>();
		listInteger.add(1);
		listInteger.add(69);
		
		List<String> listString = new ArrayList<String>();
		listString.add("test1");
		listString.add("test69");

		System.out.println("Mang intArray bao gom:");
		printArray(intArray); // truyen mot mang Integer

		System.out.println("\nMang doubleArray bao gom:");
		printArray(doubleArray); // truyen mot mang Double

		System.out.println("\nMang charArray bao gom:");
		printArray(charArray); // truyen mot mang Character

		System.out.println("Print List Integer");
		printList(listInteger);
		System.out.println("Print List String");
		printList(listString);

	}

}
