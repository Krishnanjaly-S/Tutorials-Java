package tutorials;
import java.util.Scanner;
public class SumAverage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0,count=0;
		System.out.println("Enter the number of integers:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" numbers:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The integers are:");
		for(int i=0;i<n;i++)
		{
			try
			{
				if(arr[i]>0)
				{
					System.out.println(arr[i]);
					sum+=arr[i];
					count++;
				}
				else
				{
					throw new InvalidNumberException("Invalid Number "+arr[i]);
				}
			}
			catch(InvalidNumberException e)
			{
				System.out.println(e.getMessage());
			}
		}
		if(count>0)
		{
			System.out.println("\nSum of the numbers:"+sum);
			float average=sum/count;
			System.out.println("Average of the numbers:"+average);
		}
	}

}
