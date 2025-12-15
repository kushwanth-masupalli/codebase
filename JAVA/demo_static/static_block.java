package demo_static;

/*
 *    when the static block is executed?
 *   
 *    when there is object of the class created
 *    when the static memeber is accessed through the classname.variableName;
 *     
 */

class mobile {
    String  brand;
    int price;
    String network;
    static String name;

    static{
        name = "smartphone";
        System.out.println("name is "+name);
    }
}
public class static_block{
    public static void main(String[] args) {
         @SuppressWarnings("unused")
        mobile obj  = new mobile();
        //  obj.brand= "apple";
        //  obj.price = 1300;
        //  obj.network = "5g";
        System.out.println(mobile.name);

        //  mobile obj1 = new mobile();
        //  obj1.brand = "samsung";
        //  obj1.price = 1343;
        //  obj1.network = "5g";
         
         
    }
}