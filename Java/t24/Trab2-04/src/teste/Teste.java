package teste;

import lojadelivros.FormatoLivro;
import lojadelivros.Livraria;
import lojadelivros.Livro;

public class Teste {

	public static void main(String[] args) {
		/*Livraria l = new Livraria(100);
		Livro livro =  new Livro(FormatoLivro.Epub);
		l.venderLivro(2);
		l.venderLivro(3);
		l.venderLivro(8);
		System.out.println("Formato do livro: " + livro.mostrarTipo());
		System.out.println("Preço: " + livro.mostrarPreco());
		System.out.println("Disponivel em estoque: " + l.estoque());*/	
		
		/*Livraria l = new Livraria(80);
		Livro livro =  new Livro(FormatoLivro.PDF);
		l.venderLivro(3);
		l.venderLivro(7);
		System.out.println("Formato do livro: " + livro.mostrarTipo());
		System.out.println("Preço: " + livro.mostrarPreco());
		System.out.println("Disponivel em estoque: " + l.estoque());*/
		
		Livraria l = new Livraria(115);
		Livro livro =  new Livro(FormatoLivro.livroFisico);
		l.venderLivro(2);
		System.out.println("Formato do livro: " + livro.mostrarTipo());
		System.out.println("Preço: " + livro.mostrarPreco());
		System.out.println("Disponivel em estoque: " + l.estoque());
	
	
	}
	

}