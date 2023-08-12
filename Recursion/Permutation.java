import java.util.ArrayList;

public class Permutation {
        static ArrayList<String> solution(String str){
        if(str.length()==0){
            ArrayList <String> list = new ArrayList<>();
            list.add("");
            return list;

        }
        char current = str.charAt(0);
        String remaining = str.substring(1);
        ArrayList <String> temp = solution(remaining);
        ArrayList <String> result = new ArrayList<>();
        for(String s: temp){
            for(int i=0;i<=s.length();i++){
                StringBuffer sb = new StringBuffer(s);
                sb.insert(i, current);
                result.add(sb.toString());
            }
        }
        return result;


    } 
    public static void main(String[] args) {
        String str ="abc";
        ArrayList<String> result=solution(str);
        System.out.println(result);
    }
}
