class Colecao {

	private ArrayList<Produto> prod

	Colecao(){
		this.prod = new ArrayList<Produto>()
	}
	
	def adicionar(Produto p) {
		prod.add(p)
	}
	
	def infoProduto() {
		for(Produto p: prod) {
			p.exibir()	
		}
	}
}

