package com.problems;

public class MergeTwoSortedLinkList {
	
	public static void print(Node node) {
		
		while(node!=null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
		
		System.out.println();
	}
	
	public static Node mergeTwoLists(Node list1, Node list2) {
	        
	        if(list1==null)
	            return list2;
	        if(list2==null)
	            return list1;
	        
	        Node p1 = list1;
	        Node p2 = list2;
	        Node head = null;
	        Node tail = null;
	        
	        if(p1.data<=p2.data) {
	            head = p1;
	            tail = p1;
	            p1 = p1.next;
	        } else {
	            head = p2;
	            tail = p2;
	            p2 = p2.next;
	        }

	        while(p1!=null && p2!=null) {
	            
	            if(p1.data<=p2.data) {
	                tail.next = p1;
	                tail = p1;
	                p1 = p1.next;
	            } else {
	                tail.next = p2;
	                tail = p2;
	                p2 = p2.next;
	            }

	        }
	        
	        if(p1!=null)
	            tail.next = p1;
	        
	        if(p2!=null)
	            tail.next = p2;
	        
	        
	        return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node1 = new Node(1);
		node1.next = new Node(3);
		node1.next.next = new Node(5);
		
		Node node2 = new Node(2);
		node2.next = new Node(3);
		node2.next.next = new Node(4);
		node2.next.next.next = new Node(6);
		
		Node ans = mergeTwoLists(node1, node2);
		print(ans);

	}

}
