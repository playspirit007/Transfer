package Übungsaufgaben.Interfaces01;

import java.util.ArrayList;

public class TravelAgency {
	private final String name;
	private ArrayList<Partner> partners;
	
	public TravelAgency(String name) {
		this.name = name;
		this.partners = new ArrayList<>();
	}
	public void addPartner(Partner partner) {
		this.partners.add(partner);
	}
	public String toString() {
		System.out.println(this.name);
		System.out.println("Unsere Partner: ");
		for (Partner p : partners) {
			Partner output = p;
			System.out.println(output);
		}
		
		return"";
	}
}
