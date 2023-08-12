public class ClearIthBit {
    public static void main(String[] args) {
        int n=13;
        int k=2;//start from 0
        int mask = 1<<k;
        int ans = n & ~mask;//negation of mask
        System.out.println(ans);
    }
}
