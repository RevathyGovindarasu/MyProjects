package Leetcode;

import java.util.HashMap;

//subarray with equal no of 0s and 1s
public class contagiousArray {

	public void contag() {
		
		int[] nums = new int[] {0,1,1,0,1,1,1,0};
		  HashMap<Integer, Integer> bin = new HashMap<>();
		  
	        for(int i:nums)
	        {
	            bin.put(i,bin.containsKey(i)?bin.get(i)+1:1);
	        }
	        
	        if(!bin.containsKey(0)|| !bin.containsKey(1))
	        {
	        	System.out.println("0");
	        }
	        else
	    System.out.println(bin.get(0)>bin.get(1)?2*bin.get(1):2*bin.get(0));

	}
	
	public static void main(String[] args)
	{
		
		int[] numsArray = new int[] {1,0,1,0,1,0};
		contagiousArray ca = new contagiousArray();
		int result = ca.findMaxLength(numsArray);
		System.out.println(result);
		
	}
	
	
	
	public int findMaxLength(int[] nums) 
	{
		int start=0, end=1,maxlength=0;
		for(start=0;start<nums.length;start++)
		{
			for(end = start;end<nums.length;end++)
			{
				if(isContag(start, end, nums))
				{
						maxlength = Math.max(maxlength, end-start);
				}
			}
		}
		return maxlength;
    }

	public Boolean isContag(int i, int j, int[] arr)
	{
		int ans = 0;
		for(int x=i;x<j;x++)
		{
			if(arr[x]==0) ans++;
			else if(arr[x]==1) ans--;
		}	
		if(ans==0) return true;
		else return false;
	}
}
