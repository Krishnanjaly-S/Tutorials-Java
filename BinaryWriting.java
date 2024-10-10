package file;
import java.io.*;
import java.util.Scanner;
public class BinaryWriting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String content=sc.nextLine();
		File b1=new File("Binary1.bin");
		try 
		{
			FileOutputStream fin=new FileOutputStream(b1);
			fin.write(content.getBytes());
		} 
		catch (Exception e) 
		{
			System.out.println("An error occured:"+e.getMessage());
		}
	}

}
