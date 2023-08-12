public class RotateArrayOnce {
    static void rotate(int arr[]){
        int n= arr.length;
        int x = arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=x;
    }
    static void rotate1(int arr[]){
        int i=0,j=arr.length-1;
        int temp;
        while(i<j){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        rotate1(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
