package Leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Trie {

	    Set<String> tri;
	    Iterator<String> ite;
	    /** Initialize your data structure here. */
	    public Trie() {
	        tri = new HashSet<>();
	         ite = tri.iterator();
	    }
	    
	    /** Inserts a word into the trie. */
	    public void insert(String word) {
	        tri.add(word);
	    }
	    
	    /** Returns if the word is in the trie. */
	    public boolean search(String word) {  
	     while(ite.hasNext())  
	     {
	         if(word.equals(ite.next())) return true;
	     }
	        return false;
	    }
	    
	    /** Returns if there is any word in the trie that starts with the given prefix. */
	    public boolean startsWith(String prefix) {
	        while(ite.hasNext())  
	        {
	            String a = ite.next();
	         if(a.startsWith(prefix)) return true;
	        }
	        return false;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie obj = new Trie();
		  obj.insert("apple");
		  boolean param_2 = obj.search("apple");
		  System.out.println(param_2);
		 boolean param_3 = obj.startsWith("app");
		 System.out.println(param_3);

	}

}
