public class SumNNatural{
    static void fun(int n){
        int sum=0,c=0;
        for(int i=0;i<=n;i++){
            sum += i;
            c++;
        }
        System.out.println(sum +","+c);
    }
    static void fun2(int n){
        int sum = (n*(n+1))/2;
        System.out.println(sum);
    }
    static void fun3(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                sum++;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        fun(5);
        fun2(5);
        fun3(5);
    }
}