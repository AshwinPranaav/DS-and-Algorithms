/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Binarysearchrecursion {
    static int binarySearch(int a[], int l, int r, int search)
    {
        if(l<=r)
        {
            int mid=l+(r-l)/2;
            if(a[mid]==search)
                return mid;
            else if(a[mid]>search)
                return binarySearch(a,l,mid,search);
            return binarySearch(a,mid+1,r,search);
        }
        return -1;
    }
    public static void main(String args[])
    {
        int a[]={2, 3, 4, 10, 40};
        int search=10;    
        int pos=binarySearch(a,0,a.length-1,search);
        if(pos!=-1)
            System.out.print("Your element is present at "+pos+" index");
        else
            System.out.print("Your element is not present");
    }
}
