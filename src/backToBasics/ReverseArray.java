package backToBasics;


	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class ReverseArray {



	   private static final Scanner scanner = new Scanner(System.in);
	    // Complete the reverseArray function below.
	    static int[] reverseArray(int[] a, int n) {
	        int[] b=new int[n];
	    for (int i=0;i<a.length;i++)
	    {
	         for(int j=a.length;j>=0;j--)
	         {
	            b[i]=a[j];
	         }
	    }
	    return b;

	    }

	 

	    public static void main(String[] args) throws IOException {
	    	File out = new File("C:\\Users\\Revathy\\Desktop\\output.txt");
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(out));

	        int arrCount = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] arr = new int[arrCount];

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < arrCount; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }

	        int[] res = reverseArray(arr, arrCount);

	        for (int i = 0; i < res.length; i++) {
	            bufferedWriter.write(String.valueOf(res[i]));

	            if (i != res.length - 1) {
	                bufferedWriter.write(" ");
	            }
	        }

	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	}

	
