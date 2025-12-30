package OOPs.Inheritance;

public class ThisKeywordExample {
    int num;
    String name;

    // 3. Constructor chaining using this()
    ThisKeywordExample() {
        this(42, "Default Name");  // calls parameterized constructor
        System.out.println("Default constructor called");
    }

    ThisKeywordExample(int num, String name) {
        // 1. Refer to current object's instance variables using this
        this.num = num;
        this.name = name;
        System.out.println("Parameterized constructor called: num = " + this.num + ", name = " + this.name);
    }

    // 2. Invoke current class method using this
    void display() {
        System.out.println("Display method called: num = " + this.num + ", name = " + this.name);
    }

    // 4. Pass current object as parameter using this
    void passThis(ThisKeywordExample obj) {
        System.out.println("Inside passThis method");
        obj.show();
    }

    void invokePassThis() {
        passThis(this);  // passing current object
    }

    void show() {
        System.out.println("Show method called: num = " + this.num + ", name = " + this.name);
    }

    // 5. Return current object using this (method chaining example)
    ThisKeywordExample setNum(int num) {
        this.num = num;
        return this;  // returning current object
    }

    ThisKeywordExample setName(String name) {
        this.name = name;
        return this;  // returning current object
    }

    public static void main(String[] args) {
        // Using default constructor (demonstrates constructor chaining)
        ThisKeywordExample obj = new ThisKeywordExample();

        // Using method to display data (demonstrates invoking current class method)
        obj.display();

        // Passing current object as parameter
        obj.invokePassThis();

        // Method chaining by returning this
        obj.setNum(100).setName("Updated Name").display();
    }
}
