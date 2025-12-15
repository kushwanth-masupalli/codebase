// int a = 5;
// int b = 5;
// System.out.println(a == b); // true (compares values)

// String s1 = new String("Hello");
// String s2 = new String("Hello");
// System.out.println(s1 == s2); // false (different objects in memory)
class laptop {
    String model;
    int price;

    public String toString() {
        return "hey";
    }

    public boolean equals(laptop that) {
        if (this.model.equals(that.model) && this.price == that.price) {
            return true;
        } else {
            return false;
        }
    }
}

public class object_class {
    public static void main(String[] args) {
        laptop obj1 = new laptop();
        obj1.price = 100;
        obj1.model = "lenovo";

        laptop obj2 = new laptop();
        obj2.price = 100;
        obj2.model = "lenovo";

        System.out.println(obj1.equals(obj2));
    }
}
