package backToBasics;

import java.util.HashMap;
import java.util.Map.Entry;

public class differencePair {

	public static void main(String args[])
	{
		int sampleArray[]= {1,7,5,9,2,12,3};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<sampleArray.length;i++)
		{
			for(int j=0;j<sampleArray.length;j++)
			{
			if(((sampleArray[i]>sampleArray[j])&&(sampleArray[i]-sampleArray[j]==2))||((sampleArray[j]>sampleArray[i])&&(sampleArray[j]-sampleArray[i]==2)))
			{
				System.out.println("("+sampleArray[i]+","+sampleArray[j]+")");
				hm.put(sampleArray[i], sampleArray[j]);
			}
			}
			
			
		}
		for (Entry e : hm.entrySet())
		{
			System.out.println(e.getKey()+","+e.getValue());
		}
	}

}
