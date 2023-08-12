import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    static List<String> generate(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans, "", 0, 0, n);
        return ans;
    }

    static void helper(List<String> ans, String current, int open, int close, int max) {
        if(current.length()==max*2){
            ans.add(current);
            return;
        }
        if (open < max) {
            helper(ans, current+"(", open + 1, close, max);
        }
        if (close < open) {
            helper(ans, current+")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
       List<String> result = generate(5);
       System.out.println(result);
    }
}
