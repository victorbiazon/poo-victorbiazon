
public class Estante {
	
	private String nome;
	private Categoria categoria;
	private Livro[] livros;
	private int contLivros;
	
	
	public Estante(String nome,Categoria categoria, int qtLivros) {
		this.nome = nome;
		this.categoria = categoria;
		this.livros =  new Livro[qtLivros];
	}

	
	public void inserirLivro(Livro livro) {
	
		if(this.livros[contLivros] != null) { //validação para saber se tem livro
		
			livros[contLivros] = livro;
			contLivros++;
		}
	}
	
	public void removerLivro(Livro livro) {
	
		for(int i = 0; i<contLivros; i++) {
			
			if(livros[i].equals(livro)) {
				livros[i] = null;
			    contLivros--;
			}
				
		}
		
	}
	

	public String getNome() {
		return nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}


	public Livro[] getLivros() {
		return livros;
	}

	
	
}
