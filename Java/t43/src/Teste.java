
public class Teste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Chá",1200,new IPI());
		Produto p2 = new Produto("Bolacha",1000,new ICMS());
		Produto p3 = new Produto("Café",3000,new IPI());
		Produto p4 = new Produto("Carne",10000,new IPI());
		Colecao c = new Colecao();
		c.adicionar(p1);
		c.adicionar(p2);
		c.adicionar(p3);
		c.adicionar(p4);
		c.infoProduto();		
	}
}