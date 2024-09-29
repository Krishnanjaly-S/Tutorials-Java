package tutorials;
import java.util.Scanner;
public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of the elements in an integer array:");
       int num=sc.nextInt();
       int[] arr=new int[num];
       System.out.println("Enter the elements:");
       int sum=0;
       for(int i=0;i<num;i++)
       {
    	   arr[i]=sc.nextInt();
    	   sum=sum+arr[i];
       }
       System.out.println("Sum of the element is:"+" "+sum);
	}

}
