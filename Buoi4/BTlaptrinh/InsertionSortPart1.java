import java.util.List;

public class InsertionSortPart1 {

    public static void insertionSort1(int n, List<Integer> arr) {
        int val = arr.get(n - 1);
        int i = n - 2;
        while (i >= 0 && arr.get(i) > val) {
            arr.set(i + 1, arr.get(i));
            printArray(arr);
            i--;
        }
        arr.set(i + 1, val);
        printArray(arr);
    }
    private static void printArray(List<Integer> arr) {
        for (int j = 0; j < arr.size(); j++) {
            System.out.print(arr.get(j) + (j == arr.size() - 1 ? "" : " "));
        }
        System.out.println();
    }
}