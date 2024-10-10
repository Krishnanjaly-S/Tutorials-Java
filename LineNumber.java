package file;
import java.io.*;
public class LineNumber {

	public static void main(String[] args) {
		int i=0;
		try
		{
			File f=new File("Line.txt");
			FileInputStream fin=new FileInputStream(f);
			BufferedReader br=new BufferedReader(new InputStreamReader(fin));
			String line;
			int lineno=1;
			while((line=br.readLine())!=null)
			{
				System.out.println(lineno+":"+line);
				lineno++;
			}
		}
		catch(Exception e)
		{
			System.out.println("An error occured:"+e.getMessage());
		}
	}

}
