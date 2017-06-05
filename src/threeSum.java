import java.io.*;
import java.util.*;
public class threeSum {
	public static void main(String[] args)
	{
		int[] nums = new int[]{12,14,15,100};
		int target = 127;
		List<List<Integer>> result = threeSumAdd(nums, target);
		System.out.println(result);
	}

 public static List<List<Integer>> threeSumAdd( int[] nums, int target)
 {
	 List<List<Integer>> result = new ArrayList<>();
	 Arrays.sort(nums);
	 for(int i=0;i<nums.length;i++)
	 {
		 if(i  >0 && nums[i] == nums[i-1])
		 {
			 continue;
		 }
		 int j = i+1;
		 int k = nums.length-1 ;
		  target -=  nums[i];
		  while(j<k)
		  {
			  if(nums[j] + nums[k] == target)
			  {
				  ArrayList<Integer> temp = new ArrayList<Integer>();
				  temp.add(nums[i]);
				  temp.add(nums[j]);
				  temp.add(nums[k]);
				  result.add(temp);
				  j++;
				  k--;
				  while(j<k && nums[j] == nums[j-1]) j++;
				  while(j<k && nums[k] == nums[k+1]) k--;
			  }
			  else if(nums[j] + nums[k]> target)
			  {
				  k--;
			  }
			  else
			  {
				  j++;
			  }
		  }
		 
	 }
	 return result;
 }
}
