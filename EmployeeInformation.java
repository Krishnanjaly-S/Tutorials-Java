package tutorials;
import java.util.Scanner;
abstract class Employee6
{
	String name;
	String type;
	Employee6(String name,String type)
	{
		this.name=name;
		this.type=type;
	}
	abstract void calcMonthSalary();
	void printname()
	{
		System.out.println("Name:"+name);
	}
}
class FullTimeEmployee1 extends Employee6
{
	double salary;
	final double HRA=1000;
	FullTimeEmployee1(String name,double salary)
	{
		super(name,"Full Time");
		this.salary=salary;
	}
	void calcMonthSalary()
	{
		System.out.println(name+"'s salary:"+(salary+HRA));
	}
}
class PartTimeEmployee1 extends Employee6
{
	double hourlyWage;
	int noOfHours;
	final int workingDays=25;
	PartTimeEmployee1(String name,double hourlyWage,int noOfHours)
	{
		super(name,"Part Time");
		this.noOfHours=noOfHours;
		this.hourlyWage=hourlyWage;
	}
	void calcMonthSalary()
	{
		System.out.println(name+"'s salary:"+(hourlyWage*noOfHours*workingDays));
	}
}
class Intern extends Employee6
{
	double stipend;
	Intern(String name,double stipend)
	{
		super(name,"Intern");
		this.stipend=stipend;
	}
	void calcMonthSalary()
	{
		System.out.println(name+"'s Stipend:"+stipend);
	}
}
public class EmployeeInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ch;
		do
		{
			System.out.println("Enter Employee's name:");
			String name=sc.nextLine();
			System.out.println("Enter employee's job type(Full time/Part Time/Intern):");
			String type=sc.nextLine().toLowerCase();
			if(type.equals("full time"))
					{
						System.out.println("Enter the monthly salary:");
						double salary=sc.nextDouble();
						sc.nextLine();
						FullTimeEmployee1 f=new FullTimeEmployee1(name,salary);
						f.calcMonthSalary();
					}
			else if(type.equals("part time"))
			{
				System.out.println("Enter hourly wage:");
				double hourlyWage=sc.nextDouble();
				System.out.println("Enter number of hours worked/day:");
				int noOfHours=sc.nextInt();
				sc.nextLine();
				PartTimeEmployee1 p=new PartTimeEmployee1(name,hourlyWage,noOfHours);
				p.calcMonthSalary();
			}
			else if(type.equals("intern"))
			{
				System.out.println("Enter the stipend amount:");
				double stipend=sc.nextDouble();
				sc.nextLine();
				Intern i=new Intern(name,stipend);
				i.calcMonthSalary();
			}
			else
			{
				System.out.println("Invalid type!");
			}
			System.out.println("Do you want to continue(yes/no):");
			ch=sc.nextLine().toLowerCase();
		}
		while(ch.equals("yes"));
	}

}
