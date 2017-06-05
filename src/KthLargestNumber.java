import java.io.*;
import java.util.*;
import java.lang.*;
public class KthLargestNumber {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = in.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the numbers");
		for(int i=0;i<size;i++)
		{
			nums[i] = in.nextInt();
		}
		System.out.println("Enter the index of Largest Number");
        int k = in.nextInt();
        int largest = Largest(nums, k);
        System.out.println("Kth Largest using PriorityQueue " + largest);
		Arrays.sort(nums);
		System.out.println(nums[k]);
	}
	
	
	public static int Largest(int[] nums, int k)
	{
       PriorityQueue<Integer> p = new PriorityQueue<>();
       for(Integer i: nums)
       {
    	   p.offer(i);
       
       if(p.size() > k)
       {
    	   p.poll();
       }
		
       }
		return p.peek();
	}
	
}
