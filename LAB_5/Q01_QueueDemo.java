package LAB_5;

import java.util.*;

interface QueueImpl {
    void insert(int data);
    void delete();
    void display();
}

class Q01_QueueDemo implements QueueImpl {

    int arr[] = new int[10];
    int front = -1, rear = -1;

    public void insert(int data) {
        if (rear == 9) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) front = 0;

        rear++;
        arr[rear] = data;
        System.out.println(data + " inserted");
    }

    public void delete() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(arr[front] + " deleted");
        front++;
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q01_QueueDemo q = new Q01_QueueDemo();

        while (true) {
            System.out.println("\n1.Insert 2.Delete 3.Display 4.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    int x = sc.nextInt();
                    q.insert(x);
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    return;
            }
        }
    
    }
}