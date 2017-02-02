package hotel;

public class Estadia {

	private Animal animal;
	private double valor;
	private int dias;
	
	public Estadia(String nome, String tipo, int idade, int dias, double valor) {
		this.animal = new Animal(nome, tipo, idade);
		this.valor = valor;
		this.dias = dias;
	}

	public String getNome() {
		return animal.getNome();
	}
	
	public String getTipo() {
		return animal.getTipo();
	}
	
	public int getIdade() {
		return animal.getIdade();
	}
	
	public double getValor() {
		return valor;
	}

	public int getDias() {
		return dias;
	}

	@Override
	public String toString() {
		return getNome() + ", " + getTipo() + ", " + dias + " dias com o preço de R$ " + valor;
	}
		
}
