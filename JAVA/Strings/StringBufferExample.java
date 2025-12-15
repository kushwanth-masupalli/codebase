package Strings;
public class StringBufferExample {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer buffer = new StringBuffer("Kushwanth");

        // append(): Adds text to the end of the StringBuffer
        buffer.append(" Royal");
        System.out.println("After append: " + buffer);

        // insert(): Inserts text at the specified index
        buffer.insert(11, "the Great ");
        System.out.println("After insert: " + buffer);

        // delete(): Deletes text from the specified range (startIndex, endIndex)
        buffer.delete(11, 22); // Removing "the Great"
        System.out.println("After delete: " + buffer);

        // reverse(): Reverses the string
        buffer.reverse();
        System.out.println("After reverse: " + buffer);

        // replace(): Replaces text between specified indices with new text
        buffer.replace(0, 5, "Royal");
        System.out.println("After replace: " + buffer);

        // capacity(): Returns the current capacity of the StringBuffer
        System.out.println("Capacity: " + buffer.capacity());

        // length(): Returns the current length of the StringBuffer
        System.out.println("Length: " + buffer.length());

        // charAt(): Accesses a character at a specific index
        System.out.println("Character at index 2: " + buffer.charAt(2));

        // substring(): Extracts a substring from the StringBuffer (startIndex, endIndex)
        String subString = buffer.substring(0, 5);
        System.out.println("Substring (0, 5): " + subString);

        // Ensure enough capacity using ensureCapacity() to avoid resizing
        buffer.ensureCapacity(100);
        System.out.println("New capacity after ensureCapacity(100): " + buffer.capacity());
    }
}
//only one difference between StringBuilder and StringBuffer that is StringBuffere is
//therad safe
