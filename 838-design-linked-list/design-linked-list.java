class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val=val;
        this.next=null;
    }
}

class MyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public MyLinkedList() {
        head=null;
        tail=null;
        size=0;
    }

    public int get(int index) {
        if (index<0||index>=size) return -1;
        Node temp=head;
        for (int i=0;i<index;i++) {
            temp=temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node node=new Node(val);
        node.next=head;
        head=node;
        if (size==0) tail=node;
        size++;
    }

    public void addAtTail(int val) {
        Node node=new Node(val);
        if (tail==null) {
            head=tail=node;
        } else {
            tail.next=node;
            tail=node;
        }
        size++;
    }

    public void addAtIndex(int index,int val) {
        if (index<0||index>size) return;

        if (index==0) {
            addAtHead(val);
            return;
        }
        if (index==size) {
            addAtTail(val);
            return;
        }

        Node node=new Node(val);
        Node temp=head;
        for (int i=0;i<index-1;i++) {
            temp=temp.next;
        }

        node.next=temp.next;
        temp.next=node;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index<0||index>=size) return;

        if (index==0) {
            Node toDelete=head;
            head=head.next;
            toDelete=null;
            size--;
            if (size==0) tail=null;
            return;
        }

        Node temp=head;
        for (int i=0;i<index-1;i++) {
            temp=temp.next;
        }

        Node toDelete=temp.next;
        temp.next=toDelete.next;
        if (toDelete==tail) tail=temp;
        toDelete=null;
        size--;
    }
}
