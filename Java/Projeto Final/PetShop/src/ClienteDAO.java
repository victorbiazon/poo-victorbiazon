import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO {
	
	private Connection conn;
	
	public ClienteDAO() throws SQLException {
		conn = ConnectionFactory.getConnection();
	}
	
	public void dropCliente() throws SQLException {
		String sql = "DROP TABLE Cliente";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	
	
	public void createCliente() throws SQLException {
		String sql = "CREATE TABLE Cliente ( "
				+ "id serial CONSTRAINT key PRIMARY KEY, "
				+ "nome varchar(30) );";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	
	public void insert(Cliente c) throws SQLException {
		String sql = "INSERT INTO Cliente (nome) "
				+ "VALUES (?);";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, c.getNome());
		ps.execute();
		ps.close();
	}
	
	
	 public Cliente listarUmCliente(int id) throws SQLException {
		String sql = "SELECT * from Cliente WHERE id=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		return new Cliente(rs.getInt("id"),
							rs.getString("nome"));
	}	
	 
	public String buscaNome(int id) throws SQLException {
		String sql = "SELECT nome from Cliente WHERE id=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		return rs.getString("nome");
	}
	
	public boolean buscaId(int id) throws SQLException {
		String sql = "SELECT id from Cliente WHERE id=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		if(rs.getInt("id")==id) {
			return true;
		}else {
			return false;
		}
	}
	
	public int getTamanho() throws SQLException {
		String sql = "SELECT count(*) FROM Cliente;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		int retorno = 0;
		while(rs.next()) {
			retorno = rs.getInt("COUNT");
		}
		return retorno;
	}
	
	
	public void listar() throws SQLException {
		String sql = "SELECT * from Cliente;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery(); //sempre que for select "executeQuery"
		while(rs.next()) {
			System.out.println(rs.getObject("id"));
			System.out.println(rs.getObject("nome"));
		}
		ps.close();
	}
	
	 public void deletarCliente(int id) throws SQLException {
		String sql = "DELETE from Cliente WHERE id=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ps.execute();
		ps.close();
	}	
	 
	 public void alterarNomeCliente(int id, String nome) throws SQLException {
			String sql = "UPDATE Cliente SET nome =? WHERE id=?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, nome);
			ps.setInt(2, id);
			ps.execute();
			ps.close();
		}	
	 
	 public void fechar() throws SQLException {
		 conn.close();		 
	 }
		
	
}
