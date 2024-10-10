package oopj24csb47;
import java.util.Scanner;
abstract class Shapes
{
	int sides;
	String cont;
	Shapes()
	{
		
	}
	abstract void numberOfSides();
}
class Rectangle extends Shapes
{
	Rectangle(int sides)
	{
		this.sides=sides;
	}
	void numberOfSides()
	{
		System.out.println("I'm a Rectangle.I have 4 sides");
		System.out.println("Sum of angles="+((sides-2)*180));
	}
}
class Triangle extends Shapes
{
	Triangle(int sides)
	{
		this.sides=sides;
	}
	void numberOfSides()
	{
		System.out.println("I'm a Triangle.I have 3 sides");
		System.out.println("Sum of angles="+((sides-2)*180));
	}
}
class Hexagon extends Shapes
{
	Hexagon(int sides)
	{
		this.sides=sides;
	}
	void numberOfSides()
	{
		System.out.println("I'm a Hexagon.I have 6 sides");
		System.out.println("Sum of angles="+((sides-2)*180));
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String cont;
		do
		{
			System.out.println("Enter the number of sides of the geometrical shape:");
			int sides=sc.nextInt();
			if(sides==4)
			{
				Rectangle r=new Rectangle(sides);
				r.numberOfSides();
			}
			else if(sides==3)
			{
				Triangle t=new Triangle(sides);
				t.numberOfSides();
			}
			else if(sides==6)
			{
				Hexagon h=new Hexagon(sides);
				h.numberOfSides();
			}
			else
			{
				System.out.println("Invalid Shape");
			}
			System.out.println("Do you want to continue(yes/no):");
			sc.nextLine();
			cont=sc.nextLine().toLowerCase();
		}
		while(cont.equals("yes"));
	}

}
