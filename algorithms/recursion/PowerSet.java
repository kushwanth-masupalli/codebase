public class PowerSet {
    public static void main(String[] args) {
        String s = "abc";
        helper(s,"",0);
    }

    public static void helper(String s, String curr, int i){
        if(i==s.length()){
            System.out.println(curr);
            return ;
        }
        helper(s, curr+String.valueOf(s.charAt(i)), i+1);
        helper(s, curr, i+1);
    }
}
