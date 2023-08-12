public class ReverseString {
    static String RS(String str){
        if(str.length()==1){
            return String.valueOf(str.charAt(0));
        }
        return RS(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        String  str="Aashish",nstr="";
        System.out.println(RS(str));
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            nstr = ch+nstr;
        }
        System.out.println(nstr);
    }
}
