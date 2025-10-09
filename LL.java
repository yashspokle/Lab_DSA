import java.util.*;
public class LL {
    
    Node head;
    int size;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Add First
    public void addfirst(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
        size++;
    }
    // Add Last
    public void addlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newnode;
        }
        size++;
    }
    // Print
    public void printll() {
        if (head == null) {
            System.out.println("Empty...");
            return;
        }
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " (--> ");
            cur = cur.next;
        }
        System.out.println("Null");
    }
    // Delete First
    public void deletefirst() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        head = head.next;
        size--;
    }
    // Delete Last
    public void deletelast() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            Node cur = head;
            while (cur.next.next != null) {
                cur = cur.next;
            }
            cur.next = null;
        }
        size--;
    }
    // Size
    public int getSize() {
        return size;
    }
    public static void main(String[] args) {
        LL list = new LL();

        list.addfirst(10);
        list.addfirst(20);
        list.addfirst(30);
        list.addfirst(40);
        list.addlast(100);
        list.addlast(200);

        list.printll();
        System.out.println("Size : " + list.getSize());

        list.deletefirst();
        list.printll();

        list.deletelast();
        list.printll();

        System.out.println("Size : " + list.getSize());
    }
}