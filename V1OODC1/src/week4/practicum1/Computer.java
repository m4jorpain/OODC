package week4.practicum1;

public class Computer implements Goed {
	private String type;
	private String macAdres;
	private double aanschafPrijs;
	private int productieJaar;
	
	public Computer(String type, String adres, double prijs, int jaar){
		this.type = type;
		this.macAdres = adres;
		this.aanschafPrijs = prijs;
		this.productieJaar = jaar;
	}
	
	public double huidigeWaarde(){
		double huidigePrijs = aanschafPrijs;
		for(int i=productieJaar; 2016 - i > 0; i++){
			huidigePrijs = huidigePrijs * 0.60;
		}
		return huidigePrijs;
	}
	public boolean equals(Object andereObject){
		boolean gelijkeObjecten = false;
		if (andereObject instanceof Computer) {
			Computer andereComputer = (Computer) andereObject;
			if (this.type.equals(andereComputer.type) &&
				this.macAdres.equals(andereComputer.macAdres) &&
				this.aanschafPrijs == andereComputer.aanschafPrijs &&
				this.productieJaar == andereComputer.productieJaar) {
				gelijkeObjecten = true;
			}
		}
		return gelijkeObjecten;
	}
	public String toString(){
		String s = "\nComputer: " +type+ " heeft een waarde van: " +huidigeWaarde();
		return s;
	}
}
