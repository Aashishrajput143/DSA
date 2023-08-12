public class SetIthBit {
    public static void main(String[] args) {
        int n = 12;
        int k = 1;// start from 0
        int mask = 1 << k;
        int ans = n | mask;
        System.out.println(ans);
    }
}
