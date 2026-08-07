import java.util.*;

public class NextRound{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();
        
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int count = 0;
        int temp = 0;  // for storing the kth place contestant score;
        if(k<=arr.length-1 && arr[k-1]!=0){
            count = k;
            temp = arr[k-1];
            for(int i =k;i<arr.length;i++){
                if(arr[i]==temp) count++;
            }
            System.out.println(count);
            
        }
        else if(k<=arr.length-1 && arr[k-1]==0){
            
            count =0;
            for(int i=0;i<k;i++){
                if(arr[i]>0)  count++;
            }
            System.out.println(count);
            
        }
        else{
            count = 0;
            for(int i : arr){
                if(i>0) count++;
            }
            System.out.println(count);
        }



        
       


    }
}