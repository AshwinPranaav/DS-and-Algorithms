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
public class Queue {
    int a[];
    int front, rear, n = 6;
    Queue() {
        a = new int[n];
        front = -1;
        rear = -1;
    }
    
    boolean isFull() {
        if(front == 0 && rear == n-1)
            return true;
        return false;
    }
    
    boolean isEmpty() {
        if(front == -1)
            return true;
        return false;
    }
    
    void enqueue(int data) {
        if(isFull()) {
            System.out.println("Queue is full.");
        }
        else {
            if(front == -1) {
                front = 0;
            }
        }
        if(front == 0 && rear == a.length-1) {
            System.out.println("Queue is full.");
        }
        else {
            a[++rear] = data;
        }
    }
    
    int dequeue() {
        int x = -1;
        if(isEmpty()) {
            System.out.println("Queue is empty.");
        }
        else{
            x = a[front];
            if(front>=rear) {
                front = -1;
                rear = -1;
            }
            else
                front++;
        }
        return x;
    }
    
    void display() {
        int i;
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    
    public static void main(String args[]) {
        Queue obj = new Queue();
        Scanner kb = new Scanner(System.in);
        int choice, data;
        do {
            System.out.println("Enter 1. enqueue \n2. dequeue \n3. display \n4. exit");
            choice = kb.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter data to push: ");
                    data = kb.nextInt();
                    obj.enqueue(data);
                    break;
                case 2:
                    System.out.println("Popped data: "+obj.dequeue());
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
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
