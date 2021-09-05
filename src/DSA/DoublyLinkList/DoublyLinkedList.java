package DSA.DoublyLinkList;

public class DoublyLinkedList {

    public Node head;

    public DoublyLinkedList append(DoublyLinkedList list, String data){
        Node newNode = new Node(data);

        if(list.head == null){
            list.head = newNode;
            newNode.next = null;
            newNode.prev = null;
            return list;
        }

        Node current = list.head;
        while(current.next != null)
            current = current.next;

        current.next = newNode;
        newNode.prev = current;

        return list;
    }

    public DoublyLinkedList push(DoublyLinkedList list, String data){
        Node newNode = new Node(data);

        if(list.head == null){
            list.head = newNode;
            newNode.next = null;
            newNode.prev = null;
            return list;
        }

        Node first = list.head;
        newNode.next = first;
        first.prev = newNode;
        list.head = newNode;

        return list;
    }

    public DoublyLinkedList insertAtPosition(DoublyLinkedList list, int position, String data){
        Node newNode = new Node(data);

        if(list.head == null){
            list.head = newNode;
            newNode.next = null;
            newNode.prev = null;
            return list;
        }

        Node current = list.head;
        int i = 0;
        while(i < position){
            current = current.next;
            i++;
        }

        newNode.next = current;
        newNode.prev = current.prev;
        current.prev = newNode;
        newNode.prev.next = newNode;

        return list;
    }

    public void displayForward(DoublyLinkedList list){
        Node current = list.head;
        while(current != null){
            System.out.println("Data: " + current.data);
            current = current.next;
        }
    }

}
