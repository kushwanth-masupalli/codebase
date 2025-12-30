package demo_static;

// Static member of a class is indeed a class member because it belongs to the class
//  itself, not to any individual object/instance.

class Mobile {
    String  brand;
    int price;
    String network;
    static String name;

    void show(){
        System.out.println("brand is "+brand);System.out.println("price is "+price);System.out.println("network is "+network);
        System.out.println("name is "+name);
    }

    static void showDetails(Mobile obj){
        System.out.println("brand is "+obj.brand);System.out.println("price is "+obj.price);System.out.println("network is "+obj.network);
        System.out.println("name is "+name); //know why i kept only name here rather than obj.name
    }
}
public class stat_demo{
    public static void main(String[] args) {
         Mobile obj  = new Mobile();
         obj.brand= "apple";
         obj.price = 1300;
         obj.network = "5g";
         Mobile.name = "smartphone";

         Mobile obj1 = new Mobile();
         obj1.brand = "samsung";
         obj1.price = 1343;
         obj1.network = "5g";
        //  obj1.name = "android";
        //  obj.show();obj1.show();
         Mobile.showDetails(obj1);
         Mobile.showDetails(obj);
    }
}