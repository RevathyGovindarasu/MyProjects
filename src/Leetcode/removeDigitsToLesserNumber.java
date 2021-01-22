package Leetcode;

public class removeDigitsToLesserNumber {

	 int minNum = Integer.MAX_VALUE;
	    public String removeKdigitsMyTry(String num, int k) {
	        if(k>0 && num.length()>0)
	        {
	        	if(k>0 && num.length()<=0)
	                return "0";
	            for(int i=0;i<num.length();i++)
	            {
	            String temp = num.substring(0, i) + num.substring(i + 1);
	            int tempInt = Integer.parseInt(temp);
	            System.out.println("after removing digit temp..."+tempInt);
	            if(tempInt<minNum)
	                minNum = tempInt;
	            System.out.println("after removing digit minInt..."+minNum);
	            
	            }
	            removeKdigits(Integer.toString(minNum),--k);
	        }
	        return Integer.toString(minNum);
	    }
	    public String removeKdigits(String num, int k) {
	    if (num.length() == k)
            return "0";
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < k; i++) {
            int j = 0;
            while (j < sb.length() -1 && sb.charAt(j) <= sb.charAt(j + 1))
                j++;
            sb.delete(j, j + 1);
        }
        while (sb.length() > 1 && sb.charAt(0) == '0')
            sb.delete(0, 1);
        if (sb.length() == 0)
            return "0";
        return sb.toString();
	    
	    }
	    
	public static void main(String[] args) {
		removeDigitsToLesserNumber re = new removeDigitsToLesserNumber();
		String ass = re.removeKdigits("15897", 2);
		System.out.println(ass);

	}

}
