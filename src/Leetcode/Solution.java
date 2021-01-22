package Leetcode;

import java.util.Stack;

//"static void main" must be defined in a public class.
class Solution {
 public boolean backspaceCompare(String S, String T) {
     String one = afterString(S);
     String two = afterString(T);
     return one.equals(two);
     
 }
 
 public String afterString(String raw)
 {
     Stack result = new Stack();
     for(char c:raw.toCharArray())
     {
         if(c=='#' && !result.empty())
         result.pop();
         else
             result.push(c);
     }
     return String.valueOf(result);
     
 }

 public static void main(String[] args) {
     System.out.println("Hello World!");
     Solution sol = new Solution();
     Boolean result = sol.backspaceCompare("y#fo##f","y#f#o##f");
     System.out.println(result);
     
 }
}