package lojadelivros;

public class Livraria {
	
	
	private int estoque;
	Livro livro;
	
	public Livraria(int estoque) {
		this.estoque = Math.max(0, estoque);		
		
	}
	
	public void venderLivro(int quantidade) {
		int qtVendas = Math.max(0, quantidade);
		if(qtVendas <= estoque) {
			estoque -= qtVendas;
		}
	}
	
	public int estoque() {
		return estoque;
	}


}
