package week3.les2.opdracht2;
import java.util.*;

public class FacebookAccount {
	private String naam;
	private ArrayList<Vriend> mijnVrienden;
	
	public FacebookAccount(String naam){
		this.naam = naam;
	}
	
	public String getNaam(){ return naam; }
	public void voegVriendToe(Vriend nwVriend){ mijnVrienden.add(nwVriend); }
	public boolean verwijderVriend(Vriend exVriend){
		if(mijnVrienden.remove(exVriend)){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isVriendMet(Vriend vriend){
		if (mijnVrienden.contains(vriend)){
			return true;
		} else {
			return false;
		}
	}
	
	public int aantalVrienden(){ return mijnVrienden.size(); }
	
	public String toString(){
		return naam;
	}
}
