import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    static List<Integer> solution(int arr[][]){
        List<Integer> minRow = new ArrayList<>();
        List<Integer> maxcol = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int minRowE=Integer.MAX_VALUE;
        int maxcolE=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                minRowE=Math.min(minRowE, arr[i][j]);
            }
            minRow.add(minRowE);
            minRowE=Integer.MAX_VALUE;
        }
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                maxcolE=Math.max(maxcolE, arr[j][i]);
            }
            maxcol.add(maxcolE);
            maxcolE=Integer.MAX_VALUE;
        }
        for (int each : minRow) {
            if(maxcol.contains(each)){
                result.add(each);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int x[][]={{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> ans = solution(x);
        System.out.println(ans);
    }
}
