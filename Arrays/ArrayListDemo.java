import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //int arr[] = new int[5];
        int arr[] = {1,2,2,56,5,6};//static memory allocation
        //Dynamic Array
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(58);
        list.add(10);

        list.get(0);
        list.get(2);

        //for(int i=0;i<arr.length;i++){
        //    System.out.println(arr[i]);
        //}

        //for(int e:arr){
        //    System.out.println(e);
        //}

        //for(int i=0;i<list.size();i++){
        //    System.out.println(list.get(i));
        //}

        list.forEach((a)-> System.out.println(a));
    }
}
