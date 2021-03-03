public class LinkedList {
    static Node head;
    static Node tail;
    Node pointer1;
    Node pointer2;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(4);
        ll.addFirst(5);
      //    ll.addFirst(6);

        ll.traverse();
        //     ll.removeFirst();
 /*       ll.removeLast();
        System.out.println("after remove last: ");
        ll.traverse();
        ll.addLast(3);
        ll.removeFirst();
        System.out.println("after remove first: ");
        ll.traverse();

        ll.insertBetween(3,10);
        System.out.println("after insert inbetween: ");
        ll.traverse();*/

        ll.reverseList(head, tail);
        System.out.println("After reverse");
        ll.traverse();
    }

    public void addLast(int a) {
        Node n = new Node();
        if (head == null) {
            n.value = a;
            head = n;
            tail = n;
        } else {
            n.value = a;
            tail.next = n;
            n.pre = tail;
            tail = n;

        }
    }

    public void addFirst(int a) {
        Node n = new Node();
        if (head == null) {
            n.value = a;
            head = n;
            tail = n;

        } else {
            n.value = a;
            n.next = head;
            head.pre = n;
            head = n;
        }
    }

    public int removeFirst() {
        head = head.next;
        head.pre.next = null;
        head.pre = null;
return head.value;
    }

    public void removeLast() {
        tail = tail.pre;
        tail.next.pre = null;
        tail.next = null;

    }

    public void traverse() {
        pointer1 = head;
//        pointer2 = head.next;

        while (pointer1 != null) {

            System.out.println(pointer1.value);
            pointer1 = pointer1.next;
        }
    }

    public void insertBetween(int a, int b) {
        pointer1 = head;
        Node n = new Node();
        n.value = b;
        while (pointer1.value != a) {
            pointer1 = pointer1.next;

        }
        if (pointer1.value == tail.value) {
            this.addLast(b);
        } else {
            pointer1.next.pre = n;
            n.next = pointer1.next;

            pointer1.next = n;
            n.pre = pointer1;

        }
    }

    public void reverseList(Node head, Node tail) {

        }



}
