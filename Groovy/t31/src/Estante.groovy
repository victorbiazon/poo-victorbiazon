
class Estante {
	
	private String nome
	private Categoria categoria
	private Livro[] livros
	private int contLivros
	
	
	def Estante(String nome,Categoria categoria, int qtLivros) {
		this.nome = nome
		this.categoria = categoria
		this.livros =  new Livro[qtLivros]
	}

	
	def inserirLivro(Livro livro) {
	
		if(this.livros[contLivros] != null) { //validação para saber se tem livro
		
			livros[contLivros] = livro
			contLivros++
		}
	}
	
	def removerLivro(Livro livro) {
	
		for(int i = 0; i<contLivros; i++) {
			
			if(livros[i].equals(livro)) {
				livros[i] = null
			    contLivros--
			}
				
		}
		
	}
	

	def String getNome() {
		 nome
	}

	def Categoria getCategoria() {
		 categoria
	}


	def Livro[] getLivros() {
		livros
	}

	
	
}
