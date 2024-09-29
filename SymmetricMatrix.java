package tutorials;
import java.util.Scanner;
public class SymmetricMatrix 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the square matrix:");
		int size=sc.nextInt();
		System.out.println("Enter the elements of the matrix:");
		int flag=1;
		int[][] mat=new int[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix is:");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(mat[i][j]+"\t");
			}
			System.out.print("\n");
		}
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(mat[i][j]!=mat[j][i])
				{
					flag=0;
					break;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("Matrix is symmetric");
		}
		else
		{
			System.out.println("Matrix is not symmetric");
		}
	}
}