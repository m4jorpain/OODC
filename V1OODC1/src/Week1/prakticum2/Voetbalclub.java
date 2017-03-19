package Week1.prakticum2;

public class Voetbalclub {
	private String naam;
	private int wedstrijden;
	private int aantalGewonnen;
	private int aantalGelijk;
	private int aantalVerloren;
	private int punten;
	
	public Voetbalclub(String nm){
		naam = nm;
	}
	
	public void aantalPunten(){
		punten = aantalGewonnen * 3 + aantalGelijk * 1;
	}
	
	public void aantalGespeeld(){
		wedstrijden = aantalGewonnen + aantalGelijk + aantalVerloren;
	}
	
	public void verwerkResultaat(char ch) {
		if (ch == 'w'){
		aantalGewonnen = aantalGewonnen + 1;
		}
		else if (ch == 'g'){
		aantalGelijk = aantalGelijk + 1;
		}
		else if (ch == 'v'){
		aantalVerloren = aantalVerloren + 1;
		}
		aantalPunten();
		aantalGespeeld();
	}

	public String toString(){
		String s = naam+" 	"+wedstrijden+" 	"+aantalGewonnen+"	"+aantalGelijk+" 	"+aantalVerloren+" 	"+punten;
		return s;
	}
}
