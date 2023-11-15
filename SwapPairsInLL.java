public class SwapPairsInLL {

    public void swapPairs(LinkedList list) {
        LinkedList.Node head = list.head;
        if(head==null || head.next==null) return;

        LinkedList.Node current = head;
        LinkedList.Node nextNode = current.next;
        LinkedList.Node temp = null;
        while(current.next!=null && nextNode.next!=null){

            current.next = nextNode.next;

            nextNode.next = current;

            if (current == head){
                head = nextNode;
            }
            if(temp!=null){
                temp.next = nextNode;
            }
            temp = current;
            current = current.next;
            nextNode = current.next;
        }
        if(nextNode==null) return;
        if (temp!=null) {
            temp.next = nextNode;
        }else {
            head = nextNode;
        }
        nextNode.next = current;
        current.next = null;
        // 1 2 3 4
    }

    public static void main(String[] args) {

        LinkedList mylist = new LinkedList(1);

        mylist.append(2);
        mylist.append(3);
        mylist.append(4);
        mylist.append(5);

        mylist.swapPairs();

        mylist.printList();

    }
}
