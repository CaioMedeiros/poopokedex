package Manager;

import GameState.BattleState;
import GameState.GameState;
import GameState.PlayState;
import GameState.StatusState;
import GameState.WildState;

public class GameStateManager {
	private GameState[] gameStates;
	private int currentState;
	private int previousState;

	public static final int NUM_STATES = 4;
	public static final int BATTLE = 0;
	public static final int PLAY = 1;
	public static final int STATUS = 2;
	public static final int WILD = 3;

	public GameStateManager() {
		gameStates = new GameState[NUM_STATES];
		setState(PLAY);
	}

	public void setState(int state) {
		previousState = currentState;
		unloadState(previousState);
		if (state == BATTLE) {
			gameStates[state] = new BattleState(this);
			gameStates[state].init();
		} else if (state == PLAY) {
			gameStates[state] = new PlayState(this);
			gameStates[state].init();
		} else if (state == STATUS) {
			gameStates[state] = new StatusState(this);
			gameStates[state].init();
		} else if (state == WILD) {
			gameStates[state] = new WildState(this);
			gameStates[state].init();
		}
	}

	public void unloadState(int state) {
		gameStates[state] = null;
	}

	public void update() {
		if (gameStates[currentState] != null)
			gameStates[currentState].update();
	}
}
