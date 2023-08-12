public class SignBitSameOrNot {
    public static void main(String[] args) {
        int a=-5;
        int b=-6;
        int ans = a^b;
        if(ans>0){
            System.out.println("Same Sign");
        }
        else{
            System.out.println("Not Same Sign");
        }
    }
}
