public class RotateArray {
    static void approach1(int arr[], int k) {
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            int x = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = x;
        }
    }
    static void approach2(int arr[], int k) {
        int n = arr.length;
        // use extra space
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i+k) % n]=arr[i];
            arr[i]=temp[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i]+",");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 ,7};
        //approach1(arr, 4);
        System.out.println();
        for (int i : arr) {
           System.out.print(i + ",");
        }
        System.out.println();
        approach2(arr, 4);
    }
}
