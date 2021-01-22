package Leetcode;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class getRandom {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(34);
		set.add(45);
		set.add(98);
		Random r = new Random(set.size());
		int i = r.nextInt();
		int item = 0;
		
		int res = 0;
		for(int obj : set)
		{
			if(item==i)
				res= obj;
			i++;
		}
		System.out.println(res);

	}

}
