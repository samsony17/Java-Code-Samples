import java.io.*;
import java.util.*;
public class twoSumHashMap {

	public static void main(String[] args)
	{
       long start_time = System.nanoTime();
  	int [] nums = new int[] {2,14,15,30};
	int target = 29;
	int [] result = new int[2];
	result = twoSum(nums, target);
	 long end_time = System.nanoTime();
	long total_time = end_time - start_time;
	double seconds = (double) total_time/ 1000000000.0;
	System.out.println(seconds);
	}
	public static int[] twoSum(int[] nums, int target)
	{
		int[] result = new int[2];
		HashMap<Integer,Integer> hmap = new HashMap<Integer, Integer>();
		
		for(int i=0;i<nums.length;i++)
		{
			if(hmap.containsKey(target - nums[i]))
			{
				result[1] = i;
					result[0] = target- nums[i];
			}
			hmap.put(nums[i],i);
			
		}
		System.out.println(hmap.keySet());
		System.out.println(hmap.values());
		return result;
	}
}
