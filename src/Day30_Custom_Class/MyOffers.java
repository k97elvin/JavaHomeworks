package Day30_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer("VA", "Walmart", "Qa", 110000, true, true);
        Offer offer2 = new Offer("CA", "BofA", "SDET", 100000, true, true);
        Offer offer3 = new Offer("DC", "Microsoft", "QA", 120000, true, true);
        Offer offer4 = new Offer("CA", "Chase", "SDET", 90000, false, false);
        Offer offer5 = new Offer("NJ", "JP Morgan", "SDET", 125000, true, false);

        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5};

        ArrayList<Offer> fullTime = new ArrayList<>();
        fullTime.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5));
        fullTime.removeIf(n -> !n.isFullTime);
        System.out.println(fullTime);
        System.out.println("____________________________________________");

        ArrayList<Offer> localOffers = new ArrayList<>();
        localOffers.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5));
        localOffers.removeIf(n -> !(n.location.equals("VA") || n.location.equals("DC")));
        System.out.println(localOffers);
        System.out.println("____________________________________________");

        ArrayList<Offer> offersWithBenefits = new ArrayList<>();
        offersWithBenefits.addAll(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(n -> !n.hasBenefit);
        System.out.println(offersWithBenefits);
        System.out.println("____________________________________________");

        ArrayList<Offer> sdetOffers = new ArrayList<>();
        sdetOffers.addAll(Arrays.asList(myOffers));
        sdetOffers.removeIf(n -> !n.jobTitle.equals("SDET"));
        System.out.println(sdetOffers);
        System.out.println("____________________________________________");

        ArrayList<Offer> highSalary = new ArrayList<>();
        highSalary.addAll(Arrays.asList(myOffers));
        highSalary.removeIf(n->n.salary<100000);
        System.out.println(highSalary);


    }
}
