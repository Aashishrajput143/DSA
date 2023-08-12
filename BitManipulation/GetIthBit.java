public class GetIthBit{
    public static void main(String[] args) {
        int n=12;
        int k=1;//start from 0
        int mask = 1<<k;
        if((n&mask)>0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
} 