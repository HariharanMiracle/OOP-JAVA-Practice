package DSA.CircularList;

public class CircularListMain {

    public static void main(String[] args) {
        CircularList list = new CircularList();

        list.push(list, "1");
        list.push(list, "2");
        list.push(list, "3");
        list.displayForward(list);
        System.out.println("\n**********\n");
    }

}
