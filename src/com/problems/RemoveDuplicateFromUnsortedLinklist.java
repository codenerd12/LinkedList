package com.problems;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromUnsortedLinklist {
	
	public static void print(Node node) {
		
		while(node!=null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
		
		System.out.println();
	}
	
	private static Node removeDuplicate(Node head) {
		
		Set<Integer> set = new HashSet<>();
		Node temp = head;
		Node prev = null;
		
		while(temp!=null) {
			int data = temp.data;
			
			if(set.contains(data)) {
				prev.next = temp.next;
			} else {
				set.add(data);
				prev = temp;
			}
			
			temp = temp.next;
		}
		
		return head;
		
	}

	public static void main(String[] args) {
		
		Node start = new Node(10);
        start.next = new Node(12);
        start.next.next = new Node(11);
        start.next.next.next = new Node(11);
        start.next.next.next.next = new Node(12);
        start.next.next.next.next.next = new Node(11);
        start.next.next.next.next.next.next = new Node(10);
        
        Node ans = removeDuplicate(start);
        print(ans);

	}


}
