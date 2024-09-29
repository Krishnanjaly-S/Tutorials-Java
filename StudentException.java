package tutorials;
import java.util.Scanner;
public class StudentException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the score of the student:");
		int score=sc.nextInt();
		try
		{
			if(score>0 && score<=100)
			{
				System.out.println("The score of the student is "+score);
			}
			else
			{
				throw new InvalidScoreException("Score must be between 0 and 100");
			}
		}
		catch(InvalidScoreException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
