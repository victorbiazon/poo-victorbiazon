import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VendaDAO {
	
	private Connection conn;
	
	public VendaDAO() throws SQLException {
		conn = ConnectionFactory.getConnection();
	}
	
	public void dropVenda() throws SQLException {
		String sql = "DROP TABLE Venda";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	
	public void createVenda() throws SQLException {
		String sql = "CREATE TABLE Venda ( "
				+ "idvenda serial PRIMARY KEY, "
				+ "idProduto numeric, "
				+ "qtdade numeric, "
				+ "idCliente numeric, "
				+ "precoVenda numeric );";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	
	public void insert(Venda v) throws SQLException {
		String sql = "INSERT INTO Venda (idProduto,qtdade,idCliente,precoVenda) "
				+ "VALUES (?,?,?,?);";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, v.getIdProduto());
		ps.setInt(2, v.getQtdade());
		ps.setInt(3, v.getIdCliente());
		ps.setDouble(4, v.getPrecoVenda());
		ps.execute();
		ps.close();
	}
	
	public Venda listarUmaVenda(int id) throws SQLException {
		String sql = "SELECT * from Venda WHERE idvenda=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		return new Venda(rs.getInt("idvenda"),
				rs.getInt("idProduto"),
				rs.getInt("qtdade"),
				rs.getInt("idCliente"),
				rs.getDouble("precoVenda"));
	}
	
	public int getTamanho() throws SQLException {
		String sql = "SELECT count(*) FROM Venda;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		int retorno = 0;
		while(rs.next()) {
			retorno = rs.getInt("COUNT");
		}
		return retorno;
	}
	
	public Venda listarUltimaVenda() throws SQLException {
		String sql = "SELECT * from Venda;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		Venda v=null;
		while(rs.next()) {
			if(rs.isLast()) {
				v = new Venda(rs.getInt("idvenda"),
						rs.getInt("idProduto"),
						rs.getInt("qtdade"),
						rs.getInt("idCliente"),
						rs.getDouble("precoVenda"));
			}
		}
		return v;
	}
	
	public void listar() throws SQLException {
		String sql = "SELECT * from Venda;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		ProdutoDAO pdao = new ProdutoDAO();
		ClienteDAO cdao = new ClienteDAO();
		while(rs.next()) {
			System.out.println("Venda: " + rs.getObject("idvenda"));
			System.out.println("Cliente: " + cdao.buscaNome(rs.getInt("idCliente")));
			System.out.println("Produto: " + pdao.buscaNome(rs.getInt("idProduto")));
			System.out.println("Preço: R$" + String.format("%.2f", rs.getDouble("precoVenda")));
			System.out.println("Quantidade: " + rs.getObject("qtdade"));
			System.out.println("Valor total: R$ " + String.format("%.2f", rs.getInt("qtdade")*rs.getDouble("precoVenda")));
			System.out.println("--------------------");
		}
	}
	
	public void fechar() throws SQLException {
		conn.close();
	}

}
