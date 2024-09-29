package tutorials;
import java.util.Scanner;
public class IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the identity matrix:");
        int size=sc.nextInt();
        System.out.println("The identity matrix is:");
        int[][] mat=new int[size][size];
        for(int i=0;i<size;i++)
        {
        	for(int j=0;j<size;j++)
        	{
        		if(i==j)
        		{
        			mat[i][j]=1;
        		}
        		else
        		{
        			mat[i][j]=0;
        		}
        		System.out.print(mat[i][j]+"\t");
        	}
        	System.out.print("\n");
        }
	}

}
