package Leetcode;

public class StraightlineGraph {
	    int commonSlope;
	    public boolean checkStraightLine(int[][] coordinates) {
	    	 
	        //calculating slope between first two coordinates
	       float commonSlope= (float)(coordinates[1][1]-coordinates[0][1])/(float)(coordinates[1][0]-coordinates[0][0]);
	        
	        //calculating slope between first and other coordinate and compare 
	         for(int i=2;i<coordinates.length;i++)
	        {
	            float slope = (float)(coordinates[i][1]-coordinates[0][1])/(float)(coordinates[i][0]-coordinates[0][0]);
	            if(slope!=commonSlope) return false;
	        }
	        return true;
	    }
	

	public static void main(String[] args) {
		StraightlineGraph checkStraightLine=new StraightlineGraph();
        boolean result= checkStraightLine.checkStraightLine(new int[][]{{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}});
       System.out.println(result);

	}

}
