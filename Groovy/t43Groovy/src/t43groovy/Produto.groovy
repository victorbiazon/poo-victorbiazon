class Produto {
	
	private String nome
	private double preco
	private Imposto imp
	
	Produto(String nome,double preco,Imposto imp){
		this.nome = nome
		this.preco = preco
		this.imp = imp
	}

	def getNome() {
		nome
	}
	
	def getPreco() {
		preco
	}
	
	def getImp(){
        imp
	}
	
	def exibir(){
        println ("Nome: " + getNome())
        println ("Preco com imposto descontado: " + getPreco*imp.aliquota())
	}

}

