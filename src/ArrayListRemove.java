import java.io.*;
import java.util.*;
import java.lang.*;
public class ArrayListRemove {
public static void main(String[] args)
{
	List list = new ArrayList<Integer>();
	list.add(1);
	list.add(5);
	list.add(10);
	list.add(30);
	list.add(50);
	list.add(2);
	System.out.println("Before removing " + list);
	list.remove(0);
	list.remove(3);
	list.remove(new Integer(2));
	System.out.println("After removing" + list);
	Iterator itr = list.iterator();
	while(itr.hasNext())
	{
		int x = (Integer)itr.next();
		if(x<10)
		{
			itr.remove();
		}
	} 	
	
	System.out.println("Modified List" + list);
}
}
