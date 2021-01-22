package Leetcode;

public class HappyNumber {
	
	public boolean isHappy(int n) {
		System.out.println("isHappy method..."+n);
        int result=10;
        while(result!=1&&result!=4)
        {
        result = getsum(n); 
        n=result;
        }
         if(result==1)
        {
            return true;
        }
        else
        {
        return false;
        }
       
    }
    
    int getsum(int n)
    {
        int sum=0;
        while(n>0)
        {
           sum+=(n%10)*(n%10);
           n=n/10;
          
        }
        System.out.println("the sum now is..."+sum);
        return sum;
    }       

    public static void main(String[] args)
    {
    	System.out.println("program started...");
    	HappyNumber hn = new HappyNumber();
    	Boolean result = hn.isHappy(0);
    	System.out.println("the number is happy number..."+result);
    	Boolean result1 = hn.isHappy(23);
    	System.out.println("the number is happy number..."+result1);
    	Boolean result2 = hn.isHappy(21);
    	System.out.println("the number is happy number..."+result2);
    	Boolean result3 = hn.isHappy(99);
    	System.out.println("the number is happy number..."+result3);
    	Boolean result4 = hn.isHappy(46);
    	System.out.println("the number is happy number..."+result4);
    	Boolean result5 = hn.isHappy(834);
    	System.out.println("the number is happy number..."+result5);
    	
    }

}
