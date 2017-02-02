package hotel;

import java.util.ArrayList;

public class Recepcao {
	private ArrayList<Estadia> estadias;
	
	
	public Recepcao(){
		this.estadias = new ArrayList<Estadia>();
	}

	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor){
		Estadia estadia = new Estadia(nome, tipo, idade, dias, valor);
		estadias.add(estadia);
		
	}
	public void checkOut(String nome){
		for(Estadia estadia: estadias){
			if(estadia.getNome().equals(nome)){
				estadias.remove(estadia);
			}
		}
		
	}
	public int getNumDeHospedes(){
		return this.estadias.size();
	}
	public double getLucroTotal(){
		double lucro = 0;
		for(Estadia estadia: estadias){
			lucro += estadia.getValor();
		}
		return lucro;
	}
	@Override
	public String toString(){
		String mensagem = "Estadias: \n";
		for(Estadia estadia: estadias){
			mensagem += estadia.getNome() + " (" + estadia.getTipo() + "): " + estadia.getDias + " dias com preço de R$ "+ estadia.getValor() +"\n";
		}
	}
}
