//This the main method
public class Main
{
	public static void main(String[] args)
	{
		Employee e = new Employee();// created an object e of employee class
		e.name="PAVAN";
		e.age=20;
		e.city="VIZAG";
		e.display();
		Employee e1 = new Employee();//cretaed an object e1 of employee class
		e1.name="AVESH";
		e1.age=22;
		e1.city="DELHI";
		e1.display();
	}
}
//This the employee class
class Employee
{
	String name;
	int age;
	String city;
	public void display()
	{
		System.out.println("The name is "+name);
		System.out.println("The age is "+age);
		System.out.println("The city is "+city);
	}
}