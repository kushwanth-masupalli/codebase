import java.util.*;

public class SorkKSortedArray {

    public static void main(String[] args) {
        int[] arr = { 2,1 };
        int k = 1;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            queue.offer(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            queue.offer(arr[i]);
            System.out.print(queue.poll()+" ");
        }
        while(!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }
    }
}
