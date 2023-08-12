import java.util.ArrayList;

public class DiceGame {
    static ArrayList<String> game(int current,int target){
        if(current==target){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        if(current>target){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
            ArrayList<String> result = new ArrayList<>();
        for(int dice=1;dice<=6;dice++){
            int newvalue = current+dice;
            ArrayList<String> temp = game(newvalue, target);
            for(String s: temp){
                result.add(dice+s);
            }
        }
        return result; 
    }
    public static void main(String[] args) {
        ArrayList<String> list = game(0, 10);
        System.out.println(list);
        System.out.println(list.size());
    }
}
