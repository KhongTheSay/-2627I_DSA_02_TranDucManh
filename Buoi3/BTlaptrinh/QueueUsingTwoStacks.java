import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {
    static class MyQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        void enqueue(int x) {
            s1.push(x);
        }

        void dequeue() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            if (!s2.isEmpty()) {
                s2.pop();
            }
        }

        void print() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            if (!s2.isEmpty()) {
                System.out.println(s2.peek());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        MyQueue queue = new MyQueue();
        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                int x = sc.nextInt();
                queue.enqueue(x);
            } else if (type == 2) {
                queue.dequeue();
            } else if (type == 3) {
                queue.print();
            }
        }
        sc.close();
    }
}
