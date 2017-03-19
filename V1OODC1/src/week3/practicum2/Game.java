package week3.practicum2;

public class Game {
	private String naam;
	private int releaseJaar;
	private double nieuwprijs;
	
	public Game(String naam, int releaseJaar, double nwprijs){
		this.naam = naam;
		this.releaseJaar = releaseJaar;
		this.nieuwprijs = nwprijs;
	}
	
	public String getNaam(){ return naam; }
	public double huidigeWaarde(){ 
		double huidigePrijs = nieuwprijs;
		for(int i=releaseJaar; 2016 - i > 0; i++){
			huidigePrijs = huidigePrijs * 0.70;
		}
		return huidigePrijs;
	}
	public boolean equals(Object andereObject){
		boolean gelijkeObjecten = false;
		
		if (andereObject instanceof Game) {
			Game andereGame = (Game) andereObject;
			
			if (this.naam.equals(andereGame.naam) &&
				this.nieuwprijs == andereGame.nieuwprijs &&
				this.releaseJaar == andereGame.releaseJaar) {
				
				gelijkeObjecten = true;
			}
		}
		return gelijkeObjecten;
	}
	public String toString(){
		return "\n\t" + naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: " + nieuwprijs + " nu voor: €" + huidigeWaarde();
	}
}
