package com.EmplyeeWage;

public class Employee {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int empRatePerHours = 20;
	public static final int Num_Working_Days=20;
	public static final int Num_Working_Hours=100;
	
	public static void main(String[] args) {
		workingHours();
		}
	
	public static void workingHours() {
		int TotalWorkingDays=0;
		int TotalWorkingHours=0;
		int TotalSalary=0;
		int empHours=0;
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3 );
		switch (empCheck) {
		case IS_FULL_TIME :
			empHours=8;
			break;
		case IS_PART_TIME :
			empHours=4;
			break;
		default :
			empHours=0;
			break;
		}
			while (TotalWorkingDays < Num_Working_Days && TotalWorkingHours < Num_Working_Hours){
				TotalWorkingHours=(TotalWorkingHours+empHours);
				TotalWorkingDays++ ;
				}
			TotalSalary=empRatePerHours*TotalWorkingHours;
			System.out.println("Number Of Working Days :"+TotalWorkingDays);
			System.out.println("Number Of Working Hours :"+TotalWorkingHours);
			System.out.println("Total Days Salary Is : "+TotalSalary);
	}	
}