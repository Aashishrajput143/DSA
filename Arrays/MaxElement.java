public class MaxElement {
    static void max(int arr[]) {
        int n = arr.length;
        boolean isMax;
        for (int i = 0; i < n; i++) {
            isMax = true;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    isMax = false;
                    break;
                }
            }
            if (isMax) {
                System.out.println("max Element : " + arr[i]);
                return;
            }
        }

    }

    static void max2(int arr[]) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max Element : " + max);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 5, 1 };
        max(arr);
        max2(arr);
    }
}
