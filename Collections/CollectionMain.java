package Collections;

public class CollectionMain {

    public static void main(String[] args) {
        // testQueue();
        testStack();
    }

    private static void testStack(){
        var stack = new Stack<Integer>();

        for (int i = 0; i < 1000; i += 13) {
            stack.push(i);
            System.out.println("Pushed -> " + i);
        }

        System.out.println("Queue size -> " + stack.size());
        var currSize = stack.size();

        for (int i = 0; i < currSize; i++) {
            System.out.println("Peeked -> " + stack.peek() + " // Popped -> " + stack.pop() + "loop nr: " + i);
        }

        System.out.println("Queue size -> " + stack.size());
    }

    private static void testQueue() {
        var queue = new Queue<Integer>();

        for (int i = 0; i < 1000; i += 13) {
            queue.enqueue(i);
            System.out.println("Enqueued -> " + i);
        }

        System.out.println("Queue size -> " + queue.size());
        var currSize = queue.size();

        for (int i = 0; i < currSize; i++) {
            System.out.println("Dequeued -> " + queue.dequeue() + "loop nr: " + i);
        }

        System.out.println("Queue size -> " + queue.size());
    }
}
