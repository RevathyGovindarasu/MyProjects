package backToBasics;
import java.util.*;
public class LinkedListTest {
	
	public static void main(String args[])
	{
		LinkedList<String>[] obj = new LinkedList[5]; 
		for(int i=0;i<3;i++)
		{
		obj[i].add("1");
		obj[i].add("2");
		obj[i].add("Revathy");
		obj[i].addFirst("Great");
		obj[i].addLast("Success");
		System.out.println(obj[i]);
		System.out.println(obj[i].size());
		}
	}

}
