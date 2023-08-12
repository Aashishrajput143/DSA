public class SubSetSum {
    static boolean issubsetsum(int n,int arr[],int sum){
        if(sum==0){
            return true;
        }
        if(n==0){
            return false;
        }
        if(arr[n-1]<= sum){
            //include the sum
            return issubsetsum(n-1, arr, sum-arr[n-1])||issubsetsum(n-1, arr, sum);
        }
        else{
            //exclude the sum
            return issubsetsum(n-1, arr, sum);
        }
    }
    public static void main(String[] args) {
       int arr[]={2,3,4,5,6,7};
        System.out.println(issubsetsum(6, arr, 7));
    }
}
