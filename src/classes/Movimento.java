package classes;

public class Movimento {
	public String nome;
	public String efeito;
	public Tipo tipo;
	public int acc;
	public int power;
	public int pp;
	
	public Movimento() {}

	public Movimento(String nome, String efeito, Tipo tipo, int acc, int power, int pp) {
		super();
		this.nome = nome;
		this.efeito = efeito;
		this.tipo = tipo;
		this.acc = acc;
		this.power = power;
		this.pp = pp;
	}

	@Override
	public String toString() {
		return "Movimentos [nome=" + nome + ", efeito=" + efeito + ", tipo=" + tipo + ", acc=" + acc + ", power="
				+ power + ", pp=" + pp + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEfeito() {
		return efeito;
	}

	public void setEfeito(String efeito) {
		this.efeito = efeito;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public int getAcc() {
		return acc;
	}

	public void setAcc(int acc) {
		this.acc = acc;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getPp() {
		return pp;
	}

	public void setPp(int pp) {
		this.pp = pp;
	}

}