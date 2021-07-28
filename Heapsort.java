/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Heapsort 
{
    void sort(int a[])
    {
        int n=a.length;
        
        // build heap for non leaf nodes
        for(int i=n/2-1;i>=0;i--)
            heapify(a,n,i);
        
        // remove root element and swap the leaf node
        for(int i=n-1;i>0;i--)
        {
            int temp=a[0];
            a[0]=a[i];
            a[i]=temp;
            
            // heapify this also reduced array
            heapify(a,i,0);
        }
    }
    
    void heapify(int a[], int n, int i)
    {
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        
        // if leaft root is largest swap
        if(l<n && a[l]>a[largest])
            largest=l;
        if(r<n && a[r]>a[largest])
            largest=r;
        // swap if largest is not the parent
        if(largest!=i)
        {
            int temp=a[i];
            a[i]=a[largest];
            a[largest]=temp;
            heapify(a,n,largest);
        }
    }
    
    static void printArray(int a[])
    {
        int n=a.length;
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    public static void main(String args[])
    {
        int a[]={12, 11, 13, 5, 6, 7};
        Heapsort obj=new Heapsort();
        obj.sort(a);
        printArray(a);
    }
}
