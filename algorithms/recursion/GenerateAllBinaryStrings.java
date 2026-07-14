import java.util.*;

public class GenerateAllBinaryStrings {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> result = new ArrayList<>();

        helper(n, "", result);
        for(Object i : result){
            System.out.println(i);
        }
    }

    private static void helper(int n, String s, ArrayList<String> result) {
        if (s.length() == n) {
            result.add(s);
            return;
        }

        helper(n, s + "0", result);

        if (s.length() == 0 || s.charAt(s.length() - 1) == '0') {
            helper(n, s + "1", result);
        }
    }
}
