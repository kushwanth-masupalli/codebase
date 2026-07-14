import java.util.*;

public class SortaStack {
    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();
        st.push(2352354);
        st.push(42342);
        st.push(2344);
        st.push(4324);
        sort(st);
        for (int i : st) {
            System.out.print(i + " ");
        }
    }

    public static void sort(Stack<Integer> st) {
        if (st.size() <= 1)
            return;

        int n = st.pop();
        sort(st);
        insert(st, n);
    }

    public static void insert(Stack<Integer> st, int num) {
        if (st.size() == 0 || st.peek() <= num) {
            st.push(num);
            return;
        }
        int n = st.pop();
        insert(st, num);
        st.push(n);
    }
}