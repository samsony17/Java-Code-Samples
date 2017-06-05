package managementsoftware;
import java.io.*;
import java.util.*;
import java.lang.*;
public class ReverseString {
	public static String ReverseString(String s)
	{
		if(s.length()<2)
		{
			return s;
		}
		else
		{
			int endIndex = s.length()-1;
			return s.charAt(endIndex)+ ReverseString(s.substring(0, endIndex));
		}
	}
public static void main(String[] args)
{
	Scanner in = new Scanner (System.in);
	System.out.println("Enter the String ");
	String s = in.nextLine();

	String result = ReverseString(s);
	System.out.println("Reversed String is " + result);
	
    StringBuilder builder = new StringBuilder(s);
    String reverseString = builder.reverse().toString();
    System.out.println("InBuilt String reverse " + reverseString);
}
	
}
