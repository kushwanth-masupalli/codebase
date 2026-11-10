/**
 *    a java stream lets us to process a collection of data  using operatoins such as filtering,transforming , sorting and collecting
 */
import java.util.*;
public class StreamDemo{
    public static void main(String args[]){
        List<Integer> nums = List.of(10, 15, 20, 25, 30);
        for(int i : nums) System.out.println(i);
    }
}