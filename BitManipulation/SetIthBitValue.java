public class SetIthBitValue {
    public static void main(String[] args) {
        int n=13;
        int k=2;//start from 0
        //int b=1;
        int b=0;
        int mask = 1<<k;
        int clear = n & ~mask;//negation of mask
        int ans = clear | b<<k;
        System.out.println(ans);
    }
}
