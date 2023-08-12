public class RainWater {
    public static void main(String[] args) {
        int pillars[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int n=pillars.length;
        int pmax[]=new int[n];//->{0,1,1,2,2,2,2,3,3,3,3,3}
        int sMax[]= new int[n];//{3,3,3,3,3,3,3,3,2,2,2,1}<-
        pmax[0]=pillars[0];
        sMax[n-1]=pillars[n-1];
        for (int i = 1; i < n; i++) {
            pmax[i]=Math.max(pmax[i-1], pillars[i]);
        }
        for (int i = n-2; i>=0; i--) {
            sMax[i]=Math.max(sMax[i+1], pillars[i]);
        }
        int amount=0;
        for (int i = 0; i < n; i++) {
            int currentpillar=pillars[i];
            int leftpillar=pmax[i];
            int rightpillar=sMax[i];
            int min = Math.min(leftpillar, rightpillar);
            if(min>currentpillar){
                amount+=min-currentpillar;
            }
        }
        System.out.println("Total Amount: "+amount);
    }
}
