package Arrays;

import java.util.Arrays;

public class ArraysPackage {
    public static void main(String[] args) {
        // Example 1: Sorting an array
        int[] numbers = {5, 2, 8, 3, 1};
        System.out.println("Original Array: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Example 2: Reversing an array
        String[] names = {"John", "Alice", "Bob"};
        System.out.println("Original Array: " + Arrays.toString(names));
        reverseArray(names);
        System.out.println("Reversed Array: " + Arrays.toString(names));

        // Example 3: Searching for an element in an array
        int found = Arrays.binarySearch(numbers, 8);
        System.out.println(found);

        // Example 4: Filling an array with a default value
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, -1);
        System.out.println("Filled Array: " + Arrays.toString(fillArray));

        // Example 5: Copying one array to another
        int[] sourceArray = {1, 2, 3};
        int[] destinationArray = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);
        System.out.println("Copied Array: " + Arrays.toString(destinationArray));

        // Example 6: Copying a range of elements from one array to another
        int[] sourceRange = {1, 2, 3, 4, 5};
        int startIndex = 1;
        int endIndex = 4;
        int[] copiedRange = copyRange(sourceRange, startIndex, endIndex);
        System.out.println("Copied Range: " + Arrays.toString(copiedRange));
    }

    public static void reverseArray(String[] array) {
        int length = Math.min(array.length, new int[array.length].length);
        for (int i = 0; i < length / 2; i++) {
            String temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
    }

    public static int[] copyRange(int[] sourceArray, int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex >= sourceArray.length || startIndex > endIndex) {
            throw new IllegalArgumentException("Invalid range specified.");
        }
        int length = endIndex - startIndex + 1;
        int[] copiedRange = new int[length];
        System.arraycopy(sourceArray, startIndex, copiedRange, 0, length);
        return copiedRange;
    }
}