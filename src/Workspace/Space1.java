package Workspace;

public class Space1 {

    public static void main(String a[]){

//        String channel = "SALESAPP", stockRequired = "PO", sbu = "GSM"; // expected print, actual: print
//        String channel = "SALESAPP", stockRequired = "PO", sbu = "DBN"; // expected print, actual: print
//        String channel = "SALESAPP", stockRequired = "PO1", sbu = "DBN"; // expected print, actual: print
//        String channel = "SALESAPP", stockRequired = "PO1", sbu = "LTE"; // expected no-print, actual: no-print
        String channel = "ONLINE", stockRequired = "PO1", sbu = "LTE"; // expected print, actual: print

        /** Old */
/**
        if (channel.equalsIgnoreCase("SALESAPP")) {
            if (sbu.equalsIgnoreCase("GSM")
                    && stockRequired.equalsIgnoreCase("PO")) {
                System.out.println("Send SMS");
            } else if (sbu.equalsIgnoreCase("DBN")) {
                System.out.println("Send SMS");
            }
        } else {
            System.out.println("Send SMS");
        }
*/

        /** New - Tested and worked */
        if(!channel.equalsIgnoreCase("SALESAPP") || ((sbu.equalsIgnoreCase("GSM") &&
                stockRequired.equalsIgnoreCase("PO")) ||
                (sbu.equalsIgnoreCase("DBN")))){
            System.out.println("Send SMS");
        }

    }

}
