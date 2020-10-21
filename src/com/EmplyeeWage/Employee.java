package com.EmplyeeWage;

public class Employee {

	public static void main(String[] args) {
			int IS_FULL_TIME = 1;
			int IS_PART_TIME = 2;
			int empRatePerHours = 20;
			int Full_Time_Hour=8;
			int Part_Time_Hour=4;
			
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3 );
			
			if (empCheck == IS_FULL_TIME) {
				int salary = empRatePerHours*Full_Time_Hour;
				System.out.println("One Day Full Time Salary Is : "+salary);
			}
			
			else if (empCheck == IS_PART_TIME) { 
				int salary1 = empRatePerHours*Part_Time_Hour;
				System.out.println("One Day Part Time Salary Is : "+salary1);
			}
				else 
				System.out.println("Employee Is Absent");
			}
	}