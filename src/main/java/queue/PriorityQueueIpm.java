package queue;

public class PriorityQueueIpm {


    public static void main(String[] args) {
        PriorityQueueIpm priorityQueueIpm = new PriorityQueueIpm();
        PriorityQueueIpm.Node N = newNode(4,3);
        System.out.println((N).data);
        System.out.println(N.data);
    }

        Node n = new Node();

    static class Node {
        int data;
        Node next;
        int priority;

    }

    static Node node = new Node();

    //    function that create a new node
    static Node newNode(int d, int p) {

        Node temp = new Node();
        temp.data = d;
        temp.priority = p;
        temp.next = null;

        return temp;
    }

    //    return the value at the top of the queue
    static int peek(Node head) {
        return (head).data;
    }

    //    Remove the element with the highest priority from the list
    static Node pop(Node head) {
        Node temp = head;
        head = head.next; //set the next node

        return head;

    }
    //push new node
    static Node push(Node head, int d, int p) {
        Node start = head;
        Node temp = newNode(d, p);

        if ((head).priority > p){
          head.next = head;
          head = temp;
        }
        else{
            // Traverse the list and find position to insert new node
          while(start.next != null && start.next.priority < p) {
                start = start.next;
          }
          temp.next = start.next; //
          start.next = temp;
        }
        return head;
    }





}
