class ZipMerge {
    public Node zipMerge(LinkedList list1, LinkedList list2) {
        Node dummy = list1.head;
        Node h1 = list1.head, h2 = list2.head;
        if (h1 == null || h2 == null) {
            return (h1 == null) ? h2 : h1;
        }
        Node temp1 = h1.next, temp2 = h2.next;
        while (h1.next != null && h2.next != null) {
            h1.next = h2;
            h2.next = temp1;
            h1 = temp1;
            h2 = temp2;
            temp1 = h1.next;
            temp2 = h2.next;
        }
        h1.next = h2;
        if (h2.next == null) {
            h2.next = temp1;
        }

        return dummy;
    }
}