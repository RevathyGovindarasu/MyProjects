package stringss;

public class reverse {

	public static void main(String[] args) {
		String input = "palind";
		
		String revers = reversal(input);
		if(revers.equals(input))
		{
			System.out.println("palindrome");
			
		}
		else
			System.out.println("not palindrome");
		
}
	
	public static String reversal(String input)
	{
		
		String output = null;
		
		if(input==null||input.isEmpty())
		{
			return "not";
		}
		else
		{//int n = input.length();
			 output = input.charAt(input.length()- 1)+reversal(input.substring(0,input.length()- 1));		
			 System.err.println("chaar at.." + input.charAt(input.length()-1));
			 System.err.println("substring.." + input.substring(0,input.length()-1));
			 
		}
		return output;
		
		/*	
		  if(input == null || input.isEmpty()){
	            return input;
	        }
	       
	        return input.charAt(input.length()- 1) + reversal(input.substring(0, input.length() - 1));
	    }*/
		
		
	}

}
