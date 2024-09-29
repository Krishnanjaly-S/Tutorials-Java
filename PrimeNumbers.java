package tutorials;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int flag=0;
       System.out.println("Prime numbers between 1 and 100:");
       for(int num=2;num<=100;num++)
       {
    	   flag=1;
    	   for(int i=2;i<=(num/2);i++)
    	   {
    		   if(num%i==0)
    		   {
    			   flag=0;
    			   break;
    		   }
    	   }
    	   if(flag==1)
    	   {
    		   System.out.println(num);
    	   }
       }
	}

}