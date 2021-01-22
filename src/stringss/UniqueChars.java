package stringss;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UniqueChars {

	
	static Boolean uniqchar(String str)
	{
		
		
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		Boolean result=false;
		for(int i=0;i<ch.length-1;i++)
		{
			System.out.println(" "+i);
			if(ch[i]==ch[i+1])
			{
				result= true;
				System.out.println(" "+i);
			}
			
			
		}
		return result;
	}
	
	static void permutation (String str1, String str2)
	{
		char[] s = str1.toCharArray();
		Arrays.sort(s);
		char[] t = str2.toCharArray();
		Arrays.sort(t);
		
		for(int i=0; i<str1.length();i++)
		{
			if(s[i]!=t[i])
			{
				System.out.println("strings are not permuted");
			}
			else
			{
				System.out.println("strings are permuted");
			}
		}
		
	}
	
	static void repl(String samp)
	{
		String res = samp.replaceAll("\\s", "%20");
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		String str = "suces";
		if(uniqchar(str))
		{
			System.out.println("string repeats");
		}
		else
		{
			System.out.println("No repeated char");
		}
		
		String sp="let me do this";
		repl(sp);
		String str2 = "sseua";
		permutation(str,str2);
	}

}
