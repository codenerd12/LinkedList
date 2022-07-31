package com.problems;

public class ReverseLinkedList {
	
	public static Node reverse(Node node) {

		Node prev = null;
		Node cur = node;
		Node nxt = null;
		
		while(cur!=null) {
			nxt = cur.next;
			cur.next = prev;
			prev = cur;
			cur = nxt;
		}
		
		
		return prev;
		
	}
	
	public static void print(Node node) {
		
		while(node!=null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		print(node);
		Node res = reverse(node);
		print(res);
		

	}

}
