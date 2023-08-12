public class Fibseries {
    static int fib(int n){
        if(n<=1){
            return n;
        }
        int res1 = fib(n-1);
        int res2 = fib(n-2);
        int res = res1+res2;
        return res;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
}
