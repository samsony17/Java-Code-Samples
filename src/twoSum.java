import java.io.*;
import java.util.*;
public class twoSum {
	public static void main(String[] args)
	{
		 long start_time = System.nanoTime();
		int [] nums = new int[] {2,14,15,30};
		int target = 29;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=1;j<nums.length;j++)
			{
				if(nums[i]+ nums[j] == target)
				{
					if(i<j)
					{
					System.out.println("Indexes are " + i + j);
					break;
					}
				}
			}
		}
		 long end_time = System.nanoTime();
		long total_time = end_time - start_time;
		double seconds = (double)total_time / 1000000000.0 ;
		System.out.println(seconds);
	}
}
