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
	
	
	public void createProduto() throws SQLException {
		String sql = "CREATE TABLE Produto ( "
				+ "id serial CONSTRAINT key PRIMARY KEY, "
				+ "nome varchar(30), "
				+ "preco numeric ,"
				+ "tipo varchar(7) );";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	
	public void insert(Produto c) throws SQLException {
		String sql = "INSERT INTO Cliente (nome,preco,servico) "
				+ "VALUES (?,?,?);";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, c.getNome());
		ps.setDouble(2, c.getPreco());
		ps.setString(3, c.getServico());
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
							rs.getDouble("preco"),
							rs.getString("tipo"));
	}
	 
	public Produto listarPorTipo(String servico) throws SQLException {
		String sql = "SELECT * from Produto WHERE tipo=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, servico);
		ResultSet rs = ps.executeQuery();
		return new Produto(rs.getInt("id"),
							rs.getString("nome"),
							rs.getDouble("preco"),
							rs.getString("tipo"));
	}
	
	public int getTamanho() throws SQLException {
		String sql = "SELECT count(*) FROM Produto;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		int retorno = 0;
		while(rs.next()) {
			retorno = rs.getInt("COUNT");
		}
		return retorno;
	}
	
	public boolean buscaId(int id) throws SQLException {
		String sql = "SELECT id from Produto WHERE id=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		if(rs.getInt("id")==id) {
			return true;
		}else {
			return false;
		}
	}
	
	public String buscaNome(int id) throws SQLException {
		String sql = "SELECT nome from Produto WHERE id=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		return rs.getString("nome");
	}
	
	public double buscaPreco(int id) throws SQLException {
		String sql = "SELECT preco from Produto WHERE id=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		return rs.getDouble("preco");
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
	