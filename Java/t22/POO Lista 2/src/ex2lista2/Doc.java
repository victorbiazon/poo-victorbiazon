package ex2lista2;

public class Doc {

	public void transferir(Cliente c1,Cliente c2,double quantia) {		
		c1.sacar(quantia);												//Saca de uma conta
		c2.depositar(quantia);											//e deposita em outra

	}
}
