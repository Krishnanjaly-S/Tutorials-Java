package tutorials;
import java.util.Scanner;
class Employee2
{
	double salary;
	void display()
	{
		System.out.println("Name of class is Employee");
	}
	void calcsalary()
	{
		System.out.println("Salary of the employee is "+salary);
	}
}
class Engineer extends Employee2
{
	void calcsalary()
	{
		System.out.println("Salary of the employee is "+(salary*2));
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			Engineer e=new Engineer();
			System.out.println("Enter the salary:");
			e.salary=sc.nextDouble();
			e.display();
			e.calcsalary();
			
	}

}