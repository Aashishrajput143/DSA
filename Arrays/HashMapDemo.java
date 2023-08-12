import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(2,4);
        map.put(3, 9);
        map.put(4, 16);
        map.put(5, 25);

        int sq = map.get(4);
        System.out.println(sq);

        System.out.println(map.containsKey(3));//check the value inside
        System.out.println(map.containsValue(16));
    }
}
