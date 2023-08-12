public class Prefix {
    public static void main(String[] args) {
        String str = "abcd";
        for (int j = 1; j <= str.length(); j++) {
            String temp = str.substring(0, j);
            System.out.print(temp + ",");
        }
    }
}
