import java.io.*;
import java.util.*;
import java.lang.*;

public class InstanceTest {
	
	public static boolean fun(Object obj, String c) throws ClassNotFoundException
	{
		boolean _isInstance = false;
		return Class.forName(c).isInstance(obj);
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		Integer i = new Integer(5);
		System.out.println(i instanceof Integer);
		boolean a = fun(i,"java.lang.Integer");
		System.out.println(a);
		final int j;
		j = 50;

		
		System.out.println(j);
	
	}

}
