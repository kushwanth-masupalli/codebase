import java.util.*;

public class Team{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int count =0;
        for(int i=0;i<n;i++){
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            int t3 = sc.nextInt();
            if(t1+t2+t3>=2){
                count++;
            }
        }

        System.out.println(count);
    }
}