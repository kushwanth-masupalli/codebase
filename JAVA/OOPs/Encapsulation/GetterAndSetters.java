package OOPs.Encapsulation;

class Medf {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // // Setter method
    // void set_name(String a) {
    //     name = a;
    // }

    // // Getter method
    // void get_name() {
    //     System.out.println("Name is " + name);
    // }
}

public class GetterAndSetters {
    public static void main(String[] args) {
        Medf o = new Medf();
        o.setName("Kushwanth");  // Setting name
        System.out.println(o.getName());  // Getting and printing name
    }
}
