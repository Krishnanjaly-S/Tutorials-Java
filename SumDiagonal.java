package tutorials;
import java.util.Scanner;
public class SumDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of square matrix:");
        int size=sc.nextInt();
        int[][] mat=new int[size][size];
        System.out.println("Enter the elements:");
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
		int d1=0,d2=0;
		for(int i=0;i<size;i++)
		{
			d1=d1+mat[i][i];
			d2=d2+mat[i][size-i-1];
		}
		System.out.println("The sum of the first diagonal is"+" "+d1);
		System.out.println("The sum of the second diagonal is"+" "+d2);
	}

}
