public class PairArray {
    public static void main(String[] args) {
        int arr[] = { 10, 10, 20, 20, 30 };
        int ans=0;
        for (int i = 0; i < arr.length-1; i=i+2) {
            int temp = arr[i] ^ arr[i+1];
            if(temp>0){
                ans=arr[i];
            }
        }
        System.out.println(ans);
        }
    }
