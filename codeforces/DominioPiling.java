import java.util.*;
public class DominioPiling{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int d1 =2;
        int d2 =1;

        System.out.println(Math.max((m/d1 * n/d2),(m/d2 * n/d1)));
    }
}