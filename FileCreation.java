package oopj24csb47;
import java.io.*;
import java.util.Scanner;
public class FileCreation {

	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		File f=new File("sample.txt");
		File f1=new File("new sample.txt");
		String content;
			if(f.exists())
			{
				FileWriter out = new FileWriter(f);
				System.out.println("sample.txt exists");
				System.out.println("Enter the content to enter into the file:");
				content =sc.nextLine();
				out.write(content);
				out.close();				
				System.out.println("Content written to sample.txt");
				System.out.println("\nnew sample.txt exists");
				System.out.println("***Contents of sample.txt***");
				FileReader fr=new FileReader(f);
				FileWriter fout = new FileWriter(f1);
				int i;
				int c;
				while((i=fr.read())!=-1)
				{
					System.out.print((char)i);
					fout.write(i);
				}
				fr.close();
				fout.close();
				System.out.println("\nCopied contents from one file to another");
				System.out.println("***Contents of file new sample.txt***");
				FileReader f1in=new FileReader(f1);
				int j;
				while((j=f1in.read())!=-1)
				{
					System.out.print((char)j);
				}
				f1in.close();
			}
			else
			{
				System.out.println("sample.txt does not exist");
			}
	}

}
