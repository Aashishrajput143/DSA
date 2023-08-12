public class PrintPattern3 {
    static void PrintPattern(int row,int currentrow){
        if(row==0){
            return;
        }
        printspace(row);
        printstar(currentrow);
        System.out.println();
        PrintPattern(row-1, currentrow+1);
    }
    static void printstar(int n){
            if(n==0){
                return;
            }
            System.out.print("* ");
            printstar(n-1);
        }
    static void printspace(int n){
        if(n==1){
            return;
        }
        System.out.print(" ");
        printspace(n-1);

    }
    public static void main(String[] args) {
        PrintPattern(8, 1);
        int n=8;
        System.out.println();
        for(int i=0;i<n;i++){
            for(int k=i;k<n-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
