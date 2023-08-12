import java.util.Scanner;

public class ArrayCRUD {
    int arr[];
    int currentsize;

    ArrayCRUD(int n) {
        this.arr = new int[n];
        this.currentsize = 0;
    }

    void insert(int index, int item) {
        if (index > currentsize) {
            System.out.println("Index cannot greater than current size...");
            return;
        }
        for (int i = currentsize - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = item;
        currentsize++;
    }

    void delete(int index) {
        for (int i = index; i >= currentsize - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[currentsize - 1] = 0;
        currentsize--;
    }

    int search(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println(i);
                return i;
            }
        }
        System.out.println("Element not found");
        return -1;
    }

    void update(int valuetosearch, int valuetoupdate) {
        int index = search(valuetosearch);
        if (index == -1) {
            return;
        } else {
            arr[index] = valuetoupdate;
            System.out.println("Value Updated...");
        }
    }

    void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void main(String[] args) {
        ArrayCRUD obj = new ArrayCRUD(5);
        // obj.insert(0,5);
        // obj.insert(1,4);
        // obj.insert(2,3);
        // obj.insert(1,2);
        // obj.print();
        // obj.delete(1);
        // System.out.println();
        // obj.print();
        // System.out.println();
        // int search = obj.search(2);
        // System.out.println(search);
        // obj.update(5,3);
        int count=0;
        while (true) {
            System.out.println();
            System.out.println("Enter the Choice");
            System.out.println("1. for Insert");
            System.out.println("2. for print");
            System.out.println("3. for update");
            System.out.println("4. for search");
            System.out.println("5. for delete");
            System.out.println("6. for exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                System.out.println("enter the number of element");
                int num = sc.nextInt();
                System.out.println("Enter the Values");
                for(int i=0;i<num;i++){
                    int value = sc.nextInt();
                    obj.insert(count, value);
                    count++;
                }
                break;

                case 2:
                System.out.println("Array...");
                obj.print();
                break;

                case 3:
                System.out.println("Enter the element you want to update");
                int element = sc.nextInt();
                System.out.println("Enter the element");
                int upd = sc.nextInt();
                obj.update(element, upd);
                break;

                case 4:
                System.out.println("Enter the element you want to Search");
                int se = sc.nextInt();
                obj.search(se);
                break;

                case 5:
                System.out.println("Enter the index you want to delete");
                int del = sc.nextInt();
                obj.delete(del);
                break;

                case 6:
                return;

                default:
                System.out.println("Invalid Choice...");

            }
        }
    }
}
