package tutorials;
import java.util.Scanner;
class StackOptions
{
	int top,item,n,arr[];
	StackOptions(int n)
	{
		this.top=-1;
		this.n=n;
		this.arr=new int[n];
	}
	void push(int item)
	{
		if(top>=n-1)
		{
			System.out.println("Overflow");
		}
		else
		{
			top++;
			arr[top]=item;
			System.out.println("The inserted element in the stack is:"+item);
		}
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("Underflow");
		}
		else
		{
			item=arr[top];
			System.out.println("The deleted element is:"+arr[top]);
			top--;
		}
	}
	void full()
	{
		if(top==(n-1))
		{
			System.out.println("Stack is full");
		}
		else
		{
			System.out.println("Stack is not full");
		}
	}
	void empty()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Stack is not empty.It contains elements");
		}
	}
}
public class Stack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		char cont;
		int choice;
		System.out.println("Enter the size of the stack:");
		int n=sc.nextInt();
		StackOptions op=new StackOptions(n);
		do
		{
			System.out.println("Operations:");
			System.out.println("1.Push\n2.Pop\n3.Full\n4.Empty");
			System.out.println("Enter the choice:");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the element:");
				int item=sc.nextInt();
				op.push(item);
				break;
			case 2:
				op.pop();
				break;
			case 3:
				op.full();
				break;
			case 4:
				op.empty();
				break;
			default:
				System.out.println("Invalid option");
			}
			System.out.println("Do you want to continue(y/n):");
			cont=sc.next().charAt(0);
		}
		while(cont=='Y'||cont=='y');
	}

}
