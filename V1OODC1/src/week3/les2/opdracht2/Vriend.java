package week3.les2.opdracht2;

public class Vriend {
	private String voornaam;
	private String achternaam;
	private String email;
	
	public Vriend(String voornaam, String achternaam, String email){
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		this.email = email;
	}
	
//	public boolean equals(Object andereObject){ 
//		if(voornaam.equals(andereObject)){
//			return true;
//		}
//	}
	public String toString(){
		return voornaam + achternaam + email;
	}
}
