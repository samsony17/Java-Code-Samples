import java.io.*;
import java.util.*;
import java.lang.*;
public class StackExample  {

	public static void main(String[] args)
	{
		Stack s = new Stack();
		s.push(1);
		s.push(20);
		s.push(100);
		int count = 0;
		while(s.isEmpty() != true)
		{
			
			if(s.pop() != null)
			{
				count ++;
			}
		}
	
		System.out.println(count);
	}
}
