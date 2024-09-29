package boxdemo;
class Box
{
	double width;
	double height;
	double depth;
	double volume()
	{
		return(width*height*depth);
	}



	public static void main(String[] args) 
	{		// TODO Auto-generated method stub
		Box mybox=new Box();
		mybox.width=10;
		mybox.height=20;
		mybox.depth=15;
		double vol=mybox.volume();
		System.out.println("Volume is "+vol);
}
}


