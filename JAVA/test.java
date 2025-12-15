public class test{
    
    public static void main(String[] args) {
        System.out.println("Main method executed");
        // You can add more code here to test the static block
        System.out.println("Value of a in class b: " + b.a);
    }
}

class b{
    static int a = 10;
    static{
        System.out.println("static block of class b");
    }
}
