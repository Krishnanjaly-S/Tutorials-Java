package tutorials;
import java.io.*;
class EvenThread2 extends Thread
{
	File f1;
	EvenThread2(File f1)
	{
		this.f1=f1;
	}
	public void run()
	{
			synchronized(FileOfEvenOddThread.class)
			{
				try
				{
					File f1=new File("Even_Thread.txt");
					FileOutputStream fout1=new FileOutputStream(f1);
					for(int i=0;i<=100;i+=2)
					{
						String s1=String.valueOf(i+" ");
						fout1.write(s1.getBytes());
					}
				}
				catch(Exception e2)
				{
					System.out.println(e2.getMessage());
				}
			}
	}
}
class OddThread2 extends Thread
{
	File f2;
	OddThread2(File f2)
	{
		this.f2=f2;
	}
	public void run()
	{
			synchronized(FileOfEvenOddThread.class)
			{
				try
				{
					File f2=new File("Odd_Thread.txt");
					FileOutputStream fout2=new FileOutputStream(f2);
					for(int i=1;i<=100;i+=2)
					{
						String s2=String.valueOf(i+" ");
						fout2.write(s2.getBytes());
					}
				}
				catch(IOException e)
				{
					System.out.println(e.getMessage());
				}
			}
	}
}
public class FileOfEvenOddThread 
{
	public static void main(String[] args)throws IOException {
		File f1=new File("Even_Thread.txt");
		f1.createNewFile();
		File f2=new File("Odd_Thread.txt");
		f2.createNewFile();
		EvenThread2 e= new EvenThread2(f1);
		OddThread2 o=new OddThread2(f2);
		try
		{
			if(f1.exists() && f2.exists())
			{
				System.out.println(f1.getName()+ " and "+f2.getName()+" exists");
				e.start();
				o.start();
				System.out.println("Contents written successfully");
			}
		}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		}
	}

}
