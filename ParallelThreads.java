package tutorials;
class PThread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			System.out.println("Thread 1:"+i);
		}
	}
}
class PThread2 extends Thread
{
	public void run()
	{
		for(int j=100;j>=0;j--)
		{
			System.out.println("Thread 2:"+j);
		}
	}
}
public class ParallelThreads {

	public static void main(String[] args) {
		PThread1 p1=new PThread1();
		PThread2 p2=new PThread2();
		p1.start();
		p2.start();
		
	}

}
