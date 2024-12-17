package main;
public class Person {
	String name;
	int age;
	
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	void displayinfo()
	{
		System.out.println(name+":"+age+" ");
	}
}
