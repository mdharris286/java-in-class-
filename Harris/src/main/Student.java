package main;
public class Student extends Person {
	int grade, id;
	Student(int grade, int id, String name, int age)
	{
		super(name,age);
		this.grade = grade;
		this.id = id;
	}
	void studentdisplay()
	{
		System.out.println(grade+":"+id);
	}
	float gradecalculate()
	{
		return grade*5;
	}
}
