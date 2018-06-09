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
				+ "id serial CONSTRAINT key PRIMARY KEY, "
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
		String sql = "SELECT * from Venda WHERE id=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		return new Venda(rs.getInt("id"),
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
	
	public void listar() throws SQLException {
		String sql = "SELECT * from Venda;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getObject("id"));
			System.out.println(rs.getObject("idProduto"));
			System.out.println(rs.getObject("qtdade"));
			System.out.println(rs.getObject("idCliente"));
			System.out.println(rs.getObject("precoVenda"));
		}
	}
	
	public void fechar() throws SQLException {
		conn.close();
	}

}
