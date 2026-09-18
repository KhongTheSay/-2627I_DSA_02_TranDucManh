import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EqualPairs {

    public static long countPairs(int[] a) {
        if (a == null || a.length < 2) {
            return 0;
        }

        int[] sorted = a.clone();
        Arrays.sort(sorted);

        long totalPairs = 0;
        long runLength = 1;

        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i] == sorted[i - 1]) {
                runLength++;
            } else {
                totalPairs += runLength * (runLength - 1) / 2;
                runLength = 1;
            }
        }
        totalPairs += runLength * (runLength - 1) / 2;

        return totalPairs;
    }

    public static int[] readIntsFromFile(String filePath) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filePath));
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        scanner.close();

        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1, 2};
        long result = countPairs(a);
        System.out.println(result);
    }
}
