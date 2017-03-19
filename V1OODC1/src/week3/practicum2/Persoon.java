package week3.practicum2;
import java.util.*;

public class Persoon {
	private String naam;
	private double budget;
	private ArrayList<Game> games;
	
	public Persoon(String naam, double budget){
		this.naam = naam;
		this.budget = budget;
		games = new ArrayList<Game>();
	}
	
	public boolean koop(Game game){
		if (!games.contains(game) && budget >= game.huidigeWaarde() ) {
			games.add(game);
			budget  -= game.huidigeWaarde();
			return true;
		}
		return false;
	}
	
	public boolean verkoop(Game game, Persoon koper){
		if (games.contains(game) == false || koper.koop(game) != true ){
			return false;
		}
		if(games.remove(game) == true){
			budget += game.huidigeWaarde();
			return true;
		}
		return false;
	}
	public Game zoekGameOpNaam(String naam){
		for (int i=0;i<games.size();i++){
			if (games.get(i).getNaam() == naam){
				return games.get(i);
			}
		}
		return null;
	}
	
	public String toString(){
		return naam + " heeft een budjet van €" + budget + " en bezit de volgende games:\n"+ games;
	}
}
