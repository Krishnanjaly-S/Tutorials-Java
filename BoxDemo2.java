package boxdemo;
import java.util.Scanner;
public class BoxDemo2 {
	double width;
    double height;
    double depth;
    double volume()
    {
    	return(width*height*depth);
    }
    

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BoxDemo2 mybox=new BoxDemo2();
		System.out.println("Enter the width:");
		mybox.width=sc.nextDouble();
		System.out.println("Enter the height:");
		mybox.height=sc.nextDouble();
		System.out.println("Enter the depth:");
		mybox.depth=sc.nextDouble();

		double vol=mybox.volume();
		System.out.println("Volume is "+vol);
	}      
	}