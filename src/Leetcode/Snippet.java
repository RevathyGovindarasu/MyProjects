package Leetcode;

public class Snippet {
	public String stringShift(String s, int[][] shift) {
		        int totalShift=0;
		         String result = "";
		        for(int[] value : shift)
		        {
		            if(value[0]==0)
		            {
		                totalShift-=value[1];
		            }
		            else if(value[0]==1)
		            {
		                totalShift+=value[1];
		            }
		        }
		            int stringSize = s.length();
		            if(totalShift<0)                            //left shift
		            {
		                 totalShift=Math.abs(totalShift)%stringSize;
		                result = s.substring(totalShift)+s.substring(0,totalShift);           
		            }
		            else                                        //right shift
		            {
		                 totalShift=totalShift%stringSize;           
		                result = s.substring(stringSize-totalShift)+s.substring(0,stringSize-totalShift);
		            }	        
		        return result;
		    }
}

