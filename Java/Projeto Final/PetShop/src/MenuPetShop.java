import java.sql.SQLException;
import java.util.Scanner;

public class MenuPetShop {
	private Scanner entrada = new Scanner(System.in);
	private int opcao,idCliente,idProduto,qtdadeVenda;
	private String nomeProduto,nomeCliente;
	private double precoProduto;
	private String servico;
	private ClienteDAO cdao = new ClienteDAO();
	private ProdutoDAO pdao = new ProdutoDAO();
	private VendaDAO vdao = new VendaDAO();
	
	public MenuPetShop() throws SQLException {
		//cdao.dropCliente();
		//cdao.createCliente();
		//pdao.dropProduto();
		//pdao.createProduto();
		//vdao.dropVenda();
		//vdao.createVenda();
	}
	
	public void menu() throws SQLException {
		
		do{
		System.out.println("1- Cadastro Cliente;\n"
				+ "2- Cadastro Produto;\n"
				+ "3- Catálogo de Produtos;\n"
				+ "4- Catálogo de Serviços;\n"
				+ "5- Compra;\n"
				+ "6- Histórico de Venda;\n\n"
				+ "Selecione sua opcao:");
		opcao = entrada.nextInt();
		switch(opcao) {
		case 1:
			do {
				nomeCliente=null;
				System.out.println("Digite o nome do cliente");
				while(entrada.hasNext("\n")){
	                entrada.nextLine();
	            }
				try {
					validarNomeCliente(entrada.nextLine());
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}while(nomeCliente==null);
			cdao.insert(new Cliente(nomeCliente));
			break;
		case 2:
			do {
				servico = null;
				System.out.println("Produto ou Serviço?(P/S): ");
				try {
					validarServico(entrada.next());
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}while(servico==null);
			
			do {
				nomeProduto=null;
				System.out.println("Digite o nome: ");
				try {
					validarNomeProduto(entrada.nextLine());
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}while(nomeProduto==null);
			
			do {
				precoProduto = 0;
				System.out.println("Digite o preço: ");
				try {
					validarPreco(entrada.nextDouble());
				} catch(Exception e){
					System.out.println(e.getMessage());
				}
			}while(precoProduto==0);
			pdao.insert(new Produto(nomeProduto,precoProduto,servico));
			System.out.println("Produto cadastrado com sucesso!");
			break;
		case 3:
			pdao.listarPorTipo("produto");
			break;
		case 4:
			pdao.listarPorTipo("servico");
			break;
		case 5:
			do {
				idCliente=0;
				System.out.println("Digite o código do cliente: ");
				try {
					validarIdCliente(entrada.nextInt());
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}while(idCliente==0);
			
			do {
				idProduto=0;
				System.out.println("Digite o código do produto: ");
				try {
					validarIdProduto(entrada.nextInt());
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}while(idProduto==0);
			
			do {
				qtdadeVenda=0;
				System.out.println("Digite a quantidade: ");
				try {
					validarQtdade(entrada.nextInt());
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}while(qtdadeVenda==0);
			
			vdao.insert(new Venda(idProduto,qtdadeVenda,idCliente,pdao.buscaPreco(idProduto)));
			break;
		case 6:
			vdao.listar();
			break;
		}
		}while(opcao!=6);
		
	}
	
	public void validarServico(String servico) throws Exception{
		if(servico.equals("P")||servico.equals("p")) {
			this.servico = "produto";
		} else if(servico.equals("S")||servico.equals("s")) {
			this.servico = "serviço";
		}else {
			throw new Exception ("Digite uma opção válida!");
		}
	}
	
	public void validarPreco(double preco) throws Exception {
		if(preco>0)
			precoProduto = preco;
		else
			throw new Exception("Digite um valor válido!");
	}
	
	public void validarQtdade(int qtdade) throws Exception {
		if(qtdade>0)
			qtdadeVenda = qtdade;
		else
			throw new Exception("Digite um valor válido!");
	}
	
	public void validarNomeCliente(String nome) throws SQLException, Exception{
		int limite = cdao.getTamanho();
		for(int id=1;id>limite;id++) {
			if(cdao.buscaNome(id).equals(nome))
				throw new Exception("Cliente já existe!");
		}
		nomeCliente = nome;
	}
	
	public void validarNomeProduto(String nome) throws SQLException, Exception{
		int limite = pdao.getTamanho();
		for(int id=1;id>limite;id++) {
			if(pdao.buscaNome(id).equals(nome))
				throw new Exception("Produto já existe!");
		}
		nomeProduto = nome;
	}
	
	public void validarIdCliente(int idCliente) throws SQLException, Exception {
		if(cdao.buscaId(idCliente)) {
			this.idCliente = idCliente;
		}else {
			throw new Exception("Código do cliente ou produto inválido, tente novamente");
		}
	}
		
	public void validarIdProduto(int idProduto) throws SQLException, Exception{
		if(cdao.buscaId(idProduto)) {
			this.idProduto = idProduto;
		}else {
			throw new Exception("Código do cliente ou produto inválido, tente novamente");
		}
	}
	
}
