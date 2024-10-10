package file;
import java.io.*;
public class NewFileCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File f=new File("Binary1.bin");
			f.createNewFile();
			System.out.println("File created successfully.");
			String content="Welcome to Java programming";
			File b1=new File("Binary1.bin");
			FileOutputStream fin=new FileOutputStream(b1);
			fin.write(content.getBytes());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}