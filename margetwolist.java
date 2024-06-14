// function for merge two sortedlist

import org.w3c.dom.NodeList;

public class margetwolist {

    public Node marge(Node head1, Node head2) {
        Node t1 = head1;
        Node t2 = head2;

        Node dNode = null;// dNode is the node which will be added to the new linked
        dNode.data = -1;
        Node temp = dNode;

        while (t1 != null && t2 != null) {
            if (t1.data > t2.data) {
                temp.next = t2;
                t2 = t2.next;
                temp = temp.next;
            } else {
                temp.next = t1;
                t1 = t1.next;
                temp = temp.next;
            }
        }
        // if one list is longer than other append remaining nodes of that list to new
        // Linked
        if (t1 == null) {
            temp.next = t2;
        } else {
            temp.next = t1;
        }
        return dNode.next;
    }
}
