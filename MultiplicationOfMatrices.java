package oopj24csb47;
import java.util.*;
public class MultiplicationOfMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no of rows in the first matrix:");
     int row1=sc.nextInt();
     System.out.println("Enter the no of columns in the first matrix:");
     int col1=sc.nextInt();
     System.out.println("Enter the no of rows in the second matrix:");
     int row2=sc.nextInt();
     System.out.println("Enter the no of columns in the second matrix:");
     int col2=sc.nextInt();
     int[][] mat1=new int[row1][col1];
     System.out.println("Enter the elements of first matrix:");
     for(int i=0;i<row1;i++)
     {
    	 for(int j=0;j<col1;j++)
    	 {
    		 mat1[i][j]=sc.nextInt();
    	 }
     }
     int[][] mat2=new int[row2][col2];
     System.out.println("Enter the elements of second matrix:");
     for(int i=0;i<row2;i++)
     {
    	 for(int j=0;j<col2;j++)
    	 {
    		 mat2[i][j]=sc.nextInt();
    	 }
     }
     System.out.println("The first matrix is:");
     for(int i=0;i<row1;i++)
     {
    	 for(int j=0;j<col1;j++)
    	 {
    		 System.out.print(mat1[i][j]+"\t");
    	 }
    	 System.out.print("\n");
     }
     System.out.println("The second matrix is:");
     for(int i=0;i<row2;i++)
     {
    	 for(int j=0;j<col2;j++)
    	 {
    		 System.out.print(mat2[i][j]+"\t");
    	 }
    	 System.out.print("\n");
     }
     if(col1!=row2)
     {
    	 System.out.println("Matrix multiplication is not possible");
    	 return;
     }
     else
     {
    	 System.out.println("The product of the matrix is:");
         int[][] mat3=new int[row1][col2];
         for(int i=0;i<row1;i++)
         {
        	 for(int j=0;j<col2;j++)
        	 {
        		 for(int k=0;k<col1;k++)
        		 {
        			 mat3[i][j]+=mat1[i][k]*mat2[k][j];
        		}
        	}
         }
         for(int i=0;i<row1;i++)
         {
        	 for(int j=0;j<col2;j++)
        	 {
        		 System.out.print(mat3[i][j]+"\t");
        	 }
    		 System.out.print("\n");
      }
        
     }
     }
}
