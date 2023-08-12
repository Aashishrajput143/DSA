public class Factorial {
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return fact(n-1) * n;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
        int n= 5;
        int fact =1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
