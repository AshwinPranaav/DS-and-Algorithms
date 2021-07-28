/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Quicksort {
    public static void swap(int a[], int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static int partition(int a[], int low, int high)
    {
        int pivot = a[high];
        // Index of smaller element and indicates the right position of pivot found so far
        int i=low-1;
        for(int j=low;j<=high-1;j++)
        {
            // If current element is smaller than the pivot
            if(a[j]<pivot)
            {
                // Increment index of smaller element
                i++;
                swap(a,i,j);
            }
        }
        // swap pivot and i+1 (a larger element0)
        swap(a,i+1,high);
        return (i+1);
    }
    public static void printarray(int a[], int n)
    {
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    public static void quickSort(int a[], int low, int high)
    {
        if(low<high)
        {
            int pos = partition(a,low,high);
            quickSort(a,low,pos-1);
            quickSort(a,pos+1,high);
        }
    }
    public static void main(String args[])
    {
        int a[]={10, 7, 8, 9, 1, 5};
        quickSort(a,0,a.length-1);
        printarray(a,a.length);
    }
}
