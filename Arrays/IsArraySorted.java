public class IsArraySorted {
    static void approach_1(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    System.out.println("Array is Not Sorted...");
                    return;
                }
            }
        }
        System.out.println("Array is Sorted...");
    }

    static void approach_2(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                System.out.println("Array is Not Sorted...");
                return;
            }
        }
        System.out.println("Array is Sorted...");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6, 7 };
        approach_1(arr);
        approach_2(arr);
    }
}
