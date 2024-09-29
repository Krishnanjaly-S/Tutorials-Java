package tutorials;
import java.util.Scanner;
public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of the elements in an integer array:");
       int num=sc.nextInt();
       int[] arr=new int[num];
       System.out.println("Enter the elements:");
       for(int i=0;i<num;i++)
       {
    	   arr[i]=sc.nextInt();
       }
	   int max=arr[0];
       System.out.println("The maximum element in the array is:");
       for(int i=0;i<num;i++)
       {
    	   if(max<arr[i])
    	   {
    		   max=arr[i];
    	   }
       }
       System.out.println(max);
	   int min=arr[0];
       System.out.println("The minimum element in the array is:");
       for(int i=0;i<num;i++)
       {
    	   if(min>arr[i])
    	   {
    		   min=arr[i];
    	   }
       }
       System.out.println(min);
	}

}
