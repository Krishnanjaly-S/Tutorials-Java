package oopj24csb47;
import java.io.*;

public class NewFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f=new File("sample.txt");
		f.createNewFile();
		System.out.println("File created successfully");
	}

}
