public class BuySellStock {
    static void approach(int arr[]){
        int first=0;
        int last=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(max<(arr[j]-arr [i])){
                    max=arr[j]-arr[i];
                    first =arr[i];
                    last=arr[j];
                }
            }
        }
        System.out.println(first+" , "+last);
    }
    static void approach2(int arr[]){
        int n = arr.length;
        int profit =0;
        int finalprofit = 0;
        int prefixmin[]=new int[n];
        prefixmin[0]=arr[0];
        for (int i = 1; i<n; i++) {
            prefixmin[i]=Math.min(prefixmin[i-1], arr[i]);
        }
        for(int i=1;i<n;i++){
            finalprofit =arr[i]-prefixmin[i];
            profit = Math.max(finalprofit, profit);
        }
        System.out.println(profit);
    }
    //Best approach
    static void approach3(int arr[]){
        int n = arr.length;
        int profit =0;
        int finalprofit = 0;
        int min=arr[0];
        for(int i=1;i<n;i++){
            finalprofit =arr[i]-min;
            profit = Math.max(finalprofit, profit);
            min=Math.min(min, arr[i]);
        }
        System.out.println(profit);
    }
    public static void main(String[] args) {
        int arr[]={7,1,4,3,6,4};
        approach2(arr);
    }
} 
