package week4.practicum1;

public class Fiets extends Voertuig {
	private int framenummer;
	
	public Fiets(String type, double prijs, int jaar, int framenummer){
		super(type, prijs, jaar);
		this.framenummer = framenummer;
	}
	
	public double huidigeWaarde(){
		double huidigePrijs = super.nieuwprijs;
		for(int i=super.bouwjaar; 2016 - i > 0; i++){
			huidigePrijs = huidigePrijs * 0.90;
		}
		return huidigePrijs;
	}
	
	public boolean equals(Object andereObject){
		boolean gelijkeObjecten = false;
		if (andereObject instanceof Fiets) {
			Fiets andereFiets = (Fiets) andereObject;
			if (this.framenummer == andereFiets.framenummer) {
				gelijkeObjecten = true;
			}
		}
		return gelijkeObjecten;
	}
}
