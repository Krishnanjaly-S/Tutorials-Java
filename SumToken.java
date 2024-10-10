package oopj24csb47;
import java.util.*;
public class SumToken {
	public static void main(String args[]) 
{
	int n;
	int sum = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter integers with one space gap:");
	String s = sc.nextLine();
	StringTokenizer st = new StringTokenizer(s, " ");
	while (st.hasMoreTokens())
	{
		String temp = st.nextToken();
		int number=Integer.parseInt(temp);
		System.out.println(number);
		sum=sum+number;
	}
	System.out.println("sum of the integers is: " + sum);
	sc.close();
	}
}