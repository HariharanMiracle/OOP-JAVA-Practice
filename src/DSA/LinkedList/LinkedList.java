package DSA.LinkedList;

public class LinkedList {
    Node head;

    public LinkedList insert(LinkedList list, String data){
        /** Create a new node */
        Node newNode = new Node(data);
        newNode.next = null;

        if(list.head == null){
            /** If the linked list is empty, make the first node as the head */
            list.head = newNode;
        }
        else{
            /** Else traverse the last node and insert there */
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }

            /** Insert the new node */
            last.next = newNode;
        }

        return list;
    }

    public void displayLinkedList(LinkedList list){
        Node current = list.head;
        while(current != null){
            System.out.println("Data: " + current.getData());
            current = current.next;
        }
    }

    public LinkedList deleteByKey(LinkedList list, String key){
        Node current = list.head, prev = null;

        /** If head node itself holds the key to be deleted */
        if(current != null && current.getData().equals(key)){
            list.head = current.next;
            System.out.println(key + " found and deleted");
            return list;
        }

        /** Search for the key to be deleted */
        while(current != null && !current.getData().equals(key)){
            prev = current;
            current = current.next;
        }

        /** If the key was present, it should be at currNode */
        if(current != null){
            prev.next = current.next;
            System.out.println(key + " found and deleted");
        }

        /** If key was not present in linked list */
        if (current == null) {
            /** Display the message */
            System.out.println(key + " not found");
        }

        return list;
    }

    public LinkedList deleteAtPosition(LinkedList list, int index){
        Node current = list.head, prev = null;
        int counter = 0;

        /** If the index to be deleted is 0, the head node is deleted */
        if(index == 0 && current != null){
            list.head = current.next;
            System.out.println(index + " position element deleted");
            return list;
        }

        while(current != null){
            if(index == counter){
                prev.next = current.next;
                System.out.println(index + " position element deleted");
                break;
            }
            else{
                prev = current;
                current = current.next;
                counter += 1;
            }
        }

        if (current == null) {
            System.out.println(index + " position element not found");
        }

        return list;
    }

    public LinkedList reverse(LinkedList list){
        if(list.head == null){
            return list;
        }

        Node current = list.head;
        Node prev = null;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        list.head = prev;

        return list;
    }
}