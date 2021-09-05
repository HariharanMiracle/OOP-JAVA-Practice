package DSA.DoublyLinkList;

public class DoublyLinkedListMain {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.append(list, "Hari");
        list.append(list, "Gajen");
        list.append(list, "Sachin");
        list.append(list, "Shenya");
        list.append(list, "Vino");
        list.append(list, "Hanar");
        list.append(list, "Randy");
        list.displayForward(list);
        System.out.println("\n\n\n\n\n");

        list.push(list, "Roman");
        list.displayForward(list);
        System.out.println("\n\n\n\n\n");

        list.insertAtPosition(list, 2, "Virat");
        list.displayForward(list);

    }

}
