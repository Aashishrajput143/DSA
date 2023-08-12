public class SubSequenceTree {
    static void printsequence(String str,String res){
        if(str.length()==0){
            System.out.print(res+",");
            return;
        }
        // result is used to store results for printing
        // assume the string is "abc"
        // "abc" - 'a'
        char singleChar = str.charAt(0);
        
        // get the remaining string
        // "abc" - "bc"
        String remaining = str.substring(1);
        printsequence(remaining, res);
        printsequence(remaining, res+singleChar);
    }
    public static void main(String[] args) {
        printsequence("abc", "");
    }
}
