package oopj24csb47;
import java.util.Scanner;
class Area
{
	void calculateAreaTriangle(double a,double b)
	{
		double area=0.5*a*b;
		System.out.println("Area of the triangle with base "+a + " and height "+b+" is:"+area);
	}
	void calculateAreaRectangle(int l,int w)
	{
		int area=l*w;
		System.out.println("Area of rectangle with width "+w+" and length "+l+" is:"+area);
	}
	void calculateAreaTrapezium(float s1,float s2,float h)
	{
		float area=((s1+s2)/2)*h;
		System.out.println("Area of trapezium with side lengths "+s1+","+s2+" and height "+h+" is:"+area);
	}
	void calculateAreaCircle(double r)
	{
		double area=3.14*(r*r);
		System.out.println("Area of circle with radius "+r+" is:"+area);
	}
}
public class Overloading {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Area area=new Area();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the base of the triangle:");
	    double a=sc.nextDouble();
	    System.out.println("Enter the height of the triangle:");
	    double b=sc.nextDouble();
	    System.out.println("Enter the length of the rectangle:");
	    int l=sc.nextInt();
	    System.out.println("Enter the breadth of the rectangle:");
	    int w=sc.nextInt();
	    System.out.println("Enter the radius of the circle:");
	    double r=sc.nextDouble();
	    System.out.println("Enter the sides of the trapezium:");
	    float s1=sc.nextFloat();
	    float s2=sc.nextFloat();
	    System.out.println("Enter the height of the trapezium:");
	    float h=sc.nextFloat();
	    //Area of Triangle
		area.calculateAreaTriangle(a,b);
		area.calculateAreaRectangle(l,w);
		area.calculateAreaTrapezium(s1,s2,h);
		area.calculateAreaCircle(r);
	}

}

