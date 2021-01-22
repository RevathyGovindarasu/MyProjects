package backToBasics;

	
	import java.util.*;
	

	public class Llist {

	    static class SinglyLinkedListNode {
	        public int data;
	        public SinglyLinkedListNode next;

	        public SinglyLinkedListNode(int nodeData) {
	            this.data = nodeData;
	            this.next = null;
	        }
	    }

	    static class SinglyLinkedList {
	        public SinglyLinkedListNode head;
	        public SinglyLinkedListNode tail;

	        public SinglyLinkedList() {
	            this.head = null;
	            this.tail = null;
	        }

	        public void insertNode(int nodeData) {
	            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

	            if (this.head == null) {
	                this.head = node;
	            } else {
	                this.tail.next = node;
	            }

	            this.tail = node;
	        }
	    }

	   
	    static void printLinkedList(SinglyLinkedListNode head) 
	    {
	     SinglyLinkedListNode node = head;
	    while(true){
	        System.out.println(node.data);
	        if (node.next != null){
	            node = node.next;
	        }
	        else {
	            break;
	        }

	    }
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        SinglyLinkedList llist = new SinglyLinkedList();

	        int llistCount = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < llistCount; i++) {
	            int llistItem = scanner.nextInt();
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            llist.insertNode(llistItem);
	        }

	        printLinkedList(llist.head);

	        scanner.close();
	    }
	}

	
