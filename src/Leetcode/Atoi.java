package Leetcode;

//"static void main" must be defined in a public class.
public class Atoi {
 public static int myAtoii(String str) {
	 int result = 0;
     int i=0;
     int sign = 1;
     
     str = str.trim().replaceAll("()+","");
     
     if(str.length()==0)
     {
         return result;
     }
     
     if(str.charAt(i)=='-'||str.charAt(i)=='+')
     {
         sign = 1-2*(str.charAt(i)=='-'?1:0);
         i++;
     }
     if(str.length()>i)
     {
      if (!Character.isDigit(str.charAt(i)))
     {
         return result;
     }
         
     else
     {
     for(;i<str.length();i++)
     {
         if(Character.isDigit(str.charAt(i)))
         result = result*10+Character.getNumericValue(str.charAt(i));
       else
       {
           return result*sign;
       }
         if (result >= Integer.MAX_VALUE / 10  && str.charAt(i) - '0' > 7)
      {
          if(sign==-1)
          {
              return Integer.MIN_VALUE; 
          }
          else
          {
              return Integer.MAX_VALUE;
          }
      }
         
     }
     }
     return result*sign;
     }  
     else return result*sign;
 }

 public static void main(String[] args) {
     System.out.println("output is  "+myAtoii("2147483645"));
     //myAtoi("42");
 }
}