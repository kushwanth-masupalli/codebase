package Strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // 1. Declaration and Initialization
        StringBuilder sb1 = new StringBuilder(); // default capacity = 16
        StringBuilder sb2 = new StringBuilder("Hello"); // initial content = Hello

        System.out.println("sb1 initial capacity: " + sb1.capacity()); // 16
        System.out.println("sb2 initial capacity: " + sb2.capacity()); // 16 + "Hello".length() = 21

        // 2. Capacity and memory growth
        StringBuilder sb = new StringBuilder();
        System.out.println("Initial capacity: " + sb.capacity()); // 16

        sb.append("12345678901234567"); // 17 characters
        System.out.println("After append capacity: " + sb.capacity()); // capacity grows

        // Growth formula:
        // New Capacity = (Old Capacity * 2) + 2
        // So (16 * 2) + 2 = 34

        sb.append("ExtraText"); // More append
        System.out.println("After more append: " + sb.toString());
        System.out.println("New capacity: " + sb.capacity());

        // 3. StringBuilder is mutable
        StringBuilder mutable = new StringBuilder("Java");
        mutable.append(" Programming");
        System.out.println("After append: " + mutable); // Java Programming

        // 4. Common Inbuilt Methods
        StringBuilder sbDemo = new StringBuilder("Welcome");

        sbDemo.append(" to Java"); // Adds to end
        System.out.println("Append: " + sbDemo);

        sbDemo.insert(8, "World "); // Inserts at index
        System.out.println("Insert: " + sbDemo);

        sbDemo.replace(0, 7, "Hello"); // Replace a range
        System.out.println("Replace: " + sbDemo);

        sbDemo.delete(6, 11); // Delete a range
        System.out.println("Delete: " + sbDemo);

        sbDemo.reverse(); // Reverses the content
        System.out.println("Reverse: " + sbDemo);

        sbDemo.reverse(); // Re-reverse to original
        sbDemo.setCharAt(0, 'h'); // Change character
        System.out.println("SetCharAt: " + sbDemo);

        System.out.println("Length: " + sbDemo.length());
        System.out.println("Capacity: " + sbDemo.capacity());
        System.out.println("CharAt(1): " + sbDemo.charAt(1));
        System.out.println("Substring(0, 5): " + sbDemo.substring(0, 5));
    }
}



/*
 *    if the stringbuilder capcaity exceeds the thing it will do  is double the capacity+2 
 * 
 */