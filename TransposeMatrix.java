package tutorials;
import java.util.Scanner;
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no of rows of the matrix:");
      int row=sc.nextInt();
      System.out.println("Enter the no of columns of the matrix:");
      int col=sc.nextInt();
      System.out.println("Enter the elements:");
      int mat[][]=new int[row][col];
      for(int i=0;i<row;i++)
      {
    	  for(int j=0;j<col;j++)
    	  {
    		  mat[i][j]=sc.nextInt();
    	  }
      }
      System.out.println("The matrix is:");
      for(int i=0;i<row;i++)
      {
    	  for(int j=0;j<col;j++)
    	  {
    		  System.out.print(mat[i][j]+"\t");
    	  }
    	  System.out.print("\n");
      }
      int transpose[][]=new int[col][row];
      for(int i=0;i<row;i++)
      {
    	  for(int j=0;j<col;j++)
    	  {
    		  transpose[j][i]=mat[i][j];
    	  }
      }
      System.out.println("The transpose matrix is:");
      for(int i=0;i<col;i++)
      {
    	  for(int j=0;j<row;j++)
    	  {
    		  System.out.print(transpose[i][j]+"\t");
    	  }
    	  System.out.print("\n");
      }
	}

}


