package week2.practicum2;

public class AutoHuur {
	private int aantalDagen;
	private double totaalPrijs;
	private Auto gehuurdeAuto;
	private Klant klant;
	
	public AutoHuur(){}
	
	
	public void setAantalDagen(int aantalDagen){ this.aantalDagen = aantalDagen; }
	public void setGehuurdeAuto(Auto gehuurdeAuto){ this.gehuurdeAuto = gehuurdeAuto; }
	public void setHuurder(Klant klant){ this.klant = klant; }
	
	public Auto getGehuurdeAuto(){ return gehuurdeAuto; }
	public Klant getHuurder(){ return klant; }
	public double totaalPrijs(){ 
		if(gehuurdeAuto == null){
			totaalPrijs = 0;
		} else {
			totaalPrijs = aantalDagen * gehuurdeAuto.getPrijsPerDag() - ( aantalDagen * gehuurdeAuto.getPrijsPerDag() / klant.getKorting());
		}
		return totaalPrijs;
	}
	
	public String toString(){
		String s = "";
		if(getGehuurdeAuto() == null){
			s += " er is geen auto bekend";
		} else {
			s += " autotype: " + getGehuurdeAuto();
		}
		if(getHuurder() == null){
			s += "\n er is geen huurder bekend";
		} else {
			s += "\n op naam van: " + getHuurder();
		}
		s += "\n aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
		return s;
	}
}
