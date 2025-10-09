import java.util.*;

public class Queue {
    public final int size = 5;
    public int[] array = new int[size];
    public int front = -1;
    public int rear = -1;

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

    public void print() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue Elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);

        q.dequeue(); 
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

        q.print();
    }
}
