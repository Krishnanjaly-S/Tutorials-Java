package oopj24csb47;
import java.util.*;
public class ArithmeticExceptionDemo 
{
 public static void main(String[] args) {
 // TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 char op;
 do
 {
  System.out.println("MENU:");
  System.out.println("1.Arithmetic Exception\n2.Array Index Out Of Bound Exception\n3.Exiting");
  System.out.println("Enter a choice:");
  int ch=sc.nextInt();
   switch(ch)
   {
   case 1:
    //Arithmetic Exception
    System.out.println("Program to perform division");
    System.out.println("Enter number 1:");
    int num1=sc.nextInt();
    System.out.println("Enter number 2:");
    int num2=sc.nextInt();
    try
    {
     int div=num1/num2;
     System.out.println("Result:"+div);
     System.out.println("End of try block");
    }
    catch(ArithmeticException e)
    {
     System.out.println(e);
    }
    finally
    {
     System.out.println("Finally block content");
     System.out.println("My code is safe from exception");
    }
    break;
   case 2:

    //ArrayOutOfBoundException
    System.out.println("Enter number of elements you want to store:");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the elements of the array:");
    for(int i=0;i<n;i++)
    {
     a[i]=sc.nextInt();
    }
    System.out.println("Array length:"+a.length);
    System.out.println("Array elements are:");
    for(int i=0;i<n;i++)
    {
     System.out.print(a[i]+" ");
    }
    try
    {
     System.out.println("\nEnter the position of the element to be accessed:");
     int p=sc.nextInt();
     a[p]=n;
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
     System.out.println("Array Index is Out Of Bounds");
    }
    break;
   case 3:
    System.out.println("Exiting....");
    break;
   default:
    System.out.println("Invalid choice");
    break;
   }
   System.out.println("Do you want to continue(y/n):");
   op=sc.next().toLowerCase().charAt(0);
   sc.nextLine();
 }
 while(op=='y'); 
	
}
}
	
