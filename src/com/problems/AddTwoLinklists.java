package com.problems;

public class AddTwoLinklists {

	public static void print(Node node) {
		
		while(node!=null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
		
		System.out.println();
	}


	private static Node addTwoList(Node node1, Node node2) {
		
		Node res = new Node();
		Node temp = res;
		
		Node p1 = node1;
		Node p2 = node2;
		int carry = 0;
		
		while(p1!=null || p2!=null || carry!=0) {
			
			int sum = 0;
			
			if(p1!=null) {
				sum += p1.data;
				p1 = p1.next;
			}
			
			if(p2!=null) {
				sum += p2.data;
				p2 = p2.next;
			}
			
			sum += carry;
			carry = sum/10;
			
			Node nNode = new Node(sum%10);
			temp.next = nNode;
			temp = temp.next;
			
		}
		
		return res.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node1 = new Node(1);
		node1.next = new Node(3);
		node1.next.next = new Node(11);
		
		Node node2 = new Node(2);
		node2.next = new Node(3);
		node2.next.next = new Node(4);
		node2.next.next.next = new Node(6);
		
		Node ans = addTwoList(node1, node2);
		print(ans);

	}

}
