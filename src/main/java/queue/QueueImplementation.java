package queue;

import java.util.Arrays;

public class QueueImplementation {
    int rear_q, front_q;
    static int[] qCollection;
    int q_capacity;

    public static void main(String[] args) {
        QueueImplementation qIpm = new QueueImplementation(9);
        qIpm.enqeue(4);
        qIpm.enqeue(6);
        qIpm.enqeue(45);
        qIpm.enqeue(45);
        qIpm.display();
        qIpm.dequeue();
        qIpm.dequeue();
        qIpm.dequeue();

        qIpm.display();
        qIpm.enqeue(45);
        qIpm.enqeue(45);
        qIpm.enqeue(45);
        qIpm.enqeue(45);
        qIpm.enqeue(45);
        qIpm.enqeue(45);
        qIpm.enqeue(45);
        qIpm.enqeue(45);
        qIpm.enqeue(45);
        qIpm.display();


    }

    QueueImplementation(int arraySize) {
        q_capacity = arraySize;
        qCollection = new int[q_capacity];
    }

    public void enqeue(int value) {
//        if the pointer is pointing the last element in queue, the the queue is full
        if (rear_q == q_capacity) {
            System.out.println("queue is full");
        } else {
//           add the element to the rear end of the queue
            qCollection[rear_q] = value;
            rear_q++;
        }
    }

    void dequeue() {
        if (q_capacity == 0) {
            System.out.println("Queue is empty");
        }
        for (int i = 0; i < rear_q - 1; i++) {
            qCollection[i] = qCollection[i + 1];
        }
        rear_q--;
    }

    void display() {
        if (rear_q == 0) {
            System.out.println("queue is empty");
        }
        System.out.println(Arrays.toString(qCollection));
        for (int i = 0; i < rear_q; i++) {
            System.out.println(qCollection[i]);
        }
    }


}
