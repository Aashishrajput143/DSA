public class SearchAllIndex {
    static int[] searchindex(int arr[],int index,int search,int count) {
        if(index==(arr.length)){
            int a[]=new int[count];
            return a;
        }
        int arr_2[]=null;
        if(arr[index]==search){
            arr_2 = searchindex(arr, index+1, search, count+1);
            arr_2[count]=index;
        }
        else
            arr_2 = searchindex(arr, index+1, search, count);
        return arr_2;

    }
    public static void main(String[] args) {
        int arr[]={2,3,5,5,6,7,9,4,5,6,5};
        int result[] = searchindex(arr, 0, 5, 0);
        for(int i=0;i<=result.length;i++){
            System.out.println(result[i]);
        }
    }
}
