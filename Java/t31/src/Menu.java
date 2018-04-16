
import java.util.Scanner;

public class Menu {
	
		private Scanner s = new Scanner(System.in);
		private int opcao = 0;
		private Categoria categoriaEnum = null;
		Biblioteca biblioteca = new Biblioteca("Fatec");
		private int categoria = 0;
		
		public void tela() {
	
		while (opcao != 12) {
			System.out.println("----BIBLIOTECA FATEC----");
			System.out.println("Digite a op��o desejada: ");
			System.out.println("1 - Adicionar Estante");
			System.out.println("2 - Adicionar livro");
			System.out.println("3 - Remover Livro");
			System.out.println("4 - Listar Filosofia");
			System.out.println("5 - Listar Literatura");
			System.out.println("6 - Listar quantidade de livros de Ci�ncia");
			System.out.println("7 - Listar Autor por categoria");
			System.out.println("8 - Listar todos os Autores");
			System.out.println("9 - Listar Todos os livros");
			System.out.println("10 - Encerrar Sistema...");

			opcao = s.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome da estante: ");
				String nomeEstante = s.next();

				System.out.println("Digite a categoria: 1 - Ciencia, 2 - Filosofia, 3 Literatura. ");
				

				while (categoria != 1 && categoria != 2 && categoria != 3) {
					categoria = s.nextInt();

				}
				switch (categoria) {
				case 1:
					categoriaEnum = Categoria.CIENCIA;
					break;
				case 2:
					categoriaEnum = Categoria.FILOSOFIA;
					break;
				case 3:
					categoriaEnum = Categoria.LITERATURA;
					break;

				default:
					System.out.println("Digite um valor v�lido!");
				}

				System.out.println("Digite o tamanho da estante(quantidade de livros): ");
				int qtLivros = s.nextInt();

				Estante estante = new Estante(nomeEstante, categoriaEnum, qtLivros);
				biblioteca.inserirEstante(estante);
				categoria = 0;
				System.out.println("Estante adicionada com sucesso!");

				break;
				
			case 2:
				System.out.println("Digite o nome do livro: ");
				String nomeLivro = s.next();
				System.out.println("Digite o autor: ");
				String nomeAutor = s.next();
				System.out.println("Digite o ano publica��o: ");
				int anoPublic = s.nextInt();
				System.out.println("Digite a categoria: ");
				
				while (categoria != 1 && categoria != 2 && categoria != 3) {
					categoria = s.nextInt();
				}
				
				switch (categoria) {
				case 1:
					categoriaEnum = Categoria.CIENCIA;
					break;
				case 2:
					categoriaEnum = Categoria.FILOSOFIA;
					break;
				case 3:
					categoriaEnum = Categoria.LITERATURA;
					break;

				default:
					System.out.println("DIgite um valor v�lido!");
				}
				
				/*Livro livro = new Livro(nomeLivro, nomeAutor, anoPublic);
				estante.inserirLivro(livro);
				categoria = 0;
				System.out.println("Estante adicionada com sucesso!");*/
				

				break;
				
			case 3:
				
				break;
			case 4:
				System.out.println("Os livros de filosofia dispon�veis s�o: ");
				System.out.println(biblioteca.listarFilosofia());
										
				break;
			case 5:
				System.out.println("Os livros de literatura dispon�veis s�o: ");
				System.out.println(biblioteca.listarLiteratura());
				
				break;
			case 6:

				break;
			case 7:
				System.out.println("Digite a categoria: ");
				
				while (categoria != 1 && categoria != 2 && categoria != 3) {
					categoria = s.nextInt();
				}
				
				switch (categoria) {
				case 1:
					categoriaEnum = Categoria.CIENCIA;
					break;
				case 2:
					categoriaEnum = Categoria.FILOSOFIA;
					break;
				case 3:
					categoriaEnum = Categoria.LITERATURA;
					break;

				default:
					System.out.println("DIgite um valor v�lido!");
				}
				
				System.out.println(biblioteca.listarAutores(categoriaEnum));
				
				break;

			case 8:
				System.out.println("Os Autores dispon�veis s�o: ");
				System.out.println(biblioteca.listarTodosAutores());
				
				break;
				
			case 9:
				System.out.println("Livros dispon�veis: ");
				biblioteca.listarTudo();
				System.out.println("-----------------------------");
				break;
				
			case 10:
				this.encerrarsistema();
				break;
			}

		}
	
	}
		
		public void encerrarsistema() {
			System.out.println("Sistema Finalizado!!\n");
					
		}

}
