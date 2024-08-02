package engine.game;

import javax.swing.*;

import engine.game.key.*;

@SuppressWarnings("serial")
public abstract class GameStat extends JPanel {
	
	public static final int TITLE_SCREEN = 0;
	public static final int IN_GAME = 1;
	
	public int currentState;
	
	public final int screenWidth = 1920; // 1920 pixels
	public final int screenHeight = 1080; // 1080 pixels
	
	
	public Thread gameThread;
	public KeyHandler keyH = new KeyHandler();
	
	/**
	 * Game timing and frame rate control variables.
	 * These variables are used to manage the timing and synchronization of the game loop,
	 * controlling the frame rate, measuring elapsed time, and tracking the number of frames drawn.
	 */
	public final int FPS = 60;
	public final double drawInterval = 1000000000/FPS; 	// 0.01666 seconds
	public double delta = 0;
	public long lastTime = System.nanoTime();
	public long currentTime;
	public long timer = 0;
	public long drawCount = 0;
	
	/**
	 * Indicates whether the debug mode is enabled or disabled.
	 * If set to {@code true}, the program is in debug mode; otherwise, it is in normal mode.
	 */
	public final boolean debugMode = true;

}
