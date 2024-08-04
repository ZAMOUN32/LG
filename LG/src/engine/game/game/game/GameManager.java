package engine.game.game.game;

import engine.cards.werewolf.villager.*;
import engine.cards.werewolf.werewolf.*;
import engine.game.game.player.*;

public class GameManager extends Game {

	public GameManager() {
		
		PlayerManager player1 = new PlayerManager("Yanis");
		PlayerManager player2 = new PlayerManager("Mathis");
		PlayerManager player3 = new PlayerManager("Edouard");
		
		this.players.add(player1);
		this.players.add(player2);
		this.players.add(player3);
		
		this.nbPlayer = this.players.size();
		
		Villager card1 = new Villager();
		Villager card2 = new Villager();
		Werewolf card3 = new Werewolf();
		
		
	}
}
