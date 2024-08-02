package engine.game.key;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * The KeyHandler class handles keyboard input events by implementing the KeyListener interface.
 * It extends the Key abstract class to manage boolean flags for pressed keys.
 */
public class KeyHandler extends Key implements KeyListener {
	
	/**
	 * Invoked when a key is typed, but this method is currently not implemented.
	 * This method is part of the KeyListener interface and is provided here as a placeholder.
	 * Subclasses may choose to override this method to handle key-typed events.
	 *
	 * @param e The KeyEvent associated with the key-typed event.
	 */
	@Override
	public void keyTyped(KeyEvent e) {
	}

	
	/**
	 * Invoked when a key is pressed.
	 * Updates the corresponding boolean flags based on the pressed arrow keys.
	 *
	 * @param e The KeyEvent associated with the key-pressed event.
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		
		int code = e.getKeyCode();
		
		// Update boolean flags based on the pressed arrow keys.
		if (code == KeyEvent.VK_Z || code == KeyEvent.VK_UP) {
			upPressed = true;
		}
		
		if (code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN) {
			downPressed = true;
		}

		if (code == KeyEvent.VK_Q || code == KeyEvent.VK_LEFT) {
			leftPressed = true;
		}

		if (code == KeyEvent.VK_D || code == KeyEvent.VK_RIGHT) {
			rightPressed = true;
		}
		
		if (code == KeyEvent.VK_E) {
			ePressed = true;
		}
		
		if (code == KeyEvent.VK_A) {
			aPressed = true;
		}
		
		if (code == KeyEvent.VK_F) {
			fPressed = true;
		}
		
		if (code == KeyEvent.VK_R) {
			rPressed = true;
		}
		
		if (code == KeyEvent.VK_SPACE) {
			spacePressed = true;
		}
		
		if (code == KeyEvent.VK_CONTROL) {
			controlPressed = true;
		}
		
		if (code == KeyEvent.VK_SHIFT) {
			shiftPressed = true;
		}
	}

	
	/**
	 * Invoked when a key is released.
	 * Updates the corresponding boolean flags based on the released arrow keys.
	 *
	 * @param e The KeyEvent associated with the key-released event.
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		
		int code = e.getKeyCode();
		
		// Update boolean flags based on the released arrow keys.
		if (code == KeyEvent.VK_Z || code == KeyEvent.VK_UP) {
			upPressed = false;
		}
		
		if (code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN) {
			downPressed = false;
		}

		if (code == KeyEvent.VK_Q || code == KeyEvent.VK_LEFT) {
			leftPressed = false;
		}

		if (code == KeyEvent.VK_D || code == KeyEvent.VK_RIGHT) {
			rightPressed = false;
		}
		
		if (code == KeyEvent.VK_E) {
			ePressed = false;
		}
		
		if (code == KeyEvent.VK_A) {
			aPressed = false;
		}
		
		if (code == KeyEvent.VK_F) {
			fPressed = false;
		}
		
		if (code == KeyEvent.VK_R) {
			rPressed = false;
		}
		
		if (code == KeyEvent.VK_SPACE) {
			spacePressed = false;
		}
		
		if (code == KeyEvent.VK_CONTROL) {
			controlPressed = false;
		}
		
		if (code == KeyEvent.VK_SHIFT) {
			shiftPressed = false;
		}
		
	}
	
}

