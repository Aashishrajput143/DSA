public class BarChart {
    static int max2(int arr[]) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static void chart(int arr[]){
        int max = max2(arr);
        System.out.println(max);
        for(int i=max;i>=1;i--){
            for(int j=0;j<arr.length;j++){
                if(i<=arr[j]){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 0, 5, 6 };
        chart(arr);
    }
}
