public class Powerof2 {
    public static void main(String[] args) {
        int n=16;
        int ans = n & n-1;
        if(ans==0){
            System.out.println("Power of 2");
        }
        else{
            System.out.println("Not Power of 2");
        }
        
    }
}
