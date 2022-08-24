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
	        
	        if(list1.data > list2.data) {
	            Node temp = list1;
	            list1 = list2;
	            list2 = temp;
	        }
	        
	        
	        Node p1 = list1;
	        Node p2 = list2;
	        Node prev = null;
	        
	        while(p1!=null && p2!=null) {
	            
	            
	            if(p1.data <= p2.data) {
	                
	                prev = p1;
	                p1 = p1.next;
	                
	                
	            } else {
	                
	                prev.next = p2;
	                prev = p2;
	                
	                //swap
	                Node temp = p1;
	                p1 = p2;
	                p2 = temp;
	            }
	            
	            
	        }
	        
	        if(p1!=null)
	            prev.next = p1;
	        
	        if(p2!=null)
	            prev.next = p2;
	        
	        
	        return list1;
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
