public class CountSetBits {
    public static void main(String[] args) {
        int n=13;
        int Count =0;
        //while(n>0){
        //    Count += n&1;
        //    n=n>>1;
        //}
        while(n>0){
            n = n&n-1;
            Count++;
        }
        System.out.println(Count);
    }
}
