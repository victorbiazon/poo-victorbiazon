
public class Teste {

	public static void main(String[] args) {
		
		ICMS i1 = new ICMS("Ch�",10);
		ICMS i2 = new ICMS("Bolacha",4);
		IPI ip1 = new IPI("Carne",27);
		IPI ip2 = new IPI("Caf�",13);
	
		Colecao c = new Colecao();
		c.adicionar(i1);
		c.adicionar(i2);
		c.adicionar(ip1);
		c.adicionar(ip2);
		c.infoProduto();
	}
}
