package com.problems;

public class RemoveNNodeFromEnd {
	
	public static void print(Node node) {
		
		while(node!=null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
		
		System.out.println();
	}
	
	

	private static Node removeFromLast(Node node, int n) {
		Node start = new Node();
		start.next = node;
		
		Node fast = start;
		Node slow = start;
		//move fast pointer to nth step
		for(int i=1;i<=n;i++)
			fast = fast.next;
		
		
		
		while(fast.next!=null) {
			slow = slow.next;
			fast = fast.next;
			
		}
		
		slow.next = slow.next.next;
		
		return start.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		print(node);
		Node res = removeFromLast(node, 4);
		print(res);

	}


}
