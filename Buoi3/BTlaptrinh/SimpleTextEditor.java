import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        Stack<Integer> ops = new Stack<>();
        Stack<String> st = new Stack<>();

        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                String w = sc.next();
                sb.append(w);
                ops.push(1);
                st.push(w);
            } else if (type == 2) {
                int k = sc.nextInt();
                st.push(sb.substring(sb.length() - k));
                sb.delete(sb.length() - k, sb.length());
                ops.push(2);
            } else if (type == 3) {
                int k = sc.nextInt();
                System.out.println(sb.charAt(k - 1));
            } else if (type == 4) {
                int op = ops.pop();
                if (op == 1) {
                    sb.delete(sb.length() - st.pop().length(), sb.length());
                } else {
                    sb.append(st.pop());
                }
            }
        }
        sc.close();
    }
}
