package week4.practicum1;


public abstract class Voertuig implements Goed {
	private String type;
	protected double nieuwprijs;
	protected int bouwjaar;
	
	public Voertuig(String type, double prijs, int jaar){
		this.type = type;
		this.nieuwprijs = prijs;
		this.bouwjaar = jaar;
	}
	
	public double getNieuwprijs(){ return nieuwprijs; }
	public int getBouwjaar(){ return bouwjaar; }
	
	public boolean equals(Object andereObject){
		boolean gelijkeObjecten = false;
		
		if (andereObject instanceof Voertuig) {
			Voertuig andereVoertuig = (Voertuig) andereObject;
			
			if (this.type.equals(andereVoertuig.type) &&
				this.nieuwprijs == andereVoertuig.nieuwprijs &&
				this.bouwjaar == andereVoertuig.bouwjaar) {
				
				gelijkeObjecten = true;
			}
		}
		return gelijkeObjecten;
	}
	
	
	public String toString(){
		String s = "\nVoertuig: " +type+ " met bouwjaar " +bouwjaar+ " heeft een waarda van: " +huidigeWaarde();
		return s;
	}
}
