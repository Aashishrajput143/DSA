public class CountDigit {
    static int CD(int n, int count){
        if(n==0){
            return count;
        }
        count++;
        n=n/10;
        return CD(n,count);
        
    }
    public static void main(String[] args) {
        System.out.println(CD(12345,0));
        int count=0;
        int n=12345;
        while(n!=0){
            count++;
            n = n/10;
        }
        System.out.println(count);
    }
}
