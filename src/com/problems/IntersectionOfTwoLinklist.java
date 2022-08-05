package com.problems;

public class IntersectionOfTwoLinklist {
	
	public static Node getIntersectionNode(Node headA, Node headB) {
	        
	        
        Node p1 = headA;
        Node p2 = headB;
        
        while(p1!=p2) {
            
            p1 = p1==null?headB:p1.next;
            p2 = p2==null?headA:p2.next;
            
        }
        
        return p1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node3 = new Node(7);
		node3.next = new Node(8);
		node3.next.next = new Node(9);
		
		Node node1 = new Node(1);
		node1.next = new Node(3);
		node1.next.next = new Node(5);
		node1.next.next.next = node3;
		
		Node node2 = new Node(2);
		node2.next = new Node(3);
		node2.next.next = new Node(4);
		node2.next.next.next = new Node(6);
		node2.next.next.next.next = node3;
		
		
		
		Node ans = getIntersectionNode(node1, node2);
		
		System.out.println("Intersection Node: "+ans.data);

	}

}
