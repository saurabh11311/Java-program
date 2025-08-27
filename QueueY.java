/* // Queue :- It is  means by the line and qatar or a staight line 
// Implementation of Queue using Array
public class QueueY {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // enqueue
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("full queue");
                return;

            }
            rear++;
            arr[rear] = data;
        }

        // dequeue :- O(n) time complex
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;

            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            return front;

        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;

            }
            rear--;
            return arr[0];

        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        // 1 2 3 ....... 3 2 1....
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
} */

//Implementation of circualar Queue using Array 
// Queue :- It is  means by the line and qatar or a staight line 
// Implementation of Queue using Array
/* public class QueueY {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        // enqueue
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Overflow");
                return;

            }
            // First element add
            if (front == -1) {
                front = 0;
            }

            rear = (rear +1) % size;
            arr[rear] = data;
        }

        // dequeue :- O(1) time complex
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;

            }
            int result  = arr[front];
            //Singal element condition 
            if (rear == front ) {
                rear = front  = -1;
            }else{
                front =(front+1)%size;
            }
            return result;

        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;

            }
            
            return arr[front];

        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        
        
        

        // 1 2 3 ....... 3 2 1....
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
} */

//3.Implementation of stack by using Linked  list
/* public class QueueY {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null & tail == null;
        }
        // enqueue
        public static void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        // dequeue :- O(1) time complex
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }
        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // 1 2 3 ....... 3 2 1....
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
 */
// Impleentaion of the Queue by using java collection frameWork

/* import java.util.*;
public class QueueY {
    public static void main(String[] args) {
    //  Queue q = new Queue(); 
    //Queue<Integer> q = new LinkedList<>(); 
     Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // 1 2 3 ....... 3 2 1....
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}


 */


//Q. Queue using 2 Stack by using Push() and pop()

// Queue :- FIFO   &&   Stack :- LIFO  

import java .util.*;
public class QueueY {
    static class Queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }   
        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return s1.pop();
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q =new Queue();
        q.add(1);
        q.add(2);
        q.add(3);   
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
