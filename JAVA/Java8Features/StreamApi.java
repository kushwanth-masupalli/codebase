package Java8Features;


/*
 * The Stream API provides a high-level abstraction for processing sequences
 *  of elements (like lists or sets) using a declarative (what-to-do) approach
 *  rather than an imperative (how-to-do) approach.
 */
import java.util.*;
import java.util.stream.*;

public class StreamApi {
    public static void main(String[] args) {

        // Sample list
        List<Integer> numbers = Arrays.asList(2, 3, 5, 6, 8, 10, 13, 15);

        // 1. Filter: Print even numbers
        System.out.println("Even Numbers:");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        // 2. Map: Square each number
        System.out.println("\nSquares:");
        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);

        // 3. Sorted: Ascending sort
        System.out.println("\nSorted Numbers:");
        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        // 4. Reduce: Sum of all numbers
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);
        System.out.println("\nSum: " + sum);

        // 5. Collect: Filter and collect into new list
        List<Integer> oddNumbers = numbers.stream()
                                          .filter(n -> n % 2 != 0)
                                          .collect(Collectors.toList());
        System.out.println("\nOdd Numbers List: " + oddNumbers);

        // 6. Count: Count numbers greater than 5
        long count = numbers.stream()
                            .filter(n -> n > 5)
                            .count();
        System.out.println("\nCount of numbers > 5: " + count);

        // 7. Min and Max
        int min = numbers.stream().min(Integer::compare).orElseThrow();
        int max = numbers.stream().max(Integer::compare).orElseThrow();
        System.out.println("\nMin: " + min);
        System.out.println("Max: " + max);

        // 8. Distinct and limit
        System.out.println("\nDistinct and Limited:");
        Arrays.asList(1, 2, 2, 3, 3, 4, 5, 6)
              .stream()
              .distinct()
              .limit(3)
              .forEach(System.out::println);
    }
}
