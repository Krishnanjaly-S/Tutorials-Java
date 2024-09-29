package tutorials;
import java.util.Scanner;
public class ScalarMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no of rows in the matrix:");
     int row=sc.nextInt();
     System.out.println("Enter the no of columns in the matrix:");
     int col=sc.nextInt();
     int[][] mat=new int[row][col];
     System.out.println("Enter the elements in the matrix:");
     for(int i=0;i<row;i++)
     {
  	   for(int j=0;j<col;j++)
  	   {
  		   mat[i][j]=sc.nextInt();
  	   }
     }
     System.out.println("The Matrix is:");
     for(int i=0;i<row;i++)
     {
  	   for(int j=0;j<col;j++)
  	   {
  		   System.out.print(mat[i][j]+"\t");
  	   }
  	   System.out.print("\n");
     }
     System.out.println("Enter the scalar value:");
     int scalar=sc.nextInt();
     System.out.println("The resulting matrix is:");
     for(int i=0;i<row;i++)
     {
    	 for(int j=0;j<col;j++)
    	 {
    		 mat[i][j]=scalar*mat[i][j];
             System.out.print(mat[i][j]+"\t");
    	 }
    	 System.out.print("\n");
     }
	}

}
