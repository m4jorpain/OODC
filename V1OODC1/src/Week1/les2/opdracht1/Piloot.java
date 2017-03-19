package Week1.les2.opdracht1;

public class Piloot {
	private String naam;
	private int vlieguren;
	private double salaris;
	
	public Piloot(String nm){
		naam = nm;
	}
	
	public String getNaam()		{ return naam; }
	public int getVlieguren()	{ return vlieguren; }
	public double getSalaris()	{ return salaris; }
	
	public void setNaam(String nwNaam)			{ naam = nwNaam; }
	public void verhoogVliegurenMet(int nwVlieguren)	{ vlieguren = vlieguren + nwVlieguren; }
	public void setSalaris(double nwSalaris)	{ salaris = nwSalaris; }
	
	public String toString(){
		String s = naam + " heeft " + vlieguren + " vlieguren gemaakt en verdient " + salaris;
		return s;
	}
	
}
