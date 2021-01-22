package Leetcode;

import java.util.Arrays;

public class LastStone {
	
	public static void main(String[] ars)
	{
	int[] stones = new int[] {2,7,4,1,8,1};
	Arrays.sort(stones);
	
	 for(int i=stones.length-1;i>0;i--)
	    {
		 System.out.println("before smashing stones...");
		 for(int j = stones.length-1; j>=0;j--)
		 {
		    System.out.println(stones[j]);
		 }
	        stones[i-1] = Math.abs(stones[i]-stones[i-1]);
	        System.out.println("after smashing stones...");
	        for(int j = stones.length-1; j>=0;j--)
			 {
	    	System.out.println(stones[j]);
			 }
	        Arrays.sort(stones);
	    }
	       
	   
	System.out.println("aswer  is.."+stones[0]);
	
	}
}
