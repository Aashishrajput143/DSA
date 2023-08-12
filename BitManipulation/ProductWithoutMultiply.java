public class ProductWithoutMultiply {
    public static void main(String[] args) {
        int n=10;
        // n * 2.5
        System.out.println((n<<1)+(n>>1));

        int a=5;
        int b=6;
        System.out.println("Direct "+(a^b));
        System.out.println((a&~b)+(~a&b));
    }
}
