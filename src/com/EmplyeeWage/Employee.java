package com.EmplyeeWage;

public class Employee {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	
	public static void main(String[] args) {
		
			int empRatePerHours = 20;
			int Full_Time_Hour=8;
			int Part_Time_Hour=4;
			int TotalWorkingDays=20;
			int OneDaySalary=0;
			int TotalSalary=0;
			int i=0;
			
			while (i < TotalWorkingDays){
				int empCheck = (int) (Math.floor(Math.random() * 10) % 3 );
					switch (empCheck) { 
					case IS_FULL_TIME :
						OneDaySalary = empRatePerHours*Full_Time_Hour;
						System.out.println("Employee Full Time Salary :"+OneDaySalary);
						break;
					case IS_PART_TIME :
						OneDaySalary = empRatePerHours*Part_Time_Hour;
						System.out.println("Employee Full Time Salary :"+OneDaySalary);
						break;
					default :
						OneDaySalary = 0;
						System.out.println("Employee IS Absent        :"+OneDaySalary);
						break;
					}
				TotalSalary=TotalSalary+OneDaySalary;
				i++ ;
				}
			System.out.println("Total 20 Days Salary Is : "+TotalSalary);
			}
	}