package com.day3;
import java.util.Scanner;

public class Day3 {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void question1() {
		int array[] = new int[5];
		for(int i=0;i<5;i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Print using for loop: ");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println("Print using for-each loop: ");
		for(int data:array) {
			System.out.println(data);
		}
	}
	
	public static void question2() {
		int array[] = new int[5];
		for(int i=0;i<5;i++) {
			array[i] = scanner.nextInt();
		}
		
		int sum = 0;
		int average;
		
		for(int data:array) {
			sum += data;
		}
		
		average = sum/array.length;
		
		System.out.println("Sum = " + sum + " Average = " + average);
	}
	
	public static void question3() {
		int array[] = new int[5];
		for(int i=0;i<5;i++) {
			array[i] = scanner.nextInt();
		}
		
		int max = array[0];
		
		for(int data:array) {
			if(data>max) {
				max = data;
			}
		}
		
		System.out.println("Max = " + max);
	}


}

