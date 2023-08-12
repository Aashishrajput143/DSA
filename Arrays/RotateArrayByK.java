public class RotateArrayByK {
    static void reverse(int arr[], int i, int k) {
        while (i < k) {
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
            i++;
            k--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k=4;
        int n=arr.length;
        k= k % arr.length;
        reverse(arr, 0, n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr, 0, n-1);
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
