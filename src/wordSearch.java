import java.io.*;
import java.util.*;
public class wordSearch {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = in.nextLine();
		Set<String> wordDict = new HashSet<String>();
		wordDict.add("Sam");
		wordDict.add("Son");
		wordDict.add("leet");
		wordDict.add("code");
		boolean breakable = wordBreak(s,wordDict);
		System.out.println(breakable);
		
	}
 
	public static boolean wordBreak(String s, Set<String> wordDict)
	{
		boolean [] dp = new boolean [s.length()+1];
		
		dp[0] = true;
		for(int i=0;i<=s.length();i++)
		{
			for(int j=0;j<i;j++)
			{
				if(dp[j] && wordDict.contains(s.substring(j, i)))
				{
					dp[i] = true;
					break;
				}
					
						
			}
		}
		
		return dp[s.length()];
	}

}
