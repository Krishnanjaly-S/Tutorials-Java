package tutorials;
import java.util.Scanner;
public class RemovingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		System.out.println("Enter a character:");
		char character=sc.nextLine().charAt(0);
		String result=str.replace(character,'\0').replaceAll("\0","");
		System.out.println("The resulted string is:"+result);
	}
}