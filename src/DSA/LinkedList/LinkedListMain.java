package DSA.LinkedList;

public class LinkedListMain {

    public static void main(String args[]){
        /** Exercise 01 Insert Data */
        System.out.println("Exercise 01 Insert Data");
        LinkedList linkedList = new LinkedList();

        linkedList.insert(linkedList, "siva");
        linkedList.insert(linkedList, "sachin");
        linkedList.insert(linkedList, "warshini");
        linkedList.insert(linkedList, "shenya");
        linkedList.insert(linkedList, "hari");
        linkedList.insert(linkedList, "vino");
        linkedList.insert(linkedList, "gaya");
        linkedList.insert(linkedList, "vithu");
        linkedList.insert(linkedList, "sasi");
        linkedList.insert(linkedList, "yasi");

        linkedList.displayLinkedList(linkedList);
        System.out.println("Exercise 01 Insert Data");
        /** Exercise 01 Insert Data */

        System.out.println("\n\n\n####################################################");
        System.out.println("####################################################");
        System.out.println("####################################################\n\n\n");

        /** Exercise 02 Delete Data By Key */
        System.out.println("Exercise 02 Delete Data By Key");
        linkedList = linkedList.deleteByKey(linkedList, "siva");
        linkedList.displayLinkedList(linkedList);

        System.out.println("===========================");

        linkedList = linkedList.deleteByKey(linkedList, "kamal");
        linkedList.displayLinkedList(linkedList);

        System.out.println("===========================");

        linkedList = linkedList.deleteByKey(linkedList, "vino");
        linkedList.displayLinkedList(linkedList);
        System.out.println("Exercise 02 Delete Data By Key");
        /** Exercise 02 Delete Data By Key */

        System.out.println("\n\n\n####################################################");
        System.out.println("####################################################");
        System.out.println("####################################################\n\n\n");

        /** Exercise 03 Delete Data By Position */
        System.out.println("Exercise 03 Delete Data By Position");
        linkedList = linkedList.deleteAtPosition(linkedList, 0);
        linkedList.displayLinkedList(linkedList);

        System.out.println("===========================");

        linkedList = linkedList.deleteAtPosition(linkedList, 10);
        linkedList.displayLinkedList(linkedList);

        System.out.println("===========================");

        linkedList = linkedList.deleteAtPosition(linkedList, 3);
        linkedList.displayLinkedList(linkedList);
        System.out.println("Exercise 03 Delete Data By Position");
        /** Exercise 03 Delete Data By Position */

        System.out.println("\n\n\n####################################################");
        System.out.println("####################################################");
        System.out.println("####################################################\n\n\n");

        /** Exercise 04 Reverse the linked list */

        System.out.println("Exercise 04 Reverse the linked list");
        linkedList = linkedList.reverse(linkedList);
        linkedList.displayLinkedList(linkedList);
        System.out.println("Exercise 04 Reverse the linked list");

        /** Exercise 04 Reverse the linked list */

    }

}
