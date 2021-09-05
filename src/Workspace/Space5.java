package Workspace;

public class Space5 {

    /** Chamika ayya testing */
    public static void main(String args[]){
        String getChannel = "SALES_APP", getSbu = "GSM", stockRequired = "STOCK_REQUIRED_PO";
//        String getChannel = "O2A_ENTERPRISE", getSbu = "GSM", stockRequired = "STOCK_REQUIRED_PO";
//        String getChannel = "ONLINE", getSbu = "GSM", stockRequired = "STOCK_REQUIRED_PO";
//        String getChannel = "O2A_ENTERPRISE", getSbu = "LTE", stockRequired = "STOCK_REQUIRED_PO";
//        String getChannel = "ONLINE", getSbu = "LTE", stockRequired = "STOCK_REQUIRED_PO";
//        String getChannel = "O2A_ENTERPRISE", getSbu = "GSM", stockRequired = "STOCK_REQUIRED_STO";
//        String getChannel = "O2A_ENTERPRISE", getSbu = "LTE", stockRequired = "STOCK_REQUIRED_STO";
//        String getChannel = "ONLINE", getSbu = "LTE", stockRequired = "STOCK_REQUIRED_STO";

        if (getChannel.equalsIgnoreCase("SALES_APP")
                || getChannel.equalsIgnoreCase("O2A_ENTERPRISE")) {
            if (getSbu.equalsIgnoreCase("GSM")
                    && stockRequired.equalsIgnoreCase("STOCK_REQUIRED_PO")) {
                System.out.println("Hi bro");
            }
        }

        System.out.println("\n\n****************\n\n");

        if ((getChannel.equalsIgnoreCase("SALES_APP")
                || getChannel.equalsIgnoreCase("O2A_ENTERPRISE"))
            && (getSbu.equalsIgnoreCase("GSM")
                && stockRequired.equalsIgnoreCase("STOCK_REQUIRED_PO"))) {
                System.out.println("Hi bro");
        }
    }

}
