public class CountZero {
    static int CZ(int n){
        if(n==0){
            return 1;
        }
        if(n<10){
            return 0;
        }
        else if(n%10==0){
            return 1 + CZ(n/10);
        }
        return CZ(n/10);
    }
    public static void main(String[] args) {
        int n=100100;
        System.out.println(CZ(n));
        int count =0;
        int r=0;
        while(n!=0){
            r=n%10;
            if(r==0){
                count=count+1;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
