/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.util.*;

public class LinkedList {
    
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    Node head = null;
    
    Node insertBeginning(Node head, int key) {
        Node temp = new Node(key);
        if(head == null)
            head = temp;
        else {
            temp.next = head;
            head = temp;
        }
        return head;
    }
    
    Node insertEnd(Node head, int key) {
        Node temp = new Node(key);
        if(head == null)
            head = temp;
        else {
            Node curr = head;
            while(curr.next != null)
                curr = curr.next;
            curr.next = temp;
        }
        
        this.display(head);
        
        return head;
    }
    
    Node insertAt(Node head, int key, int pos) {
        Node temp = new Node(key);
        if(head == null)
            head = temp;
        else if(pos == 1) {
            temp.next = head;
            head = temp;
        }
        else {
            Node curr = head;
            for(int i=1; i<pos && curr!=null; i++) {
                curr = curr.next;
            }
            temp.next = curr.next;
            curr.next = temp;
        }
        return head;
        }
    
    Node delete(Node head, int pos) {
        Node curr = head;
        if(pos == 1) {
            head = curr.next;
        }
        for(int i=1; i<pos-1 && curr!=null; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
    
    int length(Node head) {
        Node curr = head;
        int count = 0;
        while(curr != null) {
            count++;
             curr = curr.next;
        }
        return count;
    }
    
    void display(Node head) {
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
            
    }
    
    Node reverse(Node head)
    {
	Node prevNode = null, curr = head, nextNode = null;
	while(curr != null)
	{
            nextNode = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = nextNode;
	}	
	head = prevNode;
	return head;
    }
    
    public static void main(String args[]) {
        LinkedList obj = new LinkedList();
        obj.head = null;
        Scanner kb = new Scanner(System.in);
        do{
            System.out.println("Enter 1. Insert in end \n2. Insert at beginning \n3. Insert at pos \n4. Delete at pos"
                + "\n5. Length \n6. Reverse \n7. Display \n8. Exit");
            int n = kb.nextInt();
//            if(kb.hasNext()){
//                kb.reset();
//            }
            int key, pos;
            switch(n) {
                case 1:
                    System.out.println("Enter data: ");
                    key = kb.nextInt();
                    System.out.println(key + " is the entered key");
                    obj.head = obj.insertEnd(obj.head, key);
                    break;
                case 2:
                    System.out.println("Enter data: ");
                    key = kb.nextInt();
                    obj.head = obj.insertBeginning(obj.head, key);
                    break;
                case 3:
                    System.out.println("Enter pos and data: ");
                    pos = kb.nextInt();
                    key = kb.nextInt();
                    obj.head = obj.insertAt(obj.head, key, pos);
                    break;
                case 4:
                    System.out.println("Enter pos to delete: ");
                    pos = kb.nextInt();
                    obj.head = obj.delete(obj.head, pos);
                    break;
                case 5:
                    System.out.println(obj.length(obj.head));
                    break;
                case 6:
                    obj.head = obj.reverse(obj.head);
                    break;
                case 7:
                    obj.display(obj.head);
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
                
            }
            System.out.println("Do you want to continue?");
        } while(kb.nextInt() == 1);
        
    }
}
