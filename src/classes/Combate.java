package classes;

public class Combate {
	Npc npc;
	Jogador jogador;
	
	public Combate(Npc npc, Jogador jogador) {
		super();
		this.npc = npc;
		this.jogador = jogador;
	}
	
	public Npc getNpc() {
		return npc;
	}
	public void setNpc(Npc npc) {
		this.npc = npc;
	}
	public Jogador getJogador() {
		return jogador;
	}
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}	
}
