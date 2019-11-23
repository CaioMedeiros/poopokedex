package Main;

import Manager.GameStateManager;

public class Game implements Runnable {
	
	private boolean running;
	
	private GameStateManager gsm;
	
	public void run() {
		init();
		
		while(running) {
			update();
		}
	}
	
	private void init() {
		running = true; 
		gsm = new GameStateManager();
	}
	
	private void update() {
		gsm.update();
	}
}
