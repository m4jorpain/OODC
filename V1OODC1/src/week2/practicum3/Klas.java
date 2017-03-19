package week2.practicum3;
import java.util.*;

public class Klas {
	private String klasCode;
	private ArrayList<Leerling> leerlingen;
	
	public Klas(String klasCode){ 
		this.klasCode = klasCode;
		leerlingen = new ArrayList<Leerling>();	
	}
	
	public void voegLeerlingToe(Leerling leerling){ leerlingen.add(leerling); }
	
	public void wijzigCijfer(String naam, double cijfer){ 
		for(int i=0;i<leerlingen.size();i++){
			Leerling currentLeerling = leerlingen.get(i);
			if(currentLeerling.getNaam().equals(naam)){
				currentLeerling.setCijfer(cijfer);
				break;
			}
		}
	}
	public int aantalLeerlingen(){ return leerlingen.size(); }
	
	public String toString(){
		String s = "In Klas " + klasCode + " zitten de volgende leerlingen:\n";
		for(int i=0;i<leerlingen.size();i++){
			s += leerlingen.get(i).getNaam() + " heeft het cijfer: " + leerlingen.get(i).getCijfer() + "\n";
		}
		return  s;
	}
}
