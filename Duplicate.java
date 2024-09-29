package tutorials;
import java.util.Scanner;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		str=str.toLowerCase();
		String ch1=str.substring(0,2);
		int len=str.length();
		String ch2=str.substring(len-2);
		boolean res=ch1.equals(ch2);
		if(res==true)
		{
			System.out.println("The first two characters '"+ch1+"' appears at the end of the string");
		}
		else
		{
			System.out.println("The first two characters '"+ch1+"' do not appear at the end of the string");
		}
	}

}
