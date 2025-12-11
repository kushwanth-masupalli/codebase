import java.util.*;

public class Array {

    public static void main(String[] args) {
        System.out.println("All Array Operations in One File");
    }

    // 1. Create Arrays
    int[] arr = new int[5];
    int[] arr2 = {1, 2, 3, 4, 5};
    String[] s = new String[3];

    // 2. Access Elements
    int accessExample = arr2[2];

    // 3. Modify Elements
    {
        arr[1] = 10;
    }

    // 4. Find Length
    int len = arr.length;

    // 5. Traverse Arrays
    void traverse() {
        for (int i = 0; i < arr.length; i++) {}
        for (int x : arr) {}
    }

    // 6. Print Arrays
    void printArrays() {
        System.out.println(Arrays.toString(arr));
    }

    // 7. Sort Arrays
    void sortArrays() {
        Arrays.sort(arr);
    }

    // 8. Search
    void searching() {
        int key = 3;
        for (int i = 0; i < arr.length; i++) {}
        int index = Arrays.binarySearch(arr2, key);
    }

    // 9. Copy Arrays
    int[] copy = Arrays.copyOf(arr2, arr2.length);
    int[] part = Arrays.copyOfRange(arr2, 1, 4);

    // 10. Fill
    void fillArray() {
        Arrays.fill(arr, 5);
    }

    // 11. Equality
    boolean eq = Arrays.equals(arr, arr2);

    // 12. Reverse Array
    void reverse() {
        int i = 0, j = arr2.length - 1;
        while (i < j) {
            int t = arr2[i]; arr2[i] = arr2[j]; arr2[j] = t;
            i++; j--;
        }
    }

    // 13. Find Max & Min
    void maxMin() {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int x : arr2) { max = Math.max(max, x); min = Math.min(min, x); }
    }

    // 14. Sum
    int sum() {
        int s = 0; for (int x : arr2) s += x; return s;
    }

    // 15. Average
    double avg() { return (double) sum() / arr2.length; }

    // 16. Prefix Sum
    int[] prefix() {
        int[] p = new int[arr2.length];
        p[0] = arr2[0];
        for (int i = 1; i < arr2.length; i++) p[i] = p[i-1] + arr2[i];
        return p;
    }

    // 17. Suffix Sum
    int[] suffix() {
        int[] suf = new int[arr2.length];
        suf[arr2.length-1] = arr2[arr2.length-1];
        for (int i = arr2.length-2; i >= 0; i--) suf[i] = suf[i+1] + arr2[i];
        return suf;
    }

    // 18. Rotate (manual)
    void rotateRight() {
        int last = arr2[arr2.length-1];
        for (int i = arr2.length-2; i >= 0; i--) arr2[i+1] = arr2[i];
        arr2[0] = last;
    }

    // 19. Shift Left
    void shiftLeft() {
        for (int i = 1; i < arr2.length; i++) arr2[i-1] = arr2[i];
    }

    // 20. Insert at Index
    void insertAt(int idx, int val) {
        for (int i = arr2.length-1; i > idx; i--) arr2[i] = arr2[i-1];
        arr2[idx] = val;
    }

    // 21. Delete at Index
    void deleteAt(int idx) {
        for (int i = idx; i < arr2.length-1; i++) arr2[i] = arr2[i+1];
    }

    // 22. Frequency Count
    Map<Integer,Integer> freq() {
        Map<Integer,Integer> m = new HashMap<>();
        for (int x : arr2) m.put(x, m.getOrDefault(x, 0) + 1);
        return m;
    }

    // 23. Two Pointers
    void twoPointers() {
        int i = 0, j = arr2.length - 1;
    }

    // 24. Sliding Window
    int slidingWindow(int k) {
        int w = 0;
        for (int i = 0; i < k; i++) w += arr2[i];
        int max = w;
        for (int i = k; i < arr2.length; i++) {
            w += arr2[i] - arr2[i-k];
            max = Math.max(max, w);
        }
        return max;
    }

    // 25. Subarrays
    void subarrays() {
        for (int i = 0; i < arr2.length; i++)
            for (int j = i; j < arr2.length; j++) {}
    }

    // 26. Kadane
    int kadane() {
        int maxEnd = 0, maxSo = Integer.MIN_VALUE;
        for (int x : arr2) {
            maxEnd = Math.max(x, maxEnd + x);
            maxSo = Math.max(maxSo, maxEnd);
        }
        return maxSo;
    }

    // 27. Next Greater Element
    int[] nextGreater() {
        int[] res = new int[arr2.length];
        Stack<Integer> st = new Stack<>();
        for (int i = arr2.length-1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr2[i]) st.pop();
            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr2[i]);
        }
        return res;
    }

    // 29. Matrix Operations
    int[][] mat = {{1,2,3},{4,5,6}};

    void matrixOps() {
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[i].length; j++) {}
        System.out.println(Arrays.deepToString(mat));
    }

    // 30. Array <-> List
    List<Integer> list = Arrays.asList(1,2,3);
    Integer[] arrFromList = list.toArray(new Integer[0]);

    // 31. Streams
    int streamSum = Arrays.stream(arr2).sum();

    // 32. Clone
    int[] cloned = arr2.clone();

    // 33. Jagged Array
    int[][] jagged = { {1,2}, {3,4,5} };

    // 34. XOR Prefix
    int[] xorPrefix() {
        int[] xp = new int[arr2.length];
        xp[0] = arr2[0];
        for (int i = 1; i < arr2.length; i++) xp[i] = xp[i-1] ^ arr2[i];
        return xp;
    }

    // 35. Move zeros
    void moveZeros() {
        int j = 0;
        for (int i = 0; i < arr2.length; i++) if (arr2[i] != 0) arr2[j++] = arr2[i];
        while (j < arr2.length) arr2[j++] = 0;
    }

    // 36. Majority Element
    int majority() {
        int c = 0, cand = 0;
        for (int x : arr2) {
            if (c == 0) cand = x;
            c += (x == cand) ? 1 : -1;
        }
        return cand;
    }

    // 38. To String
    String toStr = Arrays.toString(arr2);

    // 39. Shuffle
    void shuffle() {
        Collections.shuffle(Arrays.asList(arr2));
    }

    // 40. Parallel Sort
    void parallelSort() {
        Arrays.parallelSort(arr2);
    }
}