package Workspace;

public class Space2 {

    public static void main(String a[]){
//         String offerAttType = "D", getOfferAttributeValue = "data"; // E: yes, A: yes
//         String offerAttType = null, getOfferAttributeValue = "data"; // E: null, A: null
//         String offerAttType = "D", getOfferAttributeValue = null; // E: null, A: null
//         String offerAttType = "D", getOfferAttributeValue = ""; // E: null, A: null
//         String offerAttType = "S", getOfferAttributeValue = "data"; // E: no, A: no
//         String offerAttType = "S", getOfferAttributeValue = null; // E: no, A: no
         String offerAttType = "S", getOfferAttributeValue = ""; // E: no A: no

        if (null != offerAttType && offerAttType.equalsIgnoreCase("D")) {
            if (null != getOfferAttributeValue
                    && !getOfferAttributeValue.isEmpty()) {
                System.out.println("yes");
            }
        }
        else if (null != offerAttType && offerAttType.equalsIgnoreCase("S")) {
            System.out.println("no");
        }

        if((null != offerAttType && offerAttType.equalsIgnoreCase("D")) &&
                (null != getOfferAttributeValue
                    && !getOfferAttributeValue.isEmpty())){
                System.out.println("yes");
        }
        else if(null != offerAttType && offerAttType.equalsIgnoreCase("S")){
            System.out.println("no");
        }
    }

}
