package boxdemo;

public class BoxDemo1 {

	public static void main(String[] args) 
	{		// TODO Auto-generated method stub
		Box mybox=new Box();
		mybox.width=10;
		mybox.height=20;
		mybox.depth=60;
		double vol=mybox.volume();
		System.out.println("Volume is "+vol);
}
}