package tutorials;
import java.util.Scanner;
class Operation
{
	int q[];
	int front,rear,n;
	Operation(int n)
	{
		front=0;
		rear=-1;
		this.q=new int[n];
		this.n=n;
	}
	void enqueue(int item)
	{
		if(rear==(n-1))
		{
			System.out.println("Overflow");
		}
		else
		{
			rear=rear+1;
			q[rear]=item;
		}
	}
	void dequeue()
	{
		if(rear<front)
		{
			System.out.println("Underflow");
		}
		else
		{
			int item=q[front];
			front=front+1;
			System.out.println("Deleted element is:"+item);
		}
	}
	void show()
	{
		if(rear<front)
		{
			System.out.println("It is empty");
		}
		else
		{
			System.out.println("Queue:");
			for(int i=front;i<=rear;i++)
			{
				System.out.println(q[i]+"\t");
			}
		}
	}
}
public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the queue:");
		int n=sc.nextInt();
		Operation ob=new Operation(n);
		char cont;
		int choice;
		do
		{
			System.out.println("Operations of Queue:");
			System.out.println("1.Enqueue\n2.Dequeue\n3.Queue display\n4.Exit");
			System.out.println("Enter the option:");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the element to enqueue:");
				int item=sc.nextInt();
				ob.enqueue(item);
				break;
			case 2:
				ob.dequeue();
				break;
			case 3:
				ob.show();
				break;
			case 4:
				System.out.println("Exiting..");
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
			System.out.println("Do you want to continue(y/n):");
			cont=sc.next().charAt(0);
		}
		while(cont=='Y'||cont=='y');
	}

}
