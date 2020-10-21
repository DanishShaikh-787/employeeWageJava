package com.EmplyeeWage;

public class Employee {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	
	public static void main(String[] args) {
		
			int empRatePerHours = 20;
			int Full_Time_Hour=8;
			int Part_Time_Hour=4;
			
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3 );
			
				switch (empCheck) { 
				case IS_FULL_TIME :
					System.out.println("Employee Full Time Salary : "+(empRatePerHours*Full_Time_Hour));
					break;
				case IS_PART_TIME :
					System.out.println("Employee Full Time Salary : "+(empRatePerHours*Part_Time_Hour));
					break;
				default :
					System.out.println("Employee IS Absent");
					break;
				}
			}
	}