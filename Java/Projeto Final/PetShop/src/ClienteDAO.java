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
		String sql = "CREATE TABLE CLiente ( "
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
	
	
	public void listar() throws SQLException {
		String sql = "SELECT * from Cliente;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery(); //sempre que for select "executeQuery"
		while(rs.next()) {
			System.out.println(rs.getObject("id"));
			System.out.println(rs.getObject("nome"));
			System.out.println(rs.getObject("sobrenome"));
			ps.close();
		}
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
