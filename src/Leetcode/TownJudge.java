package Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TownJudge {

	
     
	    public int findJudge(int N, int[][] trust) {
	    	 Map<Integer,Integer> map = new HashMap<>();
	         if(trust.length==0)
	             return N;
//	          if(trust.length==1)
//	             return trust[0][1];
	         for(int k=0; k<trust.length;k++)
	             map.put(trust[k][1],N);
	         for(int i=0;i<trust.length;i++)
	         {
	       //      if(map.containsKey(trust[i][1]))
	                map.put(trust[i][1],map.get(trust[i][1])-1); 
	         }
	         for(Map.Entry<Integer,Integer> entry : map.entrySet())
	         {
	             if(entry.getValue()==0)
	                 return entry.getKey();
	         }
	         return -1; 
	    }

	    
	    public int findJudges(int N, int[][] trust) {
	        Set<Integer> set = new HashSet<>();
	        
	        for(int i=0;i<trust.length;i++)
	        {
	            if(set.contains(trust[i][0])&& !set.isEmpty())
	               set.remove(trust[i][0]); 
	            if(i!=trust.length-1)
	               set.add(trust[i][1]);
	        }
	        Iterator<Integer> ite = set.iterator();
	        if(ite.hasNext()) return ite.next();
	               else
	               return -1;
	    }

	
	public static void main(String[] args) {
		int[][] arr =new int[][] {{1,2}};
		TownJudge t = new TownJudge();
		System.out.println(t.findJudge(2, arr));
	}

}
