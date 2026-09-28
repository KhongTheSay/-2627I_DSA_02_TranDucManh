import java.util.Scanner;

public class EqualStacks {
    public static int equalStacks(int[] a, int[] b, int[] c) {
        int s1 = 0, s2 = 0, s3 = 0;
        for (int x : a) {
            s1 += x;
        }
        for (int x : b) {
            s2 += x;
        }
        for (int x : c) {
            s3 += x;
        }

        int i1 = 0, i2 = 0, i3 = 0;
        while (i1 < a.length && i2 < b.length && i3 < c.length) {
            if (s1 == s2 && s2 == s3) {
                return s1;
            }
            if (s1 >= s2 && s1 >= s3) {
                s1 -= a[i1++];
            } else if (s2 >= s1 && s2 >= s3) {
                s2 -= b[i2++];
            } else {
                s3 -= c[i3++];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int[] a = new int[n1];
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[n2];
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[n3];
        for (int i = 0; i < n3; i++) {
            c[i] = sc.nextInt();
        }

        System.out.println(equalStacks(a, b, c));
        sc.close();
    }
}
