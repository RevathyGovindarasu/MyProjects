package AmazonQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class Solve {
	
public static void main(String[] args)	{
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	list.add(12);
	list.add(15);
	list.add(16);
	list.add(25);
	list.add(46);
	list.add(49);	
	System.out.println(list);
	
	int subnum=3;
		


System.out.println("list..........");
System.out.println(list);
Collections.reverse(list);
System.out.println("after sorting");
System.out.println(list);
ArrayList<Integer> newlist = reverselist(list);
System.out.println("after reversing");
System.out.println(newlist);
System.out.println("after substringreverse");
ArrayList<Integer> indexlist = sublistRev(list,subnum);
System.out.println(indexlist);

	
}
public static ArrayList<Integer> reverselist(ArrayList<Integer> numbers){
	
	ArrayList<Integer> temp = new ArrayList<Integer>();
	
	for(int i=numbers.size()-1;i>=0; i--)
	{
			
		temp.add(numbers.get(i));
	
		}
           
	return temp;
	
}

public static ArrayList<Integer> sublist(ArrayList<Integer> numbers, int k){
	
ArrayList<Integer> temp = new ArrayList<Integer>();
	
	for (int i=numbers.size()/k; i>0; i--){
		
		for (int j=k-1;j>=0;j--){
			temp.add(numbers.get(j));
			
		}
		
				}
           
return temp;
	
}


public static ArrayList<Integer> sublistRev(ArrayList<Integer> numbers, int k){
	
//ArrayList<Integer> temp = new ArrayList<Integer>();
//int count = 0, count2=0;	

	for (int i = 0; i < numbers.size(); i = i + k) 
	{
		 
         int rightIndex = i + k;
         int arrLen = numbers.size();
         rightIndex = rightIndex > arrLen ? arrLen - 1 : (rightIndex - 1);
         int leftIndex = i;

         while (leftIndex < rightIndex)
         {
        	 
        	
             
         }
	
	 }       
return numbers;
	
}

}
