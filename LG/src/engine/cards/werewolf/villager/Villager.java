package engine.cards.werewolf.villager;

import engine.cards.*;

public class Villager extends Cards {

	public Villager() {
		
		this.name = "Villager";
		
		this.game = GAME_WEREWOLF;
		this.type = VILLAGER;
	}
	
	@Override
	public void vote() {
		
	}
}
