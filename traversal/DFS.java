import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

class Graph {
    List<List<Integer>> list;

    public Graph(int vertices) {
        list = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            list.add(new ArrayList<>());
        }
    }

    public void addn(int n, int m) {
        list.get(n).add(m);
        list.get(m).add(n);
    }

    public void showGraph() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print("For the index " + i + " : ");
            for (int j : list.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void dff() {
        Stack<Integer> stack = new Stack<>();
        HashSet<Integer> set = new HashSet<>();

        stack.add(0);
        System.out.println("Depth-First Traversal:");
        set.add(0);
        System.out.println(stack.peek());
        
        while (!stack.isEmpty()) {
            int n = stack.peek();
            int initialSize = stack.size();
            for (int i : list.get(n)) {
                if (set.add(i)) {
                    System.out.println(i);
                    stack.add(i);
                    set.add(i);
                    break;
                }
            }
            int finalSize = stack.size();
            if (initialSize == finalSize) {
                stack.pop();
            }
        }
    }
}

public class DFS {
    public static void main(String[] args) {
        Graph obj = new Graph(4);
        obj.addn(0, 1);
        obj.addn(0, 2);
        obj.addn(2, 1);
        obj.addn(3, 2);

        obj.dff();
        // obj.showGraph();
    }
}
