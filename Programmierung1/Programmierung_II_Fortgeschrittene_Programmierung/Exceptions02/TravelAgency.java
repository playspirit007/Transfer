package Exceptions02;

import java.util.ArrayList;

public class TravelAgency {
    private final String name;
    private ArrayList<Partner> partners;

    public TravelAgency(String name) {
        this.name = name;
        this.partners = new ArrayList<>();
    }

    public void addPartner(Partner partner) {
        partners.add(partner);
    }

    @Override
    public String toString() {
        return "TravelAgency: " + name + ", Partners: " + partners;
    }
}

