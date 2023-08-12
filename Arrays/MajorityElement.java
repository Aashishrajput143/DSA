public class MajorityElement {
    static int approach(int arr[],int n){
        int majorcount=n/2;
        for (int i : arr) {
            int count =0;
            for (int j : arr) {
                if(j==i){
                    count++;
                }
            }
            if(count>majorcount){
                return i;
            }
        }
        return -1;
    }
    //hashmap

    //optimized approach - boyer moore's voting algorithm
    static int approach2(int arr[],int n){
        int count =0;
        int majorelement=0;
        for (int i = 0; i < n; i++) {
            if(count==0){
                majorelement=arr[i];
            }
            if(majorelement==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        count=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==majorelement){
                count++;
            }
        }
        int ans = count>n/2? majorelement:-1;
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,2,1,1,2,2,2,2};
        int n=arr.length;
        //int res=approach(arr, n);
        int res=approach2(arr, n);
        System.out.println(res);
    }
}
