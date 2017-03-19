package Week1.prakticum1;

public class Zwembad {
	private double breedte;
	private double lengte;
	private double diepte;
	private double inhoud;
	
	public Zwembad(double bre, double len, double die){
		breedte = bre;
		lengte = len;
		diepte = die;
	}
	
	public Zwembad(){}
	
	public double getBreedte(){ return breedte; }
	public double getLengte(){ return lengte; }
	public double getDiepte(){ return diepte; }
	public double inhoud(){ 
		inhoud = breedte * lengte * diepte;
		return inhoud; }
	
	public void setBreedte(double nwBreedte){ breedte = nwBreedte; }
	public void setLengte(double nwLengte){ lengte = nwLengte; }
	public void setDiepte(double nwDiepte){ diepte = nwDiepte; }
	
	public String toString(){
		String s = "Dit zwembad is "+breedte+" meter breed, "+lengte+" meter lang, en "+diepte+" meter diep";
		return s;
	}
}
