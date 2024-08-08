package engine.game.inGame.game;

import java.util.*;

import engine.cards.*;
import engine.game.inGame.player.Player;

public abstract class Game {

	public int nbPlayer;
	
	public ArrayList<Player> players = new ArrayList<>();
	
	public ArrayList<Cards> cards = new ArrayList<>();
}
