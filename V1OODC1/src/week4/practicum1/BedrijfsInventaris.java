package week4.practicum1;
import java.util.*;

public class BedrijfsInventaris {
	private String bedrijfsnaam;
	private double budget;
	private ArrayList<Goed> alleGoederen;
	
	public BedrijfsInventaris(String naam, double budget){
		this.bedrijfsnaam = naam;
		this.budget = budget;
		alleGoederen = new ArrayList<Goed>();
	}
	
	public void schafAan(Goed goed){
		if (goed == null){
			throw new IllegalArgumentException("goed mag niet null zijn");
		} else {
			if (budget > goed.huidigeWaarde()){
				if (!alleGoederen.contains(goed)){
					alleGoederen.add(goed);
					budget -= goed.huidigeWaarde();
				}
			}
		}
	}
	
	public String toString(){
		String s = bedrijfsnaam + " met inventaris:";
		for(Goed g : alleGoederen){
			s += g.toString();
		}
		return s;
	}
}
