package recursion;

public class Subsets {
    public static void main(String[] args) {
        String input = "abc";
        helper(input,0,new StringBuilder(""));


    }

    private static void helper(String input,int i ,StringBuilder sb) {
         if(i==input.length()) {
             System.out.println(sb.toString());
             return ;
         }
          helper(input,i+1,sb);
          sb.append(input.charAt(i));
          helper(input,i+1,sb);
          sb.deleteCharAt(sb.length()-1);


    }
}
