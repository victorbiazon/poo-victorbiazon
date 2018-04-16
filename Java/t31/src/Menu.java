
import java.util.Scanner;

public class Menu {
	
		private Scanner s = new Scanner(System.in);
		private int opcao = 0;
		private Categoria categoriaEnum = null;
		Biblioteca biblioteca = new Biblioteca("Fatec");
		private int categoria = 0;	
		
		public void tela() {
	
		while (opcao != 9) {
			System.out.println("1 - Adicionar Estante");
			System.out.println("2 - Adicionar livro");
			System.out.println("3 - Remover Livro");
			System.out.println("4 - Listar Filosofia");
			System.out.println("8 - Listar Todos os livros");

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
					System.out.println("Digite um valor válido!");
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
				System.out.println("Digite o ano publicação: ");
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
					System.out.println("DIgite um valor válido !");
				}

				Livro livro = new Livro(nomeLivro, nomeAutor, anoPublic);

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;

			case 8:
				biblioteca.listarTudo();
				System.out.println("----------------------------------------");
				break;
			}

		}
	
	}

}
