package classes;

import Map.MapObject;

public class Item extends MapObject {
	public String nome;
	public String funcao;
	
	public Item() {}

	public Item(String nome, String funcao) {
		super();
		this.nome = nome;
		this.funcao = funcao;
	}

	@Override
	public String toString() {
		return "Item [nome=" + nome + ", funcao=" + funcao + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
		
}