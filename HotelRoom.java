package tutorials;
import java.util.Scanner;
public class HotelRoom 
{
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter slot number:");
	int slot=sc.nextInt();
	try
	{
		if(slot>0)
		{
			System.out.println("Registered Successfully!");
		}
		else
		{
			throw new InvalidReservationException("Invalid!");
		}
	}
	catch(InvalidReservationException e)
	{
		System.out.println(e.getMessage());
	}
}

}
