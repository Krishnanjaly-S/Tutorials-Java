package tutorials;
import java.util.Scanner;
class Student
{
	String name;
	int age;
	long ID;
	Student(String name,int age,long ID)
	{
		this.name=name;
		this.age=age;
		this.ID=ID;
	}
	void display()
	{
		System.out.println("Student name:"+name);
		System.out.println("Age:"+age);
		System.out.println("ID:"+ID);
	}
}
class Hostler extends Student
{
	String hostel;
	Hostler(String name,int age,long ID,String hostel)
	{
		super(name,age,ID);
		this.hostel=hostel;
	}
	void display()
	{
		super.display();
		System.out.println("Hostel name:"+hostel);
	}
}
class DayScholar extends Student
{
	String bus;
	DayScholar(String name,int age,long ID,String bus)
	{
		super(name,age,ID);
		this.bus=bus;
	}
	void display()
	{
		super.display();
		System.out.println("Bus Route:"+bus);
	}
}
public class StudentInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the student name:");
			String name=sc.nextLine();
			System.out.println("Enter the age:");
			int age=sc.nextInt();
			System.out.println("Enter the student ID:");
			long ID=sc.nextLong();
			sc.nextLine();
			System.out.println("Are you a hostler or a day scholar?");
			String ch=sc.nextLine().toLowerCase();
			if(ch.equals("hostler"))
			{
				System.out.println("Enter the hostel name:");
				String hostel=sc.nextLine();
				Hostler h=new Hostler(name,age,ID,hostel);
				System.out.println("STUDENT DETAILS:");
				h.display();
			}
			else if(ch.equals("day scholar"))
			{
				System.out.println("Enter the bus route:");
				String bus=sc.nextLine();
				DayScholar d=new DayScholar(name,age,ID,bus);
				System.out.println("STUDENT DETAILS:");
				d.display();
			}
			else
			{
				System.out.println("Invalid!");
			}
		}

}
