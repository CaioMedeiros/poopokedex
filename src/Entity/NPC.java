package Entity;

import classes.Insignia;

public class NPC extends Mestre {
	Insignia insignia;

	public NPC(Insignia insignia) {
		super();
		this.insignia = insignia;
	}

	public Insignia getInsignia() {
		return insignia;
	}

	public void setInsignia(Insignia insignia) {
		this.insignia = insignia;
	}
}
