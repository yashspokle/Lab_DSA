import java.util.Scanner;

public class QueueScanner {
    private int size;
    private int[] array;
    private int front = -1;
    private int rear = -1;

    public QueueScanner(int size) {
        this.size = size;
        array = new int[size];
    }

    public void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Overflow");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        array[rear] = data;
        System.out.println("Enqueue Data : " + data);
    }

    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Underflow");
            return;
        }
        int popdata = array[front];
        System.out.println("Dequeue Data : " + popdata);
        front++;
        if (front > rear) {
            front = -1;
            rear = -1;
        }
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter size of queue: ");
        int size = s1.nextInt();

        QueueScanner q = new QueueScanner(size);

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Element " + (i + 1) + ": ");
            int d = s1.nextInt();
            q.enqueue(d);
        }

        System.out.print("Number of elements to dequeue: ");
        int del = s1.nextInt();
        for (int i = 0; i < del; i++) {
            q.dequeue();
        }
    }
}