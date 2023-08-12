public class ClearLastIthBit {
    public static void main(String[] args) {
        int n=30;
        int k=3;//start from 1
        int mask = ~0<<k;
        int ans = n & mask;//negation of mask
        System.out.println(ans);
    }
}
