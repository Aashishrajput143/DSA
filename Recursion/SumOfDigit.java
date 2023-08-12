public class SumOfDigit {
    
    static int SOD(int n, int sum){
        if(n==0){
            return sum;
        }
        sum+=n%10;
        n=n/10;
        return SOD(n,sum);
        
    }
    public static void main(String[] args) {
        System.out.println(SOD(12345,0));
        int n=12345;
        int sum=0;
        while(n!=0){
            sum= sum + n%10;
            n=n/10;
        }
        System.out.println(sum);
    }
}
