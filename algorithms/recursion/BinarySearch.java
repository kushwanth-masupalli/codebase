package recursion;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<n;i++) arr[i] = sc.nextInt();
        int t = sc.nextInt();
        boolean ans =  search(arr,0,n-1,t);
        System.out.println("the element is in the array : "+ans);
    }

    private static boolean search(int[] arr, int l, int r,int target) {
        if(l>r){
            return false;
        }
        int mid = l+(r-l)/2;
         if(arr[mid]==target){
             return true;
         }

         if(arr[mid]>target){
            return  search(arr,l,mid-1,target);
         }
         return search(arr,mid+1,r,target);
    }

}
