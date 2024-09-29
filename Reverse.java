package tutorials;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number to be reversed:");
       int num=sc.nextInt();
       int rev=0;
       for(int i=0;num>0;i++)
       {
    		   int digit=num%10;
        	   rev=rev*10+digit;
        	   num=num/10;
       }
       System.out.println("Reversed number is"+" "+rev);
	}

}
