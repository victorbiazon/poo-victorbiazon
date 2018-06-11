import java.sql.SQLException;
import java.util.Scanner;

public class MenuPetShop {
	private Scanner entrada;
	private int opcao,opcao1,opcao2,opcao3,idCliente,idProduto,qtdadeVenda;
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
		entrada = new Scanner(System.in);
	}
	
	public void menu() throws SQLException{
		do {
			System.out.println("1- Área do Cliente;\n"
					+ "2- Área do Vendedor;\n"
					+ "3- Administração;\n"
					+ "9- Finalizar Sistema;\n\n"
					+ "Selecione sua opção:");
			opcao = entrada.nextInt();
			switch(opcao) {
			case 1:
				do {
					System.out.println("Área do Cliente:\n\n"
							+ "1- Catálogo de Produtos;\n"
							+ "2- Catálogo de Serviços;\n"
							+ "9- Menu Principal;\n\n"
							+ "Selecione sua opção:");
					
					opcao1 = entrada.nextInt();
					switch(opcao1) {
					case 1:
						pdao.listarPorTipo("produto");
						break;
					case 2:
						pdao.listarPorTipo("serviço");
						break;
					case 9:
						//Menu Principal
						break;
					default:
						System.out.println("Digite uma opção válida");
						break;
					}
				}while(opcao1!=9);
				break;
			case 2:
				do {
					System.out.println("Área do Vendedor:\n\n"
							+ "1- Cadastro de Cliente;\n"
							+ "2- Consultar Cliente;\n"
							+ "3- Listar Clientes;\n"
							+ "4- Cadastro de Produto/Serviço;\n"
							+ "5- Venda;\n"
							+ "9- Menu Principal;\n\n"
							+ "Selecione sua opção:");
					opcao2 = entrada.nextInt();
					switch(opcao2) {
					case 1:
						do {
							nomeCliente=null;
							entrada.nextLine();
							System.out.println("Digite o nome do cliente:");
							try {
								nomeCliente = cdao.validarNome(entrada.next());
							}catch(Exception e) {
								System.out.println(e.getMessage());
							}
						}while(nomeCliente==null);
						cdao.insert(new Cliente(nomeCliente));
						System.out.println("Cliente cadastrado com sucesso!");
						break;
					case 2:
						do {
							idCliente = 0;
							System.out.println("Digite o nome do cliente:");
							try {
								idCliente = cdao.buscaNomeId(entrada.next());
							}catch(Exception e) {
								System.out.println(e.getMessage());
							}
						}while(idCliente==0);
						cdao.listarUmCliente(idCliente);
						break;
					case 3:
						cdao.listar();
						break;
					case 4:
						do {
							servico = null;
							entrada.nextLine();
							System.out.println("Produto ou Serviço?(P/S): ");
							try {
								validarServico(entrada.next());
							}catch(Exception e) {
								System.out.println(e.getMessage());
							}
						}while(servico==null);
						
						do {
							nomeProduto=null;
							entrada.nextLine();
							System.out.println("Digite o nome: ");
							try {
								nomeProduto = pdao.validarNome(entrada.nextLine());
							}catch(Exception e) {
								System.out.println(e.getMessage());
							}
						}while(nomeProduto==null);
						
						do {
							precoProduto = 0;
							System.out.println("Digite o preço: ");
							try {
								precoProduto = validarPreco(entrada.nextDouble());
							} catch(Exception e){
								System.out.println(e.getMessage());
							}
						}while(precoProduto==0);
						pdao.insert(new Produto(nomeProduto,precoProduto,servico));
						System.out.println("Produto cadastrado com sucesso!");
						break;
					case 5:
						do {
							idCliente=0;
							System.out.println("Digite o código do cliente: ");
							try {
								idCliente = cdao.buscaId(entrada.nextInt());
							}catch(Exception e) {
								System.out.println(e.getMessage());
							}
						}while(idCliente==0);
						
						do {
							idProduto=0;
							System.out.println("Digite o código do produto: ");
							try {
								idProduto = pdao.buscaId(entrada.nextInt());
							}catch(Exception e) {
								System.out.println(e.getMessage());
							}
						}while(idProduto==0);
						
						do {
							qtdadeVenda=0;
							System.out.println("Digite a quantidade: ");
							try {
								qtdadeVenda = validarQtdade(entrada.nextInt());
							}catch(Exception e) {
								System.out.println(e.getMessage());
							}
						}while(qtdadeVenda==0);
						vdao.insert(new Venda(idProduto,qtdadeVenda,idCliente,pdao.buscaPreco(idProduto)));
						System.out.println("Venda concluída!\n");
						Venda v = vdao.listarUltimaVenda();
						System.out.println("Venda: " + v.getId()
										+ "\nCliente: " + cdao.buscaNome(v.getIdCliente())
										+ "\nProduto: " + pdao.buscaNome(v.getIdProduto())
										+ "\nQuantidade: " + v.getQtdade()
										+ "\nValor total: R$" + String.format("%.2f", v.getQtdade()*v.getPrecoVenda())
										+ "\n");
						break;
					case 9:
						//Menu Principal
						break;
					default:
						break;
					}
				}while(opcao2!=9);
				break;
			case 3:
				do {
					System.out.println("Administração\n\n"
							+ "1- Relatório de Vendas;\n"
							+ "2- Excluir Cliente;\n"
							+ "3- Excluir Produto;\n"
							+ "4- Alterar Preço Produto;\n"
							+ "9- Menu Principal;\n\n"
							+ "Selecione sua opção:");
					opcao3 = entrada.nextInt();
					switch(opcao3) {
					case 1:
						vdao.listar();
						break;
					case 2:
						do {
							idCliente = 0;
							System.out.println("Digite o código do cliente:");
							try {
								idCliente = cdao.buscaId(entrada.nextInt());
							}catch(Exception e) {
								System.out.println(e.getMessage());
							}
						}while(idCliente==0);
						cdao.deletarCliente(idCliente);
						System.out.println("Cliente deletado com sucesso");
						break;
					case 3:
						do {
							idProduto = 0;
							System.out.println("Digite o código do produto:");
							try {
								idProduto = pdao.buscaId(entrada.nextInt());
							}catch(Exception e) {
								System.out.println(e.getMessage());
							}
						}while(idProduto==0);
						pdao.deletarProduto(idProduto);
						System.out.println("Produto deletado com sucesso");
						break;
					case 4:
						do {
							idProduto = 0;
							System.out.println("Digite o código do produto:");
							try {
								idProduto = pdao.buscaId(entrada.nextInt());
							}catch(Exception e) {
								System.out.println(e.getMessage());
							}
						}while(idProduto==0);
						do {
							precoProduto = 0;
							System.out.println("O preço atual é "
									+ pdao.buscaPreco(idProduto)
									+ ", digite o novo preço:");
							try {
								precoProduto = validarPreco(entrada.nextDouble());
							} catch(Exception e){
								System.out.println(e.getMessage());
							}
						}while(precoProduto==0);
						pdao.alterarPrecoProduto(idProduto, precoProduto);
						System.out.println("Preço alterado com sucesso!");
						break;
					case 9:
						//Menu Principal
						break;
					default:
						System.out.println("Digite uma opção válida!");
						break;
					}
				}while(opcao3!=9);
				break;
			case 9:
				break;
			default:
				System.out.println("Digite um valor válido!");
			}
		}while(opcao!=9);	
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
	
	public double validarPreco(double preco) throws Exception {
		if(preco>0)
			return preco;
		else
			throw new Exception("Digite um valor válido!");
	}
	
	public int validarQtdade(int qtdade) throws Exception {
		if(qtdade>0)
			return qtdade;
		else
			throw new Exception("Digite um valor válido!");
	}
}
