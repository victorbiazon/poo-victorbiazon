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
				+ "idproduto serial PRIMARY KEY, "
				+ "nome varchar(30), "
				+ "preco numeric ,"
				+ "tipo varchar(7) );";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	
	public void insert(Produto c) throws SQLException {
		String sql = "INSERT INTO Produto (nome,preco,tipo) "
				+ "VALUES (?,?,?);";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, c.getNome());
		ps.setDouble(2, c.getPreco());
		ps.setString(3, c.getServico());
		ps.execute();
		ps.close();
	}
	
	
	 public Produto listarUmProduto(int id) throws SQLException {
		String sql = "SELECT * from Produto WHERE idproduto=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		return new Produto(rs.getInt("idproduto"),
							rs.getString("nome"),
							rs.getDouble("preco"),
							rs.getString("tipo"));
	}
	 
	public void listarPorTipo(String servico) throws SQLException {
		String sql = "SELECT * from Produto WHERE tipo=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, servico);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println("Código: " + rs.getObject("idproduto"));
			System.out.println("Produto: " + rs.getObject("nome"));
			System.out.println("Preço: R$" + String.format("%.2f", rs.getDouble("preco")));
			System.out.println("--------------");
		}
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
	
	public int buscaId(int id) throws SQLException, Exception {
		String sql = "SELECT idproduto from Produto WHERE idproduto=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		boolean retorno = false;
		while(rs.next()) {
			if(rs.getInt("idproduto")==id) {
				retorno = true;
			}else {
				retorno = false;
			}
		}
		ps.close();
		if(retorno)
			return id;
		else
			throw new Exception("Produto não encontrado!");
			
	}
	
	public String validarNome(String nome) throws SQLException, Exception{
		String sql = "SELECT nome from Produto WHERE nome=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, nome);
		ResultSet rs = ps.executeQuery();
		boolean retorno = false;
		while(rs.next()) {
			if(rs.getString("nome").equals(nome))
				retorno = true;
			else
				retorno = false;
		}
		ps.close();
		if(!retorno)
			return nome;
		else
			throw new Exception("Produto já existe");
	}
	
	public String buscaNome(int id) throws SQLException {
		String sql = "SELECT nome from Produto WHERE idproduto=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		String resultado = "";
		while(rs.next()) {
			resultado = rs.getString("nome");
		}
		return resultado;
	}
	
	public double buscaPreco(int id) throws SQLException {
		String sql = "SELECT preco from Produto WHERE idproduto=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		double retorno = 0;
		while(rs.next()) {
			retorno = rs.getDouble("preco");
		}
		return retorno;
	}
	
	
	public void listar() throws SQLException {
		String sql = "SELECT * from Produto;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getObject("idproduto"));
			System.out.println(rs.getObject("nome"));
			System.out.println(rs.getObject("preco"));
			System.out.println(rs.getObject("tipo"));
		}
		ps.close();
	}
	
	 public void deletarProduto(int id) throws SQLException {
		String sql = "DELETE from Produto WHERE idproduto=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ps.execute();
		ps.close();
	}	
	 
	public void alterarNomeProduto(int id, String nome) throws SQLException {
		String sql = "UPDATE Produto SET nome =? WHERE idproduto=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, nome);
		ps.setInt(2, id);
		ps.execute();
		ps.close();
	}
	 
	 public void alterarPrecoProduto(int id, Double preco) throws SQLException {
		 String sql = "UPDATE Produto SET preco =? WHERE idproduto=?;";
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
	