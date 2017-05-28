import java.io.*;
import java.lang.*;
import java.util.*;
public class LargestNumber {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		System.out.println("Enter the index value ");
		int k = in.nextInt();
		int[] nums = new int[] {10,30,50,20,35};
		for(Integer i: nums)
		{
			q.offer(i);
			if(q.size()> k)
			{
				q.poll();
			}
		}
		System.out.println(q.peek());
		
	}
}
