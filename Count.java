package tutorials;
import java.util.Scanner;
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		str=str.toLowerCase();
		int len=str.length();
		int character=0,digit=0,space=0,lines=0,alphabets=0,words=0,spcl=0;
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				alphabets++;
			}
			else if(str.charAt(i)>='0'& str.charAt(i)<='9')
			{
				digit++;
			}
			else if(str.charAt(i)=='\n')
			{
				lines++;
			}
			else if(str.charAt(i)==' ')
			{
				space++;
			}
			else
			{
				spcl++;
			}
		}
		character=digit+alphabets+spcl;
		lines=lines+1;
		words=space+1;
		System.out.println("Total no of characters:"+character);
		System.out.println("Words:"+words);
		System.out.println("Lines:"+lines);
		System.out.println("Alphabets:"+alphabets);
		System.out.println("Digits:"+digit);
		System.out.println("White Spaces:"+space);
	}

}
