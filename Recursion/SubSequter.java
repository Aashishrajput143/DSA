import java.util.ArrayList;

public class SubSequter {
    static ArrayList<String> solution1(String str){
        ArrayList <String> list = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char current = str.charAt(i);       

            if(list.size()==0){
                list.add("");
                list.add(""+current);
                continue;
            }
            int x = list.size();
            for(int j=0;j<x;j++){
               String temp = list.get(j)+current;
               if(!list.contains(temp)){
                    list.add(temp);
               }
            }
        }
        
        return list;
    }

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
            result.add(s);
            result.add(current+s);
        }
        return result;


    } 
    public static void main(String[] args) {
        String str ="Ravi";
        ArrayList<String> a=solution1(str);
        ArrayList<String> result=solution(str);
        System.out.println(a);
        System.out.println(result);
    }
}
