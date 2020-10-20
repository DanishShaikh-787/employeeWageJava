package com.EmplyeeWage;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int IS_FULL_TIME = 1;
			int empCheck = (int) (Math.floor(Math.random() * 10) % 2 );
			
			if (empCheck == IS_FULL_TIME) {
				System.out.println("Employee Is Present");
			} else {
				System.out.println("Emoployee IS Abscent");
			}
	}
}