
import java.util.Arrays;


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


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1, 2};
        long result = countPairs(a);
        System.out.println(result);
    }
}
