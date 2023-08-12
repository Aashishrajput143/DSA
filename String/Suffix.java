public class Suffix {
    static void findsuffix(String str){
        int n= str.length();
        String [] suffixes = new String[n];
        for (int i = 0; i <n; i++) {
            suffixes[i]=str.substring(n-1-i);
        }
        System.out.println("The suffixes are :");
        for (String i : suffixes) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        String str = "abcd";
        findsuffix(str);
        for (int i = str.length()-1; i >= 0; i--) {
            String temp = str.substring(i);
            System.out.print(temp + ",");
        }
    }
}
