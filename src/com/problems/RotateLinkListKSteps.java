package com.problems;

public class RotateLinkListKSteps {
	public static void print(Node node) {
		
		while(node!=null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
		
		System.out.println();
	}

	public static Node rotateKStepsRight(Node head, int k) {
		
		if(head==null || k==0)
			return head;
		
		Node temp = head;
		int len =1;
		
		while(temp.next!=null) {
			len++;
			temp = temp.next;
		}
		
		temp.next = head;
		
		k = k%len;
		k = len-k;
		
		while(k>0) {
			temp = temp.next;
			k--;
		}
			
		head = temp.next;
		temp.next = null;
		
		return head;	
	}

	public static void main(String[] args) {

		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next =new Node(4);
		node.next.next.next.next = new Node(5);
		
		int k = 2;
		
		Node head = rotateKStepsRight(node, k);
		print(head);
		
	}

}
