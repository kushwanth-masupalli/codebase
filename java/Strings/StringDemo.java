package Strings;

public class StringDemo {
    public static void main(String[] args) {
        // 1. Definition and Creation
        String s1 = "Hello";              // String literal
        String s2 = new String("World");  // Using new keyword

        // 2. Strings are immutable
        String original = "Java";
        original.concat(" Programming");
        System.out.println("Original string (unchanged): " + original); // Java

        // 3. Concatenation
        s1 = s1 + " " + s2;
        
        System.out.println("Concatenated: " + s1); // Hello World

        // 4. String comparison
        String a = "test";
        String b = "test";
        String c = new String("test");

        System.out.println("a == b: " + (a == b));          // true (both refer to same object in string pool)
        System.out.println("a == c: " + (a == c));          // false (different objects)
        System.out.println("a.equals(c): " + a.equals(c));  // true (checks value)

        // 5. Useful Inbuilt Methods
        String str = "  Java Programming  ";

        System.out.println("Length: " + str.length());                  // 20
        System.out.println("Char at index 5: " + str.charAt(5));        // P
        System.out.println("Substring(2, 6): " + str.substring(2, 6));  // va P
        System.out.println("To Uppercase: " + str.toUpperCase());      // JAVA PROGRAMMING
        System.out.println("To Lowercase: " + str.toLowerCase());      // java programming
        System.out.println("Trimmed: '" + str.trim() + "'");           // Java Programming
        System.out.println("Replace 'a' with '*': " + str.replace('a', '*')); // J*v* Progr*mming
        System.out.println("Contains 'Java': " + str.contains("Java")); // true
        System.out.println("Starts with '  J': " + str.startsWith("  J")); // true
        System.out.println("Ends with 'g  ': " + str.endsWith("g  "));   // true
        System.out.println("Index of 'a': " + str.indexOf('a'));        // 3
        System.out.println("Last index of 'a': " + str.lastIndexOf('a')); // 14
        System.out.println("Is empty: " + str.isEmpty());               // false

        // 6. Splitting strings
        String data = "apple,banana,grape";
        String[] fruits = data.split(",");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // 7. Converting other types to String
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println("Number as String: " + numStr);

        // 8. String joining
        String joined = String.join(" | ", "One", "Two", "Three");
        System.out.println("Joined string: " + joined); // One | Two | Three
    }
}
/*
 *    String Pool 
 *     
 * 
 *    What is a String Pool?

A String Pool, also known as a String Constant Pool or Intern Pool, is a data structure used by 
Java Virtual Machine (JVM) to manage and store string literals.

How does it work?


The JVM creates an object for this string in the String Pool. The String Pool is a cache of
 strings that have been previously created. If another part of your code tries to create a
  string with the same content as "Hello", the JVM will not create a new object, but instead 
  return a reference to the existing one from the String Pool.

Benefits

Using a String Pool has several benefits:

Memory savings: By reusing existing strings, you avoid creating duplicate objects, which can 
lead to memory waste and garbage collection overhead.
Faster string operations: Since strings are reused, operations like concatenation or searching
 become more efficient, as they don't need to create new objects.
Code optimization: The JVM can optimize code that uses the same string literals multiple times.
How is it implemented?

The String Pool is a part of the Java Runtime Environment (JRE) and is managed by the String.
intern() method. When you call intern() on a string, the JVM checks if there's an equivalent 
string in the pool. If not, it creates a new object and adds it to the pool.
 */