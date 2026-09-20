import java.util.Arrays;

public class ClosestPair {
    public static double[] findClosestPair(double[] a) {
        if (a == null || a.length < 2) return null;
        Arrays.sort(a);

        double kcmin = Math.abs(a[1] - a[0]);
        double[] ans = new double[]{a[0], a[1]};

        for (int i = 1; i < a.length - 1; i++) {
            double kc = Math.abs(a[i + 1] - a[i]);
            if (kc < kcmin) {
                kcmin = kc;
                ans[0] = a[i];
                ans[1] = a[i + 1];
            }
        }

        return ans;
    }
}