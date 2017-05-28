import java.io.*;
import java.util.*;
import java.lang.*;
public class StringSwapWithOutTemp {
	public static void main(String[] args)
	{
		String s="Samson";
		String a = "Yerraguntla";
		System.out.println("Strings before swap " +" s: "+ s+ " a: " + a);
		s = s+a ;
		a= s.substring(0, s.length()-a.length());
		s= s.substring(a.length());
		System.out.println("Strings after swap "+ "s: "+s +" a: "+a);
	}

}
