//It allows Java to decide which version of an overridden method to execute,
// depending on the actual object's type, not the reference type.

class A1{
    void show(){
        System.out.println("show from A1");
    }
}

class B1 extends A1{
    void show(){
        System.out.println("show from b1");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A1 obj = new A1();
        obj.show();

        obj  = new B1();
        obj.show();
        // same object behave differently based on the actual object type
        // This is called dynamic method dispatch or runtime polymorphism
    }
}
