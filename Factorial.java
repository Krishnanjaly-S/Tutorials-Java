package tutorials;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number:");
	  int num=sc.nextInt();
	  int factorial=1;
	  int i=num;
	  while(i>0)
	  {
		  factorial=factorial*i;
		  i--;
	  }
	  System.out.println("The factorial of the number is"+" "+factorial);
	}

}
