package tutorials;
import java.util.Scanner;
class Employee7
{
	double salary;
	double DA;
	double HRA;
	double gross;
	Employee7()
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
class Engineer3 extends Employee7
{
	Engineer3()
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
public class Inheritance4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Engineer3 e=new Engineer3();
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
