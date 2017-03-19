package week5.practicum4;

public class Leerling {
	private String naam;
	private double cijfer = 0.0;
	
	public Leerling(String naam){
		this.naam = naam;
		cijfer = 0.0;
	}
	
	public String getNaam(){ return naam; }
	public double getCijfer(){ return cijfer; }
	
	public void setCijfer(double cijfer){ this.cijfer = cijfer; }
	
	public String toString(){
		return naam;
	}
}
