public class PalindromeSubstring {
    static boolean Palindrome( String temp){
        int i=0;
        int j= temp.length()-1;
        while(i<=j){
            if(temp.charAt(i)!=temp.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static void substring(String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                String temp = str.substring(i, j);
                if(Palindrome(temp)){
                    System.out.print(temp+",");
                }
            }
        }
    }
    public static void main(String[] args) {
        String str ="abbc";
        substring(str);
    }
}
