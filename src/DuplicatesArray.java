import java.io.*;
import java.util.*;
import java.lang.*;
public class DuplicatesArray {
	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(3);
		arr.add(4);
		arr.add(2);
		arr.add(1);
		arr.add(2);
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
	   for(int i=0;i<arr.size();i++)
		{
			if(!(hmap.containsValue(arr.get(i))))
			hmap.put(i,arr.get(i));
			//else
				//System.out.println(arr.get(i));
		}
		
	   Set<Integer> set = new HashSet<Integer>();
	   for(int i=0;i<arr.size();i++)
	   {
		   if(!(set.contains(arr.get(i))))
				   {
			   set.add(arr.get(i));
				   }
		   else
			   System.out.println(arr.get(i));
	   }

	}

}
