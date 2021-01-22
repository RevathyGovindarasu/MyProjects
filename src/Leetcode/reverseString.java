package Leetcode;

public class reverseString {
	public static void main(String[] args)
	{
		char[] s= {'h','e','l','l','o'};
		 int l = s.length-1;
	        char temp;
	        for(int i=0;i!=l;i++,l--)
	        {
	            temp = s[i];
	            s[i] = s[l];
	            s[l] = temp;
	        }
	        System.out.println(s);
	}

}
