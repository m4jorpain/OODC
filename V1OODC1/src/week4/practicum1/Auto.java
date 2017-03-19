package week4.practicum1;

public class Auto extends Voertuig {
	private String kenteken;
	
	public Auto(String type, double prijs, int jaar, String kenteken){
		super(type, prijs, jaar);
		this.kenteken = kenteken;
	}
	
	public double huidigeWaarde(){
		double huidigePrijs = super.nieuwprijs;
		for(int i=super.bouwjaar; 2016 - i > 0; i++){
			huidigePrijs = huidigePrijs * 0.70;
		}
		return huidigePrijs;
	}
	
	public boolean equals(Object andereObject){
		boolean gelijkeObjecten = false;
		
		if (andereObject instanceof Auto) {
			Auto andereAuto = (Auto) andereObject;
			
			if (this.kenteken == andereAuto.kenteken) {
				
				gelijkeObjecten = true;
			}
		}
		return gelijkeObjecten;
	}
}
