import groovy.transform.ToString

class Livro {
	
	private String  nome
	private String  autor
	private int  anoPublic
	
	
	def Livro(String nome, String autor, int anoPublic) {
	
		this.nome = nome
		this.autor = autor
		this.anoPublic = anoPublic
	}
	
	def getNome() {
		nome
	}



	def getAutor() {
		autor
	}



	def getAnoPublic() {
		anoPublic
	}



	
	String toString() { 
	    return "Nome: "+this.nome+" Autor: "+this.autor+" Ano de Publicação: "+this.anoPublic
	} 
}
