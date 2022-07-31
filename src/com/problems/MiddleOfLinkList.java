package com.problems;

public class MiddleOfLinkList {
	
	private static Node middleNode(Node node) {
		
		Node slow = node;
		Node fast = node;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		node.next.next.next.next.next = new Node(6);
		Node res = middleNode(node);
		
		System.out.println("Middle: "+res.data);

	}

}
