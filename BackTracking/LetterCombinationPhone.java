import java.util.ArrayList;
import java.util.List;

public class LetterCombinationPhone {
    static String keys[] = { "", ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    static List<String> letterCombination(String digits) {
        if (digits.length() == 0) {
            List<String> list = new ArrayList<>();
            return list;
        }
        return letterCombinationhelper(digits);
    }
    static List<String> letterCombinationhelper(String digits) {
        if (digits.length() == 0) {
            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        // get digit at a time
        // if digit is 23 the first will store '2'
        char first = digits.charAt(0);
        int index = first - '0';
        String currentkey = keys[index];
        String remaining = digits.substring(1);
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < currentkey.length(); i++) {
            List<String> res = letterCombinationhelper(remaining);
            for (String s : res) {
                ans.add(currentkey.charAt(i) + s);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> res = letterCombination(digits);
        System.out.println(res);
    }
}
