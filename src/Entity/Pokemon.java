package Entity;

import java.util.Arrays;

import classes.Movimento;
import classes.Tipo;

public class Pokemon {
	public String nome;
	public Tipo tipo;
	public int speed;
	public int attack;
	public int defense;
	public int hp;
	public int hpMax;
	public Movimento[] moves;

	public Pokemon() {
	}

	public Pokemon(String nome, Tipo tipo, int speed, int attack, int defense, int hpMax, Movimento[] moves) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.speed = speed;
		this.attack = attack;
		this.defense = defense;
		this.hp = hpMax;
		this.hpMax = hpMax;
		this.moves = moves;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getHpMax() {
		return hpMax;
	}

	public void setHpMax(int hpMax) {
		this.hpMax = hpMax;
	}

	public Movimento[] getMoves() {
		return moves;
	}

	public void setMoves(Movimento[] moves) {
		this.moves = moves;
	}

	@Override
	public String toString() {
		return "Pokemon [nome=" + nome + ", tipo=" + tipo + ", speed=" + speed + ", attack=" + attack + ", defense="
				+ defense + ", hp=" + hp + ", hpMax=" + hpMax + ", moves=" + Arrays.toString(moves) + "]";
	}
}
