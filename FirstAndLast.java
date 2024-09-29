package tutorials;
import java.util.Scanner;
public class FirstAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		str=str.toLowerCase();
		String ch1=str.substring(0,1);
		int len=str.length();
		String ch2=str.substring(len-1);
		boolean res=ch1.equals(ch2);
		String str2=str.substring(1,len-1);
		if(res==true)
		{
			System.out.println(str2);
			System.out.println("Duplicate characters are found at the start and end");
			return;
		}
		else
		{
			System.out.println(str2);
			System.out.println("No duplicate character is found at the start and end");
			return;
		}
	}

}
