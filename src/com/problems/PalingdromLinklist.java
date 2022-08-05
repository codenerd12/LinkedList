package com.problems;

public class PalingdromLinklist {
	
	public static void print(Node node) {
		
		while(node!=null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
		
		System.out.println();
	}
	private static Node reverseLinklist(Node node) {
		
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
	
	private static Node middleElement (Node head) {
		
		Node slow = head;
		Node fast = head.next;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
	
	private static boolean isPalingdrom(Node node) {
		
		Node middle = middleElement(node);
		
		//System.out.println("Middle Node: "+middle.data);
		
		Node temp = reverseLinklist(middle.next);
		
		//System.out.print("Reverse: ");
		print(temp);
		
		middle.next = temp;
		
		Node cur = node;
		
		while(temp!=null) {
			
			if(cur.data!=temp.data)
				return false;
				
			cur = cur.next;
			temp = temp.next;
		}
		
		
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(3);
		node.next.next.next.next = new Node(2);
		node.next.next.next.next.next = new Node(1);
		
		boolean res = isPalingdrom(node);
		
		System.out.println(res);

	}

}
