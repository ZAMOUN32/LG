package engine.cards.werewolf.werewolf;

import engine.cards.Cards;

public class Werewolf extends Cards {

	public Werewolf() {
		
		this.name = "Werewolf";
		
		this.game = GAME_WEREWOLF;
		this.type = WEREWOLF;
	}
	
	@Override
	public void vote() {
		
	}
}
