public class SecondMax {
    static void max(int arr[]) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int secmax = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] != max) {
                if (arr[i] > secmax) {
                    secmax = arr[i];
                }
            }
        }
        System.out.println("Second max Element : " + secmax);
    }

    static void max2(int arr[]) {
        int n = arr.length;
        int max = arr[0];
        int secmax = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] != max) {
                if (arr[i] > secmax) {
                    secmax = arr[i];
                }
            }
        }
        System.out.println("Second max Element : " + secmax);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 6, 5, 1 };
        max(arr);
        max2(arr);
    }
}
