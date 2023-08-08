package stack;
//Stack Using Queue
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q2.offer(x);

        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        // Swap the names of the queues to maintain the invariant
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return q1.poll();
    }

    public int top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}

