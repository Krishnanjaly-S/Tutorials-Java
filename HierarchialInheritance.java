package tutorials;
import java.util.Scanner;
class Employee4
{
	String name;
	long Id;
	void printname()
	{
		System.out.println("Name of the employee:"+name);
	}
	void printId()
	{
		System.out.println("Id:"+Id);
	}
}
class FullTimeEmployees extends Employee4
{
	double annualsalary;
	void printAnnualSalary()
	{
		System.out.println("Annual Salary:"+"$"+annualsalary);
	}
}
class PartTimeEmployees extends Employee4
{
	double hourlyRate;
	void printHourlyRate()
	{
		System.out.println("Hourly Rate:"+"$"+hourlyRate);
	}
}
public class HierarchialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			FullTimeEmployees f=new FullTimeEmployees();
			PartTimeEmployees p=new PartTimeEmployees();
			System.out.println("Enter the full time employee name:");
			f.name=sc.nextLine();
			System.out.println("Enter the employee id:");
			f.Id=sc.nextLong();
			System.out.println("Enter the annual salary:");
			f.annualsalary=sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter the part time employee name:");
			p.name=sc.nextLine();
			System.out.println("Enter the employee id:");
			p.Id=sc.nextLong();
			System.out.println("Enter the hourly rate:");
			p.hourlyRate=sc.nextDouble();
			System.out.println("\nFULL TIME EMPLOYEE DETAILS:");
			f.printname();
			f.printId();
			f.printAnnualSalary();
			System.out.println("\nPART TIME EMPLOYEE DETAILS:");
			p.printname();
			p.printId();
			p.printHourlyRate();
	}

}
