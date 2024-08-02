package engine.cards;


public abstract class Cards {
	
	public static final int GAME_WEREWOLF = 0;
	
	public static final int VILLAGER = 0;
	public static final int WEREWOLF = 1;
	public static final int SOLO = 2;
	public static final int HYBRID = 3;

	public String name;
	public String player;
	
	public int game;
	public int type;
	
	public int nbRiseUp;
	public int priority;
	
	public abstract void vote();
	
}