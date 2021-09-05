package DSA.CircularList;

public class CircularList {

    public Node head;

    public CircularList push(CircularList list, String data){
        Node newNode = new Node(data);

        if(list.head == null){
            list.head = newNode;
            newNode.next = head;
        }

        Node last = list.head;
        do{
            last = last.next;
        }while(last.next != head);

        newNode.next = list.head;
        last.next = newNode;
        list.head = newNode;

        return list;
    }

    public void displayForward(CircularList list){
        Node current = list.head;

        if(list.head == null) {
            System.out.println("List is empty");
        }

        do{
            System.out.println("Data: "+ current.data);
            current = current.next;
        }while(current != head);
    }
}
