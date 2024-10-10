package oopj24csb47;
abstract class Animal
{
	protected int legs;
	protected Animal(int legs)
	{
		this.legs=legs;
	}
	void walk()
	{
		System.out.println("This animal walks by "+legs+" legs");
	}
	abstract void eat();
}
class Spider extends Animal
{
	Spider(int legs)
	{
		super(legs);
	}
	void eat()
	{
		System.out.println("Spider eats insects");
	}
}
interface Pet
{
	void getName();
	void setName(String name);
	void play();
}
class Cat extends Animal implements Pet
{
	String name;
	Cat(String name,int legs)
	{
		super(legs);
		this.name=name;
	}
	public void setName(String name)
	{
		System.out.println("This cat's name is "+name);
	}
	public void play()
	{
		System.out.println("Cat play with rats");
	}
	void eat()
	{
		System.out.println("Cat eats fishes");
	}
	public void getName()
	{
		System.out.println("This cat's name is "+name);
	}
}
class Fish extends Animal implements Pet
{
	String name;
	Fish(String name,int legs)
	{
		super(legs);
		this.name=name;
	}
	public void setName(String name)
	{
		System.out.println("This fish's name is "+name);
	}
	void eat()
	{
		System.out.println("Fish eats plants");
	}
	public void getName()
	{
		System.out.println("This fish's name is "+name);
	}
	public void walk()
	{
		System.out.println("Fish has no legs");
	}
	public void play()
	{
		
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("FISH");
			Fish f=new Fish("Mimi",0);
			f.getName();
			f.eat();
			f.walk();
			f.setName("Momo");
			System.out.println("\nSPIDER");
			Spider s=new Spider(8);
			s.eat();
			s.walk();
			System.out.println("\nCAT");
			Cat c=new Cat("Fluffy",4);
			c.getName();
			c.walk();
			c.play();
			c.eat();
			c.setName("Moose");
			
	}

}
