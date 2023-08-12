public class SpiralMatrix {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 4, 6, 7, 1 },
                { 1, 5, 8, 2 },
                { 5, 6, 8, 9 } };
        // number of rows
        int r = arr.length;
        // number of col
        int c = arr[0].length;
        // start row index
        int sr = 0;
        // start col index
        int sc = 0;
        int i;
        while (sr < r && sc < c) {
            // print rows
            for (i = sc; i < c; i++) {
                System.out.print(arr[sr][i] + ",");
            }
            sr++;
            // print cols(last col)
            for (i = sr; i < r; i++) {
                System.out.print(arr[i][c - 1] + ",");
            }
            c--;
            // print rows(last row)
            if (sr < r) {
                for (i = c - 1; i >= sc; i--) {
                    System.out.print(arr[r - 1][i] + ",");
                }
                r--;
            }
            // print cols
            if(sc<c){
                for (i = r - 1; i >= sr; i--) {
                System.out.print(arr[i][sc] + ",");
            }
            sc++;
            }
        }
    }
}
