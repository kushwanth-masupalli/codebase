package Arrays;
//Array : array is a data structure used to store multiple
//  values of the same datatype in a single variable .
//        we can easily access them using index.

public class Array{
    public static void main(String[] args) {

        //declaration of an array 
        @SuppressWarnings("unused")
        int [] abc;
        abc = new int[12];
        



        // 1. Default Initialization
        @SuppressWarnings("unused")
        int[] defaultArray = new int[5]; // Default values: [0, 0, 0, 0, 0]

        // 2. Static Initialization (Array Literal)
        @SuppressWarnings("unused")
        int[] staticArray = {10, 20, 30, 40, 50}; // Predefined values

        // 3. Dynamic Initialization
        int[] dynamicArray = new int[5];
        for (int i = 0; i < dynamicArray.length; i++) {
            dynamicArray[i] = i * 10; // Dynamically assign values: [0, 10, 20, 30, 40]
        }

        // 4. Partially Initialized Array
        int[] partialArray = new int[5];
        partialArray[0] = 10;
        partialArray[2] = 30; // [10, 0, 30, 0, 0]

        // 5. Using Another Array for Initialization
        int[] originalArray = {1, 2, 3};
        
        @SuppressWarnings("unused")
        int[] copiedArray = originalArray; // Both point to the same memory

        // 6. Anonymous Array (One-Time Use)
        // Example of anonymous array usage
        printArray(new int[]{5, 10, 15}); // Pass an anonymous array to a method

        // 7. Array of Strings
        @SuppressWarnings("unused")
        String[] stringArray = {"Java", "Python", "C++"};

        // 8. Multidimensional Array (Matrix)
        @SuppressWarnings("unused")
        int[][] multiArray = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Jagged Array
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2]; // First row: 2 columns
        jaggedArray[1] = new int[3]; // Second row: 3 columns
        jaggedArray[2] = new int[1]; // Third row: 1 column

        // The arrays are now initialized and ready for use.
    }

    // Helper method to demonstrate anonymous array usage
    static void printArray(int[] arr) {
        // This method is included to show how arrays can be passed to methods
    }
}
