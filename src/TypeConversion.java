import java.io.*;
import java.util.*;
public class TypeConversion {
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		PrintStream o = new PrintStream (new File("A.txt"));
		
		int i= 10;
		System.setOut(o);
		double j = 3332.895;
		float k = (float) i;
		System.out.println("Value of Float " +k);
		byte b = (byte) j;
		j = j%256;
		System.out.println("valuse of Byte " + j);
		System.out.println(" Value of Byte " + b);
		FileInputStream fis = new FileInputStream("A.txt");
		FileOutputStream fos = new FileOutputStream("B.txt");
		int c ;
		while((c= fis.read()) != -1 )
		{
		

			fos.write(c);

		}
		fis.close();
		fos.close();
			
		
		
	}
}
