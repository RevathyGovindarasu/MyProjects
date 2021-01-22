package Leetcode;

public class PrintComplement {

	public static void main(String[] args) {
		int num=5;
		 String binaryofnum = Integer.toBinaryString(num);
	        char[] binaryArray = binaryofnum.toCharArray();
	        for(char i=0; i<binaryArray.length;i++)
	        {
	            if(binaryArray[i]=='1')
	            {
	                binaryArray[i]='0';
	            }
	            else
	            {
	                binaryArray[i]='1';
	            }
	        }
	        
	        String Complemented = binaryArray.toString();
	       System.out.println(Integer.parseInt(Complemented,2));  
	}

}
