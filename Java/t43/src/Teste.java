
public class Teste {

	public static void main(String[] args) {
		
		ICMS i1 = new ICMS("Ch�",10);
		ICMS i2 = new ICMS("Bolacha",4);
		IPI ip1 = new IPI("Carne",27);
		IPI ip2 = new IPI("Caf�",13);
		i1.exibir();
		i2.exibir();
		ip1.exibir();
		ip2.exibir();
		
	}
}
