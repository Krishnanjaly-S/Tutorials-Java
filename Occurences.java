package tutorials;
import java.util.Scanner;
public class Occurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		System.out.println("Enter the character:");
		char letter=sc.nextLine().toLowerCase().charAt(0);
		str=str.toLowerCase();
		int len=str.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)==letter)
			{
				count++;
			}
		}
		System.out.println("No of occurences of character "+letter+" = "+count+" times");
	}
}
