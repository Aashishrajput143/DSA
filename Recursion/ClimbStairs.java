public class ClimbStairs {
    static int climbstair(int n){
        if(n==1 || n==0){
            return 1;
        }
        else if(n==2){
            return 2;
        }
        else{
            return climbstair(n-2)+climbstair(n-1);
        }
    }
    public static void main(String[] args) {
        int n =4;
        int result = climbstair(n);
        System.out.println(result);
    }
}
