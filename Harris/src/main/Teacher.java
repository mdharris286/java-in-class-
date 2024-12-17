package main;
public class Teacher extends Person {
	String subject;
	int salary;
	Teacher(String subject, int salary, String name, int age)
	{
		super(name,age);
		this.salary = salary;
		this.subject = subject;
	}
	void teacherinfo()
	{
		System.out.println(subject+":"+salary);
	}
	float Annum()
	{
		return salary*12;
	}
}
