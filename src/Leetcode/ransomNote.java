package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ransomNote {

	 public boolean canConstruct(String ransomNote, String magazine) {
	        
	        List<Character> mag = new ArrayList<>();
	        for(char i:magazine.toCharArray()) 
	        mag.add(i);
	        
	        for(char j:ransomNote.toCharArray())
	        {
	            if(mag.isEmpty()) return false;
	            else
	            {
	            	 if(mag.contains(j))
	                     mag.remove(Character.valueOf(j));
	                     else
	                         return false;
	            }
	        }
	        return true;
	    }
	 
	 public static void main(String[] args)
	 {
		 ransomNote ro = new ransomNote();
		System.out.println(ro.canConstruct("aaaa","aaaab"));
	 }
}
