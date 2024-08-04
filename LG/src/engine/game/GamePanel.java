package engine.game;

import java.awt.*;


@SuppressWarnings("serial")
public class GamePanel extends GameStat implements Runnable {
	

	public GamePanel() {
		this.currentState = TITLE_SCREEN;
		this.setPreferredSize(new Dimension(this.screenWidth, this.screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		this.addKeyListener(this.keyH);
		this.setFocusable(true);
		createObject();
	}
	

	public void startGameThread() {
		this.gameThread = new Thread(this);
		this.gameThread.start();
		startGame();
	}
	
	public void startGame() {
		this.currentState = IN_GAME;
	}
	
	

	@Override
	public void run() {
		
		while(this.gameThread != null) {
			
			this.currentTime = System.nanoTime();
			
			this.delta += (this.currentTime - this.lastTime) / this.drawInterval;
			this.timer += (this.currentTime - this.lastTime);
			this.lastTime = this.currentTime;
			loopDo();
			//showFPS();
		}
	}
	
	

	public void showFPS() {
		if(this.timer >= 1000000000) {
			System.out.println("FPS:" + this.drawCount);
			this.drawCount = 0;
			this.timer = 0;
		}
	}
	

	public void loopDo() {
		if(this.delta >= 1) {
			
			update();
			repaint();
			
			this.delta--;
			this.drawCount++;
		}
	}
	

	public void createObject() {
		
	}
	

	public void update() {
		if (this.currentState == TITLE_SCREEN) {
			updateTitleScreen();
		} else if (this.currentState == IN_GAME) {
			updateInGame();
		}
	}
	
	public void updateTitleScreen() {
		
	}
	
	public void updateInGame() {

		
		
	}
	

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		if (this.currentState == TITLE_SCREEN) {
			
		} else if (this.currentState == IN_GAME) {
			paintInGame(g2);
		}
		
		
	}
	
	public void paintInGame(Graphics2D g2) {

	}
}