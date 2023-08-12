public class JosephusProblem {
    static int josephus(int n, int k){
        if(n==1){
            return 1;
        }
        return (josephus(n-1, k)+k-1)%n+1;
    }
    public static void main(String[] args) {
        int result = josephus(13, 2);
        System.out.println(result);
    }
}
