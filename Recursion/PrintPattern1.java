public class PrintPattern1 {
    static void PrintPattern(int row,int currentrow){
        if(row==0){
            return;
        }
        printstar(currentrow);
        System.out.println();
        PrintPattern(row-1, currentrow+1);
    }
    static void printstar(int n){
            if(n==0){
                return;
            }
            System.out.print("*");
            printstar(n-1);
        }
    public static void main(String[] args) {
        PrintPattern(5,1);
        int n=5;
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
