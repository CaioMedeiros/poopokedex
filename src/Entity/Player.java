package Entity;

import java.util.List;

import classes.Insignia;

public class Player extends Mestre {
	List<Insignia> insignias;
	private int[] posicao = {1,1};
	
	public Player(List<Insignia> insignias) {
		super();
		this.insignias = insignias;
	}
	
	public void mover(int lin, int col) {
		int[] novaPosicao = {lin, col};
		posicao = novaPosicao;
	}
	
	public int[] localizacao() {
		return posicao;
	}

	public List<Insignia> getInsignias() {
		return insignias;
	}

	public void setInsignia(List<Insignia> insignias) {
		this.insignias = insignias;
	}

	public int[] getPosicao() {
		return posicao;
	}

	public void setPosicao(int[] posicao) {
		this.posicao = posicao;
	}
	
}
