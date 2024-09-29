package tutorials;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a string:");
     String str=sc.nextLine();
     int n=str.length();
     String rev=new String();
     for(int i=n-1;i>=0;i--)
     {
    	 rev=rev+str.charAt(i);
     }
     System.out.println("Reverse of the string is"+" "+rev);
     if(str.equals(rev))
     {
    	 System.out.println(str+" is palindrome");
     }
     else
     {
    	 System.out.println(str+" is not palindrome");
     }
	}

}
