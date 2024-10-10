package oopj24csb47;
import java.util.Scanner;
class Employee
{
	String name;
	String address;
	int age;
	long phone;
	double salary;
	void printname()
	{
		System.out.println("Name:"+name);
	}
	void printaddress()
	{
		System.out.println("Address:"+address);
	}
	void printage()
	{
		System.out.println("Age:"+age);
	}
	void printphone()
	{
		System.out.println("Phone number:"+phone);
	}
	void printsalary()
	{
		System.out.println("Salary:"+salary);
	}
}
class Officer extends Employee
{
	 String specialization;
	 void printspecialization()
	 {
		 System.out.println("Specialization:"+specialization);
	 }
}
class Manager extends Employee
{
	String dept;
	void printdept()
	{
		System.out.println("Department:"+dept);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Officer o=new Officer();
		Manager m=new Manager();
		System.out.println("Enter the Officer's name:");
		o.name=sc.nextLine();
		System.out.println("Enter the age:");
		o.age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the address:");
		o.address=sc.nextLine();
		System.out.println("Enter the phone number:");
		o.phone=sc.nextLong();
		System.out.println("Enter salary:");
		o.salary=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter specialization:");
		o.specialization=sc.nextLine();
		
		System.out.println("Enter the Manager's name:");
		m.name=sc.nextLine();
		System.out.println("Enter the age:");
		m.age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the address:");
		m.address=sc.nextLine();
		System.out.println("Enter the phone number");
		m.phone=sc.nextLong();
		System.out.println("Enter salary:");
		m.salary=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter department:");
		m.dept=sc.nextLine();
		System.out.println("\nOFFICER'S DETAILS:\n");
		o.printname();
		o.printage();
		o.printaddress();
		o.printphone();
		o.printsalary();
		o.printspecialization();
		System.out.println("\nMANAGER'S DETAILS:\n");
		m.printname();
		m.printage();
		m.printaddress();
		m.printphone();
		m.printsalary();
		m.printdept();
	}

}

