import java.util.List;

public class InsertionSortPart2 {

    public static void insertionSort2(int n, List<Integer> arr) {
        for (int i = 1; i < n; i++) {
            int val = arr.get(i);
            int j = i - 1;

            while (j >= 0 && arr.get(j) > val) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, val);
            printArray(arr);
        }
    }

    private static void printArray(List<Integer> arr) {
        for (int k = 0; k < arr.size(); k++) {
            System.out.print(arr.get(k) + (k == arr.size() - 1 ? "" : " "));
        }
        System.out.println();
    }
}