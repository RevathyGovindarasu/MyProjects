package stringss;

public class stringCompression {

	public static void main(String[] args) {
		
		StringBuilder sample = new StringBuilder();
		String result = null;
		char arr = sample.charAt(0);
		int count=0;
		
		for(int i=0;i<sample.length();i++)
		{
			if(sample.charAt(i)==arr)
			{
				count++;
			
			}
			else
			{
			String res = Integer.toString(count);
			String arrs = Character.toString(arr);
			result=result.concat(arrs);
			result=result.concat(res);
			arr=sample.charAt(i);		
			}
		}
		
		System.out.println(result);
	}

}
