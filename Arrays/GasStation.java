public class GasStation {
    static int checkjourney(int gas[],int cost[]){
        int startingpoint=0;
        int loss =0;
        int remaininggas=0;
        for (int i = 0; i < gas.length; i++) {
            remaininggas+=gas[i]-cost[i];
            if(remaininggas<0){
                startingpoint=i+1;
                loss+=remaininggas;
                remaininggas=0; 
            }
        }
        return loss+remaininggas>=0?startingpoint:-1;
    }
    public static void main(String[] args) {
        int gas[]={1,2,3,4,5};
        int cost[]={3,4,5,1,2};
        int ans =checkjourney(gas, cost);
        System.out.println(ans);
    }
}
