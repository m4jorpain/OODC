package week2.les1.opdracht1;

public class Huisdier {
	private String naam;
	private String ras;
	private double gewicht;
	private Eigenaar baasje;
	public Huisdier(String nm, String r) {
	naam = nm;
	ras = r;
	gewicht = 0.0;
	}
	
	Eigenaar st1 = new Eigenaar("Henk");
	
	public void setBaasje(Eigenaar b){
		baasje = b;
	}
	public Eigenaar getBaasje(){
		return baasje;
	}
	
	
	public String getNaam() { return naam; }
	public String getRas() { return ras; }
	public String toString() {
		return naam + ", de " + ras + ", weegt " + gewicht + " kg.";
	}
}
