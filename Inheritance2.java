package oopj24csb47;
import java.util.Scanner;
class Employee2
{
	double salary;
	double DA;
	double HRA;
	double gross;
	Employee2()
	{
	}
	void display()
	{
		System.out.println("...Employee...");
	}
	void calcsalary()
	{
		gross=salary+((DA/100)*salary)+((HRA/100)*salary);
		System.out.println("The Gross Salary of the employee is "+gross);
	}
}
class Engineer extends Employee2
{
	Engineer()
	{
		super();
	}
	void display()
	{
		super.display();
		super.calcsalary();
		System.out.println("...Engineer...");
	}
	void calcsalary()
	{
		System.out.println("The Gross Salary of the engineer is "+(gross*2));
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Engineer e=new Engineer();
			System.out.println("Enter the Basic salary of the employee:");
			e.salary=sc.nextDouble();
			System.out.println("Enter the DA% of the employee:");
			e.DA=sc.nextDouble();
			System.out.println("Enter the HRA% of the employee:");
			e.HRA=sc.nextDouble();
			e.display();
			e.calcsalary();
			
	}

}
