public class ToeplitzMatrix {
    static boolean checktoeplitz(int x[][]){
        for (int i = 0; i < x.length-1; i++) {
            for (int j = 0; j < x[i].length-1; j++) {
                if(x[i][j] != x[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int x[][]= {{1,2,3,4},
                    {5,1,2,3},
                    {4,5,1,2}};
        System.out.println(checktoeplitz(x));
        //for (int i = 0; i < x.length-1; i++) {
         //   for (int j = 0; j < x[i].length-1; j++) {
          //      if(x[i][j] != x[i+1][j+1]){
           //         System.out.println("Not Toeplitz");
            //    }
            //}
        //}
        //System.out.println("Toeplitz");
    }
}
