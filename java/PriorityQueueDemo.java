import java.util.*;

class Student {

    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class PriorityQueueDemo {

    public static void main(String[] args) {
        int[] arr = { 5, 7, 54, 2, 23432, 434, 34 };

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) list.add(i);

        // ======================================================
        // 1. MIN HEAP (DEFAULT)
        // ======================================================

        System.out.println("========== MIN HEAP ==========");

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(list);

        // Prints internal heap (NOT SORTED)
        System.out.println("Internal Heap:");
        for (int i : minHeap) System.out.print(i + " ");

        System.out.println();

        // Prints sorted order
        System.out.println("Using poll():");
        while (!minHeap.isEmpty()) System.out.print(minHeap.poll() + " ");

        System.out.println("\n");

        // ======================================================
        // 2. MAX HEAP
        // ======================================================

        System.out.println("========== MAX HEAP ==========");

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            Collections.reverseOrder()
        );

        for (int i : arr) maxHeap.add(i);

        while (!maxHeap.isEmpty()) System.out.print(maxHeap.poll() + " ");

        System.out.println("\n");

        // ======================================================
        // 3. CUSTOM COMPARATOR (Integers)
        // Example: Sort according to last digit
        // ======================================================

        System.out.println("========== CUSTOM INTEGER COMPARATOR ==========");

        PriorityQueue<Integer> customInt = new PriorityQueue<>(
            (a, b) -> (a % 10) - (b % 10)
        );

        for (int i : arr) customInt.add(i);

        while (!customInt.isEmpty()) System.out.print(customInt.poll() + " ");

        System.out.println("\n");

        // ======================================================
        // 4. OBJECT PRIORITY QUEUE (Min Marks)
        // ======================================================

        Student s1 = new Student(1, "Alice", 90);
        Student s2 = new Student(2, "Bob", 75);
        Student s3 = new Student(3, "Charlie", 80);
        Student s4 = new Student(4, "David", 60);

        System.out.println("========== OBJECT (MIN MARKS) ==========");

        PriorityQueue<Student> marksMin = new PriorityQueue<>(
            (a, b) -> a.marks - b.marks
        );

        marksMin.add(s1);
        marksMin.add(s2);
        marksMin.add(s3);
        marksMin.add(s4);

        while (!marksMin.isEmpty()) System.out.println(marksMin.poll());

        // ======================================================
        // 5. OBJECT PRIORITY QUEUE (Max Marks)
        // ======================================================

        System.out.println("\n========== OBJECT (MAX MARKS) ==========");

        PriorityQueue<Student> marksMax = new PriorityQueue<>(
            (a, b) -> b.marks - a.marks
        );

        marksMax.add(s1);
        marksMax.add(s2);
        marksMax.add(s3);
        marksMax.add(s4);

        while (!marksMax.isEmpty()) System.out.println(marksMax.poll());

        // ======================================================
        // 6. OBJECT SORT BY NAME
        // ======================================================

        System.out.println("\n========== OBJECT (NAME) ==========");

        PriorityQueue<Student> namePQ = new PriorityQueue<>((a, b) ->
            a.name.compareTo(b.name)
        );

        namePQ.add(s1);
        namePQ.add(s2);
        namePQ.add(s3);
        namePQ.add(s4);

        while (!namePQ.isEmpty()) System.out.println(namePQ.poll());

        // ======================================================
        // 7. MULTIPLE COMPARATORS
        // Marks Descending
        // If equal -> Smaller ID first
        // ======================================================

        System.out.println("\n========== MULTIPLE COMPARATOR ==========");

        PriorityQueue<Student> multi = new PriorityQueue<>((a, b) -> {
            if (a.marks != b.marks) return b.marks - a.marks;

            return a.id - b.id;
        });

        multi.add(new Student(5, "Eve", 85));
        multi.add(new Student(2, "Bob", 85));
        multi.add(new Student(1, "Alice", 95));
        multi.add(new Student(4, "David", 70));

        while (!multi.isEmpty()) System.out.println(multi.poll());
    }
}
