import java.util.Arrays;
import java.util.HashMap;

public class SmallerNumber {
    static int[] bruteforce(int arr[]){
        int n = arr.length;
        int count =0;
        int output[]=new int[n];
        for (int i = 0; i < n; i++) {
            count=0;
            for (int j = 0; j < n; j++) {
                if(arr[i]>arr[j]){
                    count++;
                }
            }
            output[i]=count;
        }
        return output;
    }
    //Approach (Use Sorting) TC : O(nlogn)
    // After sorting :[1,2,2,3,8]
    static int[] Approach(int arr[]){
        int n= arr.length;
        int org[]=arr.clone();// keep the clone in a org variable
        Arrays.sort(arr);    // After sorting :[1,2,2,3,8]
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.putIfAbsent(arr[i], i);
        }
        int output[]=new int[n];
        for (int i = 0; i < output.length;  i++) {
            output[i]=map.get(org[i]);
        }
        return output;
    }
    static int[] Approach2(int arr[]){
        int n= arr.length;
        int hash[]=new int[101];
        int output[]=new int[n];
        for (int i = 0; i < n; i++) {
            if(hash[arr[i]]==0){
                hash[arr[i]]=1;
            }
            else{
                hash[arr[i]] +=1;
            }
        }
        //for (int i : hash) {
           // System.out.print(i+",");
        //}
        // Prefix sum Array
        for (int i = 1; i < hash.length;  i++) {
            int prev = hash[i-1];
            int curr = hash[i];
            hash[i]=prev+curr;
        }
        //for (int i : hash) {
            //System.out.print(i+",");
        //}
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                output[i]=0;
            }
            else{
                output[i]=hash[arr[i]-1];
            }
        }
        return output;
    }
    public static void main(String[] args) {
        int arr[]={8,1,2,2,3};
        //int output[]=bruteforce(arr);
        //int output[]=Approach(arr);
        int output[]=Approach2(arr);
        for (int i : output) {
            System.out.print(i+",");
        }
    }
}
