public class MaxSumConsecutiveElement {
    static void Approach(int arr[], int k) {
        int maxSum = 0;
        for (int i = 0; i + k - 1 < arr.length; i++) { // i<arr.length-2
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += arr[i + j];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println("Max Sum : " + maxSum);
    }

    //Using window sliding technique
    static void Approach2(int arr[], int k) {
        int slidesum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            slidesum += arr[i];
        }
        maxSum = slidesum;
        for (int i = k; i < arr.length; i++) {
            slidesum += arr[i] - arr[i - k];
            if (slidesum > maxSum) {
                maxSum = slidesum;
            }
        }
        System.out.println("Max Sum : " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 40, 30, 10, 20, 5 };
        int k = 3;
        Approach2(arr, k);

    }
}
