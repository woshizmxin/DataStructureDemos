/**
 * Created by zhoumao on 2017/4/20.
 * 反转链表
 */
public class ReverseList {

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node getList() {
        Node head, tmp;
        tmp = head = new Node(0);
        for (int i = 1; i < 10; i++) {
            Node p = new Node(i);
            head.next = p;
            head = p;
        }
        head = tmp;
        return head;
    }

    private Node reverseList(Node head) {
        Node n1,n2 = null;
        n1 = head;

        while(head.next != null){
            n2 = head.next;
            head.next = head.next.next;
            n2.next = n1;
            n1 = n2;
        }
        return n2;
    }

    private void printList(Node head) {
        while (head != null) {
            System.out.println(""+head.data);
            head = head.next;
        }
    }


    public static void main(String arg[]) {
        ReverseList reverseList = new ReverseList();
        Node head = reverseList.getList();
        reverseList.printList(head);
        System.out.println("*****反转****");
        head = reverseList.reverseList(head);
        reverseList.printList(head);
    }
}
