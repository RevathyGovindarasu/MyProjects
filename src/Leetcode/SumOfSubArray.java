package Leetcode;

import java.util.HashMap;

public class SumOfSubArray {
	
	public int subarraySum(int[] nums, int k) {
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(sumOfSubarray(nums,i,j)==k)
                 result++;
            }
        }
        return result;
    }
    
     int sumOfSubarray(int[] arr, int si, int ei)
        {
            int sum=0;
            while(si<=ei)
            {
                sum+=arr[si];
                si++;
            }
         return sum;
        }
     public int subarraySumEqualsK(int[] nums, int k) {
    	    HashMap<Integer, Integer> map = new HashMap<>();
    	    map.put(0, 1);
    	 
    	    int count = 0;
    	    int sum = 0;
    	 
    	    for(int i=0; i<nums.length; i++)
    	    {
    	        sum += nums[i];
    	        count += map.getOrDefault(sum-k, 0);
    	        map.put(sum, map.getOrDefault(sum,0)+1);
    	    }
    	 
    	    return count;
    	    }
    	
     public static void main(String[] args)
     {
    	 SumOfSubArray s =new SumOfSubArray();
    	 int[] arra = new int[] {1,1,2,1,1};
    	int res = s.subarraySumEqualsK(arra,2);
    	System.out.println(res);
     }

}
