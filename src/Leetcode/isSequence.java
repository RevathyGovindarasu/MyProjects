package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class isSequence {

	public static void main(String[] args)
	{
		isSequence ss = new isSequence();
		Boolean res = ss.isSubsequence("", "ahbgdc");
		System.out.println(res);
		
	}
	 public boolean isSubsequence(String s, String t)
	 {
	        
	        Queue<Character> que = new LinkedList<Character>();
	        
	        if(s==""||t=="") return false;
	        for(char c:s.toCharArray())
	        {
	            que.offer(c);
	        }
	        for(char d:t.toCharArray())
	        {
	            if(que.peek()==d)
	                que.poll();
	        }
	        return que.isEmpty();
	    }
}
