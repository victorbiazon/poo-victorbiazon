
public class Teste {

	public static void main(String[] args) {
		
		ICMS i1 = new ICMS("Chá",10);
		ICMS i2 = new ICMS("Bolacha",4);
		IPI ip1 = new IPI("Carne",27);
		IPI ip2 = new IPI("Café",13);
		i1.exibir();
		i2.exibir();
		ip1.exibir();
		ip2.exibir();
		
	}
}
