// package recursion;
import java.util.*;
public class GenereateParantheses {
   
    public static void main(String[] args) {
        Solution s = new Solution();
        List<String> res = s.generateParenthesis(1);

        System.out.println(res);
    
}

}


class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(n, result, new StringBuilder());
        return result;
    }

    public static void helper(int n, List<String> result, StringBuilder para) {
        if (para.length() == n * 2) {
            result.add(para.toString());
            return;
        }

        for (int i = 0; i < n; i++) {
            helper(n - 1, result, para.insert(i, "()"));
        }
    }
}
