package Workspace;

public class Space4 {

    public static void main(String a[]){
        int taxClassDTOCount = 0; // status: pass
//        int taxClassDTOCount = 1; // status: pass
//        int taxClassDTOCount = 2; // status: pass
//        int taxClassDTOCount = 3; // status: pass
//        int taxClassDTOCount = 4; // status: pass
//        int taxClassDTOCount = 5; // status: pass

        switch (taxClassDTOCount){
            case 1:
                System.out.println("Hello 1");
                System.out.println("Bye 1");
                break;
            case 2:
                System.out.println("Hello 2");
                System.out.println("Bye 2");
                break;
            case 3:
                System.out.println("Hello 3");
                System.out.println("Bye 3");
                break;
            case 4:
                System.out.println("Hello 4");
                System.out.println("Bye 4");
                break;
            case 5:
                System.out.println("Hello 5");
                System.out.println("Bye 5");
                break;
        }

        System.out.println("\n\n************\n\n");

        if (taxClassDTOCount == 1) {
            System.out.println("Hello 1");
            System.out.println("Bye 1");
        } else if (taxClassDTOCount == 2) {
            System.out.println("Hello 2");
            System.out.println("Bye 2");
        } else if (taxClassDTOCount == 3) {
            System.out.println("Hello 3");
            System.out.println("Bye 3");
        } else if (taxClassDTOCount == 4) {
            System.out.println("Hello 4");
            System.out.println("Bye 4");
        } else if (taxClassDTOCount == 5) {
            System.out.println("Hello 5");
            System.out.println("Bye 5");
        }
    }

}
