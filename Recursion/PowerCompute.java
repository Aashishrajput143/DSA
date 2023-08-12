public class PowerCompute {
    static int pc(int n,int p){
        if(p==0){
            return 1;
        }
        return pc(n,(p-1))*n;
        
    }
    public static void main(String[] args) {
        System.out.println(pc(2,5));
        int pow =5;
        int n=2;
        int res=1;
        for(int i=1;i<=pow;i++){
            res = res*n;
        }
        System.out.println("power.. "+res);

    }
}
