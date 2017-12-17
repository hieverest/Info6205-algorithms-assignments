public class SortedCircularLinkList {
    ListNode head;
    public SortedCircularLinkList() {
        head = null;
    }

    public void insertAndSort(ListNode node) {
        ListNode p = head;
        if (p == null) {
            node.next = node;
            head = node;
        } else if ( node.val < p.val) {
            while (p.next != head) {
                p = p.next;
            }
            p.next = node;
            node.next = head;
            head = node;
        } else {
            while (p.next != head && node.val >= p.next.val) {
                p = p.next;
            }
            node.next = p.next;
            p.next = node;
        }
    }

    public void printList() {
        ListNode p = head.next;
        System.out.print(head.val);
        while (p != head) {
            System.out.print("," + p.val);
            p = p.next;
        }
    }

    public static void main(String[] args) {
        SortedCircularLinkList test = new SortedCircularLinkList();
        int[] arr = {3,5,1,2,5};
        for (int e : arr) {
            test.insertAndSort(new ListNode(e));
        }
        test.printList();
    }
}

class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}