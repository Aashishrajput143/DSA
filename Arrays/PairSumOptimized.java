public class PairSumOptimized {
    static void approach(int arr[], int target) {
        // Two pointer approach
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if(arr[i] + arr[j]==target){
                System.out.println("pair : "+i+","+j);
                break;
            }
            if(arr[i]+arr[j]<target)
                i++;
            if(arr[i]+arr[j]>target)
                j--;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,3,5,8,6,7};
        approach(arr, 11);
    }
}
