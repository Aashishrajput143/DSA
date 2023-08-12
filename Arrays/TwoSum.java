import java.util.HashMap;

public class TwoSum {
    static void approach(int arr[], int target) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == target) {
                    System.out.println("pair : " + arr[i] + "," + arr[j]);
                    return;
                }
            }
        }
        System.out.println("not found...");
    }

    static void approach_1(int arr[], int target) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == target) {
                    System.out.println("pair : " + i + "," + j);
                    return;
                }
            }
        }
        System.out.println("not found...");
    }

    static void approach_2(int arr[], int target) {
        // TC : O(n)
        // sC : O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int e : arr) {
            if (map.get(e) == null) {
                map.put(target - e, e);
            } else { 
                System.out.println(map.get(e) + "," + e);
                break;
            }
        }
    }
    static void approach_3(int arr[], int target) {
        // TC : O(n)
        // sC : O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++) {
            if (map.get(arr[i]) == null) {
                map.put(target - arr[i], i);
            } else { 
                System.out.println(map.get(arr[i]) + "," + i);
                return;
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 50 };
        approach(arr, 6);
        approach_1(arr, 6);
        approach_2(arr, 6);
        approach_3(arr, 6);
    }
}
