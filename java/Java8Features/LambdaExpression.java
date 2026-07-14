package Java8Features;
// lambda expression comes into picture if and only if we have a functional interface
// A functional interface is an interface that contains only one abstract method.
// A functional interface can have multiple default methods or static methods.

/*
 *  a lambda is a concis way to implement a method of a functional interface.
 *  without createing a class that implements the interface.
 *  A lambda expression can be used to provide the implementation of the 
 *  abstract method of a functional interface.
 * 
 * A lambda expression provides the implementation of a functional interface's 
 * single abstract method. The resulting functional interface object can be
 *  assigned to a variable or passed as a method argument, allowing us to pass
 *  behavior in Java.
 */
@FunctionalInterface
interface Computer{
    public void store();
}

class Laptop implements Computer{
    @Override
    public void store() {
        System.out.println("Laptop is storing data");
    }
}

public class LambdaExpression {
    public static void main(String[] args) {
        // Using a class that implements the interface
        Computer laptop = new Laptop();
        laptop.store();

        // Using a lambda expression
        Computer desktop = (a) -> System.out.println("Desktop is storing data");
        desktop.store();
    }
     
}
