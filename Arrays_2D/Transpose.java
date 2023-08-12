public class Transpose {
    static void transpose(int x[][]){
        int temp=0;
        System.out.println("Before Transpose");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]+",");
            }
            System.out.println();
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = i+1; j < x[i].length; j++) {
                temp=x[i][j];
                x[i][j]=x[j][i];
                x[j][i] = temp;
            }
        }
        System.out.println("After Transpose");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]+",");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int x[][]= {{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        transpose(x);
    }
}
