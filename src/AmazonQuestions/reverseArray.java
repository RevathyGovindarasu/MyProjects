package AmazonQuestions;

public class reverseArray {
    private static void reverseArraysol(int[] arr, int interval) {
 
        for (int i = 0; i < arr.length; i = i + interval) {
 
            int rightIndex = i + interval;
            int arrLen = arr.length;
           rightIndex = rightIndex > arrLen ? arrLen - 1 : (rightIndex - 1);
            int leftIndex = i;
 
            
           
            while (leftIndex < rightIndex) {
                int temp = arr[leftIndex];
                arr[leftIndex++] = arr[rightIndex];
                arr[rightIndex--] = temp;
            
            }
        }
    }
 
    public static void main(String[] args) {
        int[] arr = {10, 22, 36, 45, 75, 456, 57, 58, 59};
        int interval = 3;
 
        reverseArraysol(arr, interval);
 
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}