import java.util.Arrays;

public class Anagram {
    static boolean areAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[]a = s1.toCharArray();
        Arrays.sort(a);
        s1=new String(a);

        char[]b = s1.toCharArray();
        Arrays.sort(b);
        s2=new String(b);

        return s1.equals(s2);
    }
    public static void main(String[] args) {
        // str1 and str2 have same characters and same size
        String str1="silent";
        String str2="listen";
        System.out.println(areAnagram(str1, str2));

    }
}
