import java.io.*;
import java.util.*;
import java.lang.*;
public class StringReverse {
	public static void main(String[] args)
	{
		String s ="Samson";
		String[] ss = s.split("");
		String a ="";
		for(int i=s.length()-1 ;i>=0;i--)
		{
			a = a+ss[i];
		}
		System.out.println(a);
		
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		String newString = sb.reverse().toString();
		System.out.println("new String " + newString);
		
		System.out.println("String reverse using Recursion");
		System.out.println(reverse(s));
	}
	public static String reverse(String s)
	{
		if(s.length()<2)
		{
			return s;
		}
		
		int index = s.length()-1;
		
		
		return s.charAt(index)+reverse(s.substring(0, index));
	}

}
