import java.sql.SQLException;

public class Teste {

	public static void main(String[] args) throws SQLException {
		/*Cliente c = new Cliente("victor");
		Cliente c1 = new Cliente("joao");
		ClienteDAO cdao = new ClienteDAO();
		cdao.dropCliente();
		cdao.createCliente();
		cdao.insert(c);
		cdao.insert(c1);
		cdao.listar();
		System.out.println(cdao.getTamanho());*/
		
		MenuPetShop menu = new MenuPetShop();
		menu.menu();
	}

}
