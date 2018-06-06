import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoDAO {
	
	private Connection conn;
	
	public ProdutoDAO() throws SQLException {
		conn = ConnectionFactory.getConnection();
	}
	
	public void dropProduto() throws SQLException {
		String sql = "DROP TABLE Produto";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	
	
	public void createCliente() throws SQLException {
		String sql = "CREATE TABLE Produto ( "
				+ "id serial CONSTRAINT key PRIMARY KEY, "
				+ "nome varchar(30), "
				+ "preco numeric );";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	
	public void insert(Produto c) throws SQLException {
		String sql = "INSERT INTO Cliente (nome,preco) "
				+ "VALUES (?,?);";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, c.getNome());
		ps.setDouble(2, c.getPreco());
		ps.execute();
		ps.close();
	}
	
	
	 public Produto listarUmProduto(int id) throws SQLException {
		String sql = "SELECT * from Produto WHERE id=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		return new Produto(rs.getInt("id"),
							rs.getString("nome"),
							rs.getDouble("preco"));
	}	
	
	
	public void listar() throws SQLException {
		String sql = "SELECT * from Produto;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getObject("id"));
			System.out.println(rs.getObject("nome"));
			System.out.println(rs.getObject("preco"));
			ps.close();
		}
	}
	
	 public void deletarProduto(int id) throws SQLException {
		String sql = "DELETE from Produto WHERE id=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ps.execute();
		ps.close();
	}	
	 
	 public void alterarNomeProduto(int id, String nome) throws SQLException {
			String sql = "UPDATE Produto SET nome =? WHERE id=?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, nome);
			ps.setInt(2, id);
			ps.execute();
			ps.close();
	 }
	 
	 public void alterarPrecoProduto(int id, Double preco) throws SQLException {
		 String sql = "UPDATE Produto SET preco =? WHERE id=?;";
		 PreparedStatement ps = conn.prepareStatement(sql);
		 ps.setDouble(1, preco);
		 ps.setInt(2, id);
		 ps.execute();
		 ps.close();
	 }
	 
	 public void fechar() throws SQLException {
		 conn.close();		 
	 }
}		
	