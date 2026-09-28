import java.util.Scanner;
import java.util.Stack;

public class BT {
    public static void main ( String [] args ){
        Scanner nhap = new Scanner(System.in);
        Stack<String> ops = new Stack<>();
        Stack<String> vals = new Stack<>();

        while (nhap.hasNext()){
            String a = nhap.next();
            if ( a.equals("+") || a.equals("-") || a.equals("*") || a.equals(":")){
                ops.push(a);
            } else if ( a.equals(")") ){
                String dau = ops.pop();
                String a1 = vals.pop();
                String a2 = vals.pop();
                String all = "("  + a2 + dau + a1 + ")" ;
                vals.push(all);
            } else {
                vals.push(a);
            }
            
        

        }
    if (!vals.isEmpty()){
                System.out.println(vals.peek());
            }    
    }
    
}
