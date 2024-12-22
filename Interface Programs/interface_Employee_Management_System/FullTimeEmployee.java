package interface_Employee_Management_System;

public class FullTimeEmployee implements Employee
{
    
	private int employeeId;
	private String employeeName;
	private double monthlySalary;
	private double benefits;
	
	
	public FullTimeEmployee(int employeeId, String employeeName, double monthlySalary, double benefits) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.monthlySalary = monthlySalary;
		this.benefits = benefits;
	}

	@Override
	public double calculateSalary() 
	{
		
		return monthlySalary+benefits;
	}

	@Override
	public void generatePayroll() 
	{
        System.out.println("Employee Payroll Information:");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Benefits: " + benefits);
        System.out.println("Total Salary: " + calculateSalary());

	}

}
