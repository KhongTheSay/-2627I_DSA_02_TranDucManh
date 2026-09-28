import java.util.Scanner;
import java.util.Stack;

public class EvaluatePostfix {

    public static double evaluate(String postfix) {
        Stack<Double> vals = new Stack<>();
        Scanner scanner = new Scanner(postfix);

        while (scanner.hasNext()) {
            String token = scanner.next();

            if (token.equals("+")) {
                double v2 = vals.pop();
                double v1 = vals.pop();
                vals.push(v1 + v2);
            } else if (token.equals("-")) {
                double v2 = vals.pop();
                double v1 = vals.pop();
                vals.push(v1 - v2);
            } else if (token.equals("*")) {
                double v2 = vals.pop();
                double v1 = vals.pop();
                vals.push(v1 * v2);
            } else if (token.equals("/") || token.equals(":")) {
                double v2 = vals.pop();
                double v1 = vals.pop();
                vals.push(v1 / v2);
            } else {
                vals.push(Double.parseDouble(token));
            }
        }

        scanner.close();
        return vals.pop();
    }

    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);
        if (sysIn.hasNextLine()) {
            String line = sysIn.nextLine();
            if (!line.trim().isEmpty()) {
                double result = evaluate(line);
                System.out.println("Ket qua: " + result);
            }
        }
        
        sysIn.close();
    }
}