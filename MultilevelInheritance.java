package tutorials;
import java.util.Scanner;
class Vehicle
{
	String model;
	int year;
	void displaymodel()
	{
		System.out.println("\nModel of the vehicle:"+model);
	}
	void displayyear()
	{
		System.out.println("Year:"+year);
	}
}
class Car extends Vehicle
{
	int noOfDoors;
	void displaynoOfDoors()
	{
		System.out.println("No of doors:"+noOfDoors);
	}
}
class ElectricCar extends Car
{
	int battery;
	void displaybattery()
	{
		System.out.println("Battery Capacity:"+battery+" "+"kWh");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ElectricCar e=new ElectricCar();
		System.out.println("Enter the model of the vehicle:");
		e.model=sc.nextLine();
		System.out.println("Enter the year:");
		e.year=sc.nextInt();
		System.out.println("Enter the no of doors:");
		e.noOfDoors=sc.nextInt();
		System.out.println("Enter the battery capacity:");
		e.battery=sc.nextInt();
		e.displaymodel();
		e.displayyear();
		e.displaynoOfDoors();
		e.displaybattery();
		
	}

}
