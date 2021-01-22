package Leetcode;

public class productofArrayExceptSelf {
	
	 public int[] productExceptSelf(int[] nums) {
	        int total=1,countZero = 0;
	        for(int i:nums)
	        {
	        	if(i==0)
	        		countZero++;
	        	else total=total*i;
	        }
	        for(int j=0;j<nums.length;j++)
	        {
	        	if(countZero==nums.length)
	        	{
	        		nums[j]=0;
	        	}
	        	else if(countZero>0)
	        	{
	        		if(nums[j]!=0)
	        		nums[j]=0;
	        		else
	        		nums[j]=total;
	        	}
	        	else
	        	{
	            nums[j]=total/nums[j];
	        	}
	        }
	        
	        return nums;
	    }
	 
	 public static void main(String[] args)
	 {
		 productofArrayExceptSelf pd = new productofArrayExceptSelf();
		 int[] arr = new int[] {0,0};
		 System.out.println("the result array is...");
		 arr=pd.productExceptSelf(arr);
		 for(int k=0;k<arr.length;k++)
		 {
			 System.out.print(arr[k]+",");
		 }
	 }

}
