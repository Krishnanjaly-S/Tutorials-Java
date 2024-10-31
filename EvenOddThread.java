package tutorials;
import java.util.*;
import java.util.Random;
class RandomThread extends Thread
{
	int num;
	public void run()
	{
		synchronized(EvenOddThread.class)
		{
			for(int i=0;i<5;i++)
			{
				Random robj=new Random();
				int num=robj.nextInt(10);
				System.out.println("Number is "+num);
				if(num%2==0)
				{
					EvenThread e=new EvenThread(num);
					e.start();
				}
				else
				{
					OddThread o=new OddThread(num);
					o.start();
				}
			}
			try 
			{
		        Thread.sleep(500); 
		    } 
			catch (Exception e) 
			{
		        System.out.println(e.getMessage());
		    }
		}
	}
}
class EvenThread extends Thread
{
	int num;
	EvenThread(int num)
	{
		this.num=num;
	}
	public void run()
	{
		synchronized(EvenOddThread.class)
		{
			System.out.println("Even numbers between 0 and "+num+" is ");
			for(int i=0;i<=num;i+=2)
			{
				System.out.println(i);
			}
		}
	}
}
class OddThread extends Thread
{
	int num;
	OddThread(int num)
	{
		this.num=num;
	}
	public void run()
	{
		synchronized(EvenOddThread.class)
		{
			System.out.println("Odd numbers between 0 and "+num+" is ");
			for(int i=1;i<=num;i+=2)
			{
				System.out.println(i);
			}
		}
	}
}
public class EvenOddThread {

	public static void main(String[] args) {
		RandomThread r=new RandomThread();
		r.start();
	}

}
