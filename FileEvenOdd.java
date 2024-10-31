package tutorials;
import java.io.*;
import java.util.Scanner;
public class FileEvenOdd {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		File f1=new File("num.txt");
		f1.createNewFile();
		File f2=new File("even.txt");
		f2.createNewFile();
		File f3=new File("odd.txt");
		f3.createNewFile();
		try
		{
			if(f1.exists())
			{
				System.out.println("num.txt created");
			}
			if(f2.exists())
			{
				System.out.println("even.txt created");
			}
			if(f3.exists())
			{
				System.out.println("odd.txt created");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			System.out.println("Enter 5 numbers:");
			for(int i=0;i<5;i++)
			{
				int num=sc.nextInt();
				FileOutputStream fout=new FileOutputStream(f1,true);
				fout.write(num);
				fout.close();
				if(num%2==0)
				{
					FileOutputStream fout1=new FileOutputStream(f2,true);
					fout1.write(num);
					fout1.close();
				}
				else
				{
					FileOutputStream fout2=new FileOutputStream(f3,true);
					fout2.write(num);
					fout2.close();
				}
			}
			System.out.println("Written numbers into "+f1.getName());
			FileInputStream fin=new FileInputStream(f1);
			int i;
			System.out.println("Contents of "+f1.getName());
			while((i=fin.read())!=-1)
			{
				System.out.println(i);
			}
			fin.close();
			FileInputStream fin1=new FileInputStream(f2);
			int j;
			System.out.println("Contents of "+f2.getName());
			while((j=fin1.read())!=-1)
			{
				System.out.println(j);
			}
			fin1.close();
			FileInputStream fin2=new FileInputStream(f3);
			int k;
			System.out.println("Contents of "+f3.getName());
			while((k=fin2.read())!=-1)
			{
				System.out.println(k);
			}
			fin2.close();
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e.getMessage());
		}
	}

}