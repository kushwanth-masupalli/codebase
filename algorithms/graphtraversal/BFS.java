package graphtraversal;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i =0;i<=n;i++){
            arr.add(new ArrayList<>());
        }

        for(int i =0;i<m;i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            arr.get(n1).add(n2);
            arr.get(n2).add(n1);
        }

        int start = sc.nextInt();
        bfsTraversal(n,arr,start);
    }

    private static void bfsTraversal(int n, ArrayList<ArrayList<Integer>> arr,int start) {
         boolean [] visited = new boolean[n+1];
         Queue<Integer> queue = new LinkedList<>();
         queue.offer(start);
         visited[start] = true;
         while(!queue.isEmpty()){
             int curr = queue.poll();
             System.out.println("visited "+curr);

             for(int i : arr.get(curr)){
                 if(!visited[i]){
                     queue.offer(i);
                     visited[i] = true;
                 }
             }

         }

    }
}


