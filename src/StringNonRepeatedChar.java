import java.io.*;
import java.util.*;
import java.lang.*;

public class StringNonRepeatedChar {
	public static void NonRepeated(String s)
	{
		String[] ss = s.split("");
	    HashMap<String,Integer> hmap = new HashMap<String, Integer>();
	    for(String i:ss)
	    {
	    	if(hmap.containsKey(i))
	    	{
	    	   int count = 1;
	    		hmap.put(i, hmap.get(i)+1);
	    	}
	    	else
	    	{
	    		if(!hmap.containsKey(i))
	    		{
	    			hmap.put(i, 1);
	    		}
	    	}
	    }
	    Set<String> a = hmap.keySet();
	for(String i :a)
	{
		if(hmap.get(i) ==1)
		{
			
			System.out.println(i);
		}
	}

	  
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = in.nextLine();
		NonRepeated(s);
	}
}
