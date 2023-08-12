public class Mazepath {
    static void printmaze(int currentrow,int endrow,int currentcol,int endcol,String output){
        if(currentrow==endrow && currentcol==endcol){
            System.out.print(output+",");
            return;
        }
        if(currentrow>endrow || currentcol>endcol){
            return;
        }
        printmaze(currentrow+1, endrow, currentcol, endcol, output+"V");
        printmaze(currentrow, endrow, currentcol+1, endcol, output+"H");
    }
    public static void main(String[] args) {
        printmaze(0, 2, 0, 2, "");
    }
}
