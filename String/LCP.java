public class LCP {
    static int minLength(String arr[], int n){
        int min = arr[0].length();
        for (int i = 0; i < n; i++) {
            if(arr[i].length()<min){
                min = arr[i].length();
            }
        }
        return min;
    }
    static String CommonPrefix(String arr[], int n){
        int minLen = minLength(arr, n);
        String ans ="";
        for (int i = 0; i < minLen; i++) {
            char current = arr[0].charAt(i);
            for (int j = 1; j < n; j++) {
                if(arr[j].charAt(i)!=current){
                    return ans;
                }
            }
            ans+=current;
        }
        if(ans.isEmpty()){
            System.out.println("No Common Perfix Found");
        }
        return ans;

    }
    public static void main(String[] args) {
        String arr[]={"like","listen","lime","lists"};
        int n = arr.length;
        String ans = CommonPrefix(arr, n);
        System.out.println("LCP : "+ans);
    }
}
