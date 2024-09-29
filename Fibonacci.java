package tutorials;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no of terms:");
       int num=sc.nextInt();
       int num1=0,num2=1;
       int count=0;
       System.out.println("Fibonacci Series upto "+num+" "+"terms:");
       System.out.print(num1+" "+num2+" ");
       while(count<num-2)
       {
    	   int next=num1+num2;
    	   System.out.print(next+" ");
    	   num1=num2;
    	   num2=next;
    	   count++;
       }
	}

}
