package com.problems;

public class DetectAndRemoveCycle {
	
public static void printList(Node head) {
	
	Node node = head;
	
	while(node!=null) {
		System.out.print(node.data+" ");
		node = node.next;
	}
	
}

public static Node getLoopStartingPoint(Node fast, Node head) {
    
    Node slow = head;
    
    while(slow!=fast) {
        slow = slow.next;
        fast = fast.next;
    }
    
    return slow;
}

public static void detectAndRemoveCycle(Node head) {
        
        if(head==null || head.next==null)
            return;
        
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        
        while(fast!=null && fast.next!=null) {
            
        	slow = slow.next;
            fast = fast.next.next;
            
            if(fast==slow) {
            	isCycle = true;
            	break;
            }
            
            
        }
        
        System.out.println("isCycle: "+isCycle);
        
        
        if(isCycle) {
        	
        	System.out.println("Cycle in Linklist now Removing the cycle");
        	
        	Node startingPoint = getLoopStartingPoint(fast, head);
            
            Node temp = startingPoint;
            
            while(temp.next!=startingPoint)
                temp = temp.next;
                
            temp.next = null;
        	
        }
        
        printList(head);
        
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node(7);
		node.next = new Node(58);
		node.next.next = new Node(36);
		node.next.next.next = new Node(34);
		node.next.next.next.next = new Node(16);
		node.next.next.next.next.next = node;
		
		detectAndRemoveCycle(node);

	}

}
