package Leetcode;

public class JumpGame {

	    public boolean canJump(int[] nums) {
	        int lastPos = nums.length - 1;
	        for (int i = nums.length - 1; i >= 0; i--) {
	            if (i + nums[i] >= lastPos) {
	            	System.out.println(i +" plus "+ nums[i]+" is.. "+ (i+nums[i]));
	            	System.out.println(i+nums[i] +" is >= lastposition..."+ lastPos);
	                lastPos = i;
	            }
	        }
	        return lastPos == 0;
	    }
		
	public static void main(String[] args) {
		
		JumpGame j = new JumpGame();
		int[] arr=new int[] {5,4,3,2,1};
		System.out.println(j.canJump(arr));

	}

}
