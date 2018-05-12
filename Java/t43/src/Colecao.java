import java.util.ArrayList;

public class Colecao {

	private ArrayList<Produto> prod;

	public Colecao(){
		this.prod = new ArrayList<Produto>();
	}
	
	public void adicionar(Produto p) {
		prod.add(p);
	}
	
	public void infoProduto() {
		for(Produto p: prod) {
			if(p instanceof ICMS)
				((ICMS) p).exibir();
			else
				((IPI) p).exibir();			
		}
	}
}
