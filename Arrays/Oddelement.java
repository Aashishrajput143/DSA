public class Oddelement {
    static void solution(int arr[]){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans^arr[i];
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,5,5,6,6};
        solution(arr);
    }
}
