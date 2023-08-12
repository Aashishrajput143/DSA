public class naiveMatchPattern {
    static int naiveMatch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }
            if(j==m){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String text = "aaaaaab";
        String pattern = "aaab";
        int res = naiveMatch(text, pattern);
        System.out.println(res);
    }
}
