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
public class Stack {
    int top;
    int a[];
    Stack(int n) {
        a = new int[n];
        top = -1;
    }
    
    boolean isFull() {
        if(top == a.length-1)
            return true;
        return false;
    }
    
    boolean isEmpty() {
        if(top == -1)
            return true;
        return false;
    }
    
    void push(int data) {
        if(isFull()) {
            System.out.println("Stack is full.");
        }
        else {
            a[++top] = data;
        }
    }
    
    int pop() {
        int pop_data = -1;
        if(isEmpty()) {
            System.out.println("Stack is empty.");
        }
        else {
            pop_data =  a[top--];
        }
        return pop_data;
    }
    
    int peak() {
        int peak_data = -1;
        if(isEmpty()) {
            System.out.println("Stack is empty.");
        }
        else {
            peak_data = a[top];
        }
        return peak_data;
    }
    
    int length() {
        int stack_length = -1;
        if(isEmpty()) {
            System.out.println("Stack is empty.");
        }
        else {
            stack_length = a.length;
        }
        return stack_length;
    }
    
    void display() {
        int i;
        for(i=0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    
    public static void main(String args[]) {
        Stack obj = new Stack(6);
        Scanner kb = new Scanner(System.in);
        int choice, data;
        do {
            System.out.println("Enter 1. push \n2. pop \n3. peak \n4. length \n5. display \n6. exit");
            choice = kb.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter data to push: ");
                    data = kb.nextInt();
                    obj.push(data);
                    break;
                case 2:
                    System.out.println("Popped data: "+obj.pop());
                    break;
                case 3:
                    System.out.println("Peak data: "+obj.peak());
                    break;
                case 4:
                    System.out.println("Length: "+obj.length());
                    break;
                case 5:
                    obj.display();
                    break;
                case 6:
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
