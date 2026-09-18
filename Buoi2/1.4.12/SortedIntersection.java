public class SortedIntersection {

    public static void printCommonElements(int[] a, int[] b) {
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                int val = a[i];
                System.out.print(val + " ");

                while (i < a.length && a[i] == val) {
                    i++;
                }
                while (j < b.length && b[j] == val) {
                    j++;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 4, 6, 8};
        int[] b = {2, 3, 4, 4, 8, 9};
        printCommonElements(a, b);
    }
}
