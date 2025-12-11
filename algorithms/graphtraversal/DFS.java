package graphtraversal;

import java.sql.Array;
import java.util.*;

public class DFS {
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
        dfsTraversal(n,arr,start);
    }

    private static void dfsTraversal(int n, ArrayList<ArrayList<Integer>> arr, int start) {
          Stack<Integer> stack = new Stack<>();
          boolean [] visited = new boolean[n+1];
          stack.push(start);
          visited[start] = true;
          while(!stack.isEmpty()){
              int curr = stack.pop();
              System.out.println("Visited "+curr);
              for(int i : arr.get(curr)){
                  if(!visited[i]) {
                      stack.push(i);
                      visited[i] = true;
                  }
              }
          }
    }


}


