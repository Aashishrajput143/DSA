import java.util.ArrayList;

public class Mazepathdiagonal {
    static ArrayList<String> mazepath(int currentrow,int currentcol,int endrow,int endcol){
        if(currentrow==endrow && currentcol==endcol){
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }
        if(currentrow>endrow || currentcol>endcol){
            ArrayList<String> temp = new ArrayList<>();
            return temp;
        }
        ArrayList<String> result = new ArrayList<>();

        ArrayList<String> resultvertical = mazepath(currentrow+1, currentcol, endrow, endcol);
        for(String temp : resultvertical){
            result.add("V"+temp);
        }
        ArrayList<String> resulthorizontal = mazepath(currentrow, currentcol+1, endrow, endcol);
        for(String temp:resulthorizontal){
            result.add("H"+temp);
        }
        ArrayList<String> resultdiagonal = mazepath(currentrow+1, currentcol+1, endrow, endcol);
        for(String temp:resultdiagonal){
            result.add("D"+temp);
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<String> result = mazepath(0, 0, 2, 2);
        System.out.println(result);
        System.out.print(result.size());
    }
}
