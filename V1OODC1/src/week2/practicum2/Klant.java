package week2.practicum2;

public class Klant {
	private String naam;
	private double kortingsPercentage;
	
	public Klant(String naam){
		this.naam = naam;
	}
	
	public void setKorting(double korting){ kortingsPercentage = korting; }
	
	public double getKorting(){ return kortingsPercentage; }
	
	public String toString(){
		String s = naam + " (korting: " + kortingsPercentage + "%)";
		return s;
	}
	
}
