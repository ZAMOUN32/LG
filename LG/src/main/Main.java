package main;

import javax.swing.JFrame;

import engine.game.*;

/**
 * The Main class serves as the entry point for the Ingametion application.
 * It initializes and configures the main JFrame window and starts the game.
 */
public class Main {
	
	/**
     * The main method, responsible for initializing the game window,
     * setting up the game panel, and starting the game thread.
     * 
     * @param agrs command-line arguments (not used)
     */
	public static void main(String[] agrs) {
		
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Werewolf");
		
		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);
		
		window.setSize(gamePanel.getPreferredSize());
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		gamePanel.startGameThread();
	}
}
