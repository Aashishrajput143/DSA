public class CallStack {
    
    void fun_1(){
        System.out.println("Function 1");
    }
    void fun_2(){
        fun_1();
        System.out.println("Function 2");
    }
    void fun_3(){
        fun_2();
        System.out.println("Function 3");
    }
    public static void main(String[] args) {
        CallStack call = new CallStack();
        call.fun_3();
    }
}