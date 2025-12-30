package Arrays;
// class student{
//     int id;
//     String name ;
//     String dept ;
//     int fees;
//     // student(int a,String b, String c ,int d){
//     //     id = a;
//     //     name = b;
//     //     dept = c;
//     //     fees = d;
//     // }
// }

// public class Array_of_Objects {
//     public static void main(String[] args) {
//         //int [] arr = new int[39];
//         student [] list = new student[3];
//         list[0] = new student();
//         list[1] = new student();
//         list[2] = new student();
//         list[0].id = 1;
//         list[1].id = 2;
//         list[2].id = 3;
//         for(student s : list){
//             System.out.println(s.id);
//         }
//     }
// }



class student{
    int id;
    String name ;
    String dept ;
    int fees;
    student(int a,String b, String c ,int d){
        id = a;
        name = b;
        dept = c;
        fees = d;
    }
}

public class Array_of_Objects {
    public static void main(String[] args) {
        //int [] arr = new int[39];
        student [] list = new student[3];
        list[0] = new student(1,"ksuh","dkfj",23);
        list[1] = new student(2,"dkfj","kdfjd",34);
        list[2] = new student(3,"kdjfd","iena",434);
        
        for(student s : list){
            System.out.println(s.id);System.out.println(s.name);System.out.println(s.fees);
        }
    }
}
