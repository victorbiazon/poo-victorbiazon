import java.sql.SQLException;

public class Teste {

	public static void main(String[] args) throws SQLException {
		//Cliente c = new Cliente("victor");
		//Cliente c1 = new Cliente("joao");
		//ClienteDAO cdao = new ClienteDAO();
		//ProdutoDAO pdao = new ProdutoDAO();
		//VendaDAO vdao = new VendaDAO();
		//vdao.listarUltimaVenda();
		//Produto p = new Produto("ração",3.20,"servico");
		//pdao.dropProduto();
		//pdao.createProduto();
		//cdao.dropCliente();
		//cdao.createCliente();
		//cdao.insert(c);
		//cdao.insert(c1);
		//pdao.insert(p);
		//pdao.listar();
		//cdao.listar();
		//System.out.println(cdao.getTamanho());
		//System.out.println(cdao.validarNome("victor"));
		
		MenuPetShop menu = new MenuPetShop();
		menu.menu();
	}

}
