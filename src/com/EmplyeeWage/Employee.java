package com.EmplyeeWage;

public class Employee {

	public static void main(String[] args) {
			int IS_FULL_TIME = 1;
			int empCheck = (int) (Math.floor(Math.random() * 10) % 2 );
			
			if (empCheck == IS_FULL_TIME) {
				int empRatePerHours = 20;
				int empHour = 8;
				int salary = empRatePerHours*empHour;
				System.out.println("One Day Salary Is : "+salary);
			} else {
				int salary = 0;
				System.out.println("One Day Salary Is : "+salary);
			}			
	}
}