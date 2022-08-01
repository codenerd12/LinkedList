package com.problems;

public class DeleteNode {
	
	public static void print(Node node) {
		
		while(node!=null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
		
		System.out.println();
	}
	
	public static Node deleteNode(Node node, int val) {
		
		//if delete node is first Node
		if(node.data==val) {
			node = node.next;
			return node;
		}
		
		Node cur = node;
		Node prev = null;
		while(cur!=null) {
			
			if(cur.data==val) {
				prev.next = cur.next;
				break;
			}
			
			prev = cur;
			cur=cur.next;
		}
		
		
		return node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node1 = new Node(1);
		node1.next = new Node(3);
		node1.next.next = new Node(4);
		node1.next.next.next = new Node(5);
		
		Node res = deleteNode(node1, 6);
		print(res);
		

	}

}
