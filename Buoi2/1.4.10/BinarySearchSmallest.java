public class BinarySearchSmallest {

    public static int indexOf(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < a[mid]) {
                high = mid - 1;
            } else if (key > a[mid]) {
                low = mid + 1;
            } else {
                result = mid;
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 2, 3, 4, 5};
        int key = 2;
        int result = indexOf(a, key);
        System.out.println(result);
    }
}
