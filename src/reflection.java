import java.io.*;
import java.util.*;
import java.lang.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class reflection {
	private String s;
	public reflection()
	{
		s = " leetcode";
	}
	public  void method1()
	{
		System.out.println("The string is " + s);
	}
	private void method2(int i)
	{
		System.out.println("The integer value is " + i);
	}
	
	private void method3()
	{
		System.out.println("Private method is invoked");
	}
	public static void main(String[] args) throws Exception
	{
		reflection obj = new reflection();
		Class cls = obj.getClass();
		Constructor  cns = cls.getConstructor();
		
		Method[] methods = cls.getMethods();
		for(Method method: methods)
		{
		System.out.println(method.getName());	
		}
		Field method3 = cls.getDeclaredField("method3");
		method3.setAccessible(true);
	
		System.out.println(cls.getName() + cns.getName());
	}
	
	

}
