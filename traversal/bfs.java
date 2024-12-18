import  java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class bfs{
     List<List<Integer>> list;
     public bfs(int vertices){
           list = new ArrayList<>(vertices);
           for(int i =0;i<vertices;i++){
                 list.add(new ArrayList<>());
           }
     }

      public void addn(int n ,int m ){
             list.get(n).add(m);
             list.get(m).add(n);
      }

      public void showgraph(){
          for(int i =0;i<list.size();i++){
               System.out.print("for the index "+i+" : "); 
               for(int j:list.get(i)){
                   System.out.print(j+" ");
               }              
               System.out.println();
          }
      }


      public void bf(){
          HashSet<Integer> set = new HashSet<>();
          Queue<Integer> arr = new LinkedList<>();
          
          arr.add(0);
          set.add(0);
          while(!arr.isEmpty()){
               int n = arr.poll();
               System.out.println(n);
               for(int  j : list.get(n)){
                   if(set.add(j)){
                       arr.add(j);
                       set.add(j);
                   }
               }
          }
      }

      public static void main(String[] args) {
           bfs obj  = new bfs(5);
           obj.addn(0, 1);
           obj.addn(0, 2);
           obj.addn(2, 1);
           obj.addn(3, 2);
           obj.addn(4, 1);
        // obj.showgraph();

        obj.bf();


      }
}