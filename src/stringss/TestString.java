package stringss;

public class TestString {

	public static void main(String args[])
	{
		String sample = "succe,ss123";
		String word = "potsttter", anagram = "spottttss";
		Boolean flag=true;
		System.out.println(sample.intern());
		System.out.println(sample.codePoints());
		System.out.println(sample.getBytes());
		System.out.println(sample.hashCode());
		System.out.println(sample.join(",", "luck"));
		
		 if(word.length() != anagram.length()){
	          flag = false;
	        }
	       
	        char[] chars = word.toCharArray();
	       
	        for(char c : chars){
	            int index = anagram.indexOf(c);
	            if(index != -1){
	                anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length());
	            }else{
	                flag= false;
	            }           
	        }
	       
	        if( anagram.isEmpty()&&(flag==true))
	        {
	        	
	        	System.out.println("words are anagram");
	        }
	        else
	        {
	        	System.out.println("not anagram");
	        }
	        
	    }
	}

