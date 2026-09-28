public class ResizingArrayQueueOfStrings {
    private String[] q = new String[2];
    private int n = 0;
    private int head = 0;
    private int tail = 0;

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    private void resize(int capacity) {
        String[] temp = new String[capacity];
        for (int i = 0; i < n; i++) {
            temp[i] = q[(head + i) % q.length];
        }
        q = temp;
        head = 0;
        tail = n;
    }

    public void enqueue(String item) {
        if (n == q.length) resize(2 * q.length);
        q[tail] = item;
        tail = (tail + 1) % q.length;
        n++;
    }

    public String dequeue() {
        String item = q[head];
        q[head] = null;
        head = (head + 1) % q.length;
        n--;
        if (n > 0 && n == q.length / 4) resize(q.length / 2);
        return item;
    }
}