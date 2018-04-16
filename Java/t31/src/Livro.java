
public class Livro {
	
	private String  nome;
	private String  autor;
	private int  anoPublic;
	
	
	public Livro(String nome, String autor, int anoPublic) {
	
		this.nome = nome;
		this.autor = autor;
		this.anoPublic = anoPublic;
	}
	
	public String getNome() {
		return nome;
	}



	public String getAutor() {
		return autor;
	}



	public int getAnoPublic() {
		return anoPublic;
	}



	@Override
	public String toString() { 
	    return "Nome: "+this.nome+" Autor: "+this.autor+" Ano de Publicação: "+this.anoPublic;
	} 
}
