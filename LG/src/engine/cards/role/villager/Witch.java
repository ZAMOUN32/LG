package engine.cards.role.villager;

import engine.cards.Cards;

public class Witch extends Cards {

	public Witch() {
		
		this.name = "Witch";
		
		this.game = GAME_WEREWOLF;
		this.type = VILLAGER;
	}
	
	@Override
	public void vote() {
		
	}
}
