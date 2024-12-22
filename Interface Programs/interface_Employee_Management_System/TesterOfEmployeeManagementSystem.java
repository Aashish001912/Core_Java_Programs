package interface_Employee_Management_System;

public class TesterOfEmployeeManagementSystem 
{
 public static void main (String [] args)
 {
	 FullTimeEmployee emp1=new FullTimeEmployee(101,"john doe", 5000, 2000);
	 emp1.generatePayroll();

 }
}
