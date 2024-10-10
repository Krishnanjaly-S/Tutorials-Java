package oopj24csb47;
import java.util.Scanner;
public class Occurences {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	char cont;
	do
	{
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		System.out.println("Enter the character:");
		char letter=sc.next().toLowerCase().charAt(0);
		sc.nextLine();
		str=str.toLowerCase();
		int len=str.length();
		int count=0,i=0;
		do
		{
			if(str.charAt(i)==letter)
			{
				count++;
			}
			i++;
		}
		while(i<len);
		System.out.println("No of occurences of character '"+letter+"' = "+count+" times");
		System.out.println("Do you want to continue(y/n):");
		cont=sc.nextLine().toLowerCase().charAt(0);
	}
	while(cont=='y');
	}
}
