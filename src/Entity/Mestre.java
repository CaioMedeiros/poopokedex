package Entity;

import Map.MapObject;

public class Mestre extends MapObject {
	private String name;
	private Pokemon[] pokemons = new Pokemon[6];
	private Pokemon currentPokemon;
	private int money;
	private int location;

	public Mestre() {
	}

	public Mestre(String name, Pokemon[] pokemons, Pokemon currentPokemon, int money, int location) {
		super();
		this.name = name;
		this.pokemons = pokemons;
		this.currentPokemon = currentPokemon;
		this.money = money;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pokemon[] getPokemons() {
		return pokemons;
	}

	public void setPokemons(Pokemon[] pokemons) {
		this.pokemons = pokemons;
	}

	public Pokemon getCurrentPokemon() {
		return currentPokemon;
	}

	public void setCurrentPokemon(Pokemon currentPokemon) {
		this.currentPokemon = currentPokemon;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

}
