package main;
public class Employee {
	int employeeid;
	String name;
	String position;
	int salary;
	Employee(int employeeid, String name, String position, int salary)
	{
		this.employeeid = employeeid;
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	void displayEmployeeInfo()
	{
		System.out.println("EmployeeId: "+employeeid);
		System.out.println("Name: "+name);
		System.out.println("Position: "+position);
		System.out.println("Salary: "+salary);
	}
	int calculateAnnualSalary()
	{
		return salary*12;
	}
}
