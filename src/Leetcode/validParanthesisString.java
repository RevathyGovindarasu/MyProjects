package Leetcode;

import java.util.Stack;

public class validParanthesisString {

    public boolean checkValidString(String s) {
        
        Stack<Integer> paran = new Stack<>();
        Stack<Integer> ast = new Stack<>();
       
        for(int i=0;i<s.length();i++)
        {
                 if(s.charAt(i)=='(')  paran.push(i);
            else if(s.charAt(i)=='*')  ast.push(i);
                 
            else
            {
                if(!paran.empty())  paran.pop();
                else if(!ast.empty())  ast.pop();
                else return false;
            }
                 
        }
        
        System.out.println("now the stack is..");
        System.out.println("paran stack.... "+paran);
        System.out.println("asterisk stack.."+ast);
        while(!paran.empty() && !ast.empty())
        {
            if(ast.pop()<paran.pop())  return false;
            System.out.println("now the stack is..");
            System.out.println("paran stack.... "+paran);
            System.out.println("asterisk stack.."+ast);
           
        }
        
        return paran.empty();
        
    }
    
    public boolean checkValidString2(String s) {
        int lo = 0, hi = 0;
        for (char c: s.toCharArray()) {
        	  System.out.println("iterating..."+c);
            lo += c == '(' ? 1 : -1;
            System.out.println(lo);
            hi += c != ')' ? 1 : -1;
            System.out.println(lo);
            if (hi < 0) break;
            lo = Math.max(lo, 0);
        }
        return lo == 0;
     }
    
	public static void main(String[] args) {
		
		String s = "(())((())()()(*)(*()(())())())()()((()())((()))(*";
		String s2 = "()*(";
		validParanthesisString v=new validParanthesisString();
		System.out.println("The string is valid... "+v.checkValidString2(s2));

	}

}
