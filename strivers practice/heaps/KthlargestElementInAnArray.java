import java.util.PriorityQueue;
import java.io.*;
import java.util.Collections;

public class KthlargestElementInAnArray{
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String [] arr = line.split(" ");
        int [] nums = new int[arr.length];

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            nums[i] = Integer.parseInt(arr[i]);
            queue.offer(nums[i]);
        }

        int n = Integer.parseInt(br.readLine());
        while(n>1){
            queue.poll();
            n--;
        }

        System.out.println(queue.peek());


        
    }
}