public class EvenOrOdd {
    public static void main(String[] args) {
        int n=25;
        int mask = 1<<0;
        int ans = n & mask;
        if(ans>0){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}
