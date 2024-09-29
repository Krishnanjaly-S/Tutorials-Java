package tutorials;
import java.util.Scanner;
import evenpackage.Even;
public class PackageEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter a number:");
		num=sc.nextInt();
		Even.even(num);
	}

}
