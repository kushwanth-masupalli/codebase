import  java.util.ArrayList;
import java.util.List;
public class graph{
     List<List<Integer>> list;
     public graph(int vertices){
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

      public static void main(String[] args) {
           graph obj  = new graph(4);
           obj.addn(0, 1);
           obj.addn(0, 2);
           obj.addn(2, 1);
           obj.addn(3, 2);
        //    obj.addn(, 1);
        obj.showgraph();



      }
}