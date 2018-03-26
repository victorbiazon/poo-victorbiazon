package lojadelivros;

public class Livro {
	FormatoLivro livro;
	
	public Livro(FormatoLivro livro) {
		this.livro = livro;
	}
		
	
	public Double mostrarPreco() {
		if (livro == FormatoLivro.Epub) {
			return 20.0;
		}
		if (livro == FormatoLivro.PDF) {
			return 40.0;
		}	
		if (livro == FormatoLivro.livroFisico) {
			return 80.0;
		}
			return 0.0;
	
	}
	
	
	public String mostrarTipo() {
		if (livro == FormatoLivro.Epub) {
			return "EPUB";
		}
		if (livro == FormatoLivro.PDF) {
			return "PDF";
		}	
		if (livro == FormatoLivro.livroFisico) {
			return "Fisico";
		}
		return null;	
		
	}

}
