package Leetcode;

public class lcd 
	{ 
	  
	  public int lcs(String s, String t) {
		  int[][] match = new int[s.length() + 1][t.length() + 1];
		    for (int i = 1; i <= s.length(); i++) {
		      for (int j = 1; j <= t.length(); j++) {
		        if (s.charAt(i - 1) == t.charAt(j - 1)) {
		          match[i][j] = match[i - 1][j - 1] + 1;
		        } else {
		          match[i][j] = Math.max(match[i - 1][j], match[i][j - 1]);
		        }
		      }
		    }
		    return match[s.length()][t.length()];
		          
		        }
		    
		    
		  
	  public static void main(String[] args) 
	  { 
	    lcd lcs = new lcd(); 
	    String s1 = "abcde"; 
	    String s2 = "accd"; 
	  
	  
	    System.out.println("Length of LCS is" + " " + 
	                                  lcs.lcs( s1,s2 ) ); 
	  } 
	
}
