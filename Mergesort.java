/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Mergesort {
    void merge(int a[], int l, int mid, int r)
    {
        int n1=mid-l+1;
        int n2=r-mid;
        int L[]=new int[n1];
        int R[]=new int[n2];
        // copying left and right subarrays
        for(int i=0;i<n1;i++)
            L[i]=a[l+i];
        for(int j=0;j<n2;j++)
            R[j]=a[mid+1+j];
        // index of left and right subarrays
        int i=0,j=0;
        // index of a
        int k=l;
        while(i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            {
                a[k]=L[i];
                i++;
            }
            else
            {
                a[k]=R[j];
                j++;
            }
            k++;
        }
        // copying left out elements in left and right subarrays
        while(i<n1)
        {
            a[k]=L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            a[k]=R[j];
            j++;
            k++;
        }
    }
    void sort(int a[], int l, int r)
    {
        if(l<r)
        {
            int mid=l+(r-l)/2;
            sort(a,l,mid);
            sort(a,mid+1,r);
            merge(a,l,mid,r);
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
        Mergesort obj=new Mergesort();
        obj.sort(a,0,a.length-1);
        printArray(a);
    }
}
