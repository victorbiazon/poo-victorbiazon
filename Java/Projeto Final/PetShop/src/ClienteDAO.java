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
				+ "idcliente serial PRIMARY KEY, "
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
	
	
	 public void listarUmCliente(int id) throws SQLException {
		String sql = "SELECT * from Cliente WHERE idcliente=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println("Código: " + rs.getInt("idcliente"));
			System.out.println("Nome: " + rs.getString("nome"));
		}
	}	
	 
	public String buscaNome(int id) throws SQLException {
		String sql = "SELECT nome from Cliente WHERE idcliente=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		String retorno="";
		while(rs.next()){
			retorno = rs.getString("nome");
		}
		ps.close();
		return retorno;
	}
	
	public String validarNome(String nome) throws SQLException, Exception{
		String sql = "SELECT nome from Cliente WHERE nome=?;";
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
			throw new Exception("Usuário já existe");
	}
	
	public int buscaId(int id) throws SQLException, Exception {
		String sql = "SELECT idcliente from Cliente WHERE idcliente=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		boolean retorno = false;
		while(rs.next()) {
			if(rs.getInt("idcliente")==id) {
				retorno = true;
			}else {
				retorno = false;
			}
		}
		ps.close();
		if(retorno)
			return id;
		else
			throw new Exception("Cliente não encontrado!");
			
	}
	
	public int buscaNomeId(String nome) throws SQLException, Exception {
		String sql = "SELECT * from Cliente WHERE nome=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, nome);
		ResultSet rs = ps.executeQuery();
		int retorno = 0;
		boolean valido = false;
		while(rs.next()) {
			if(rs.getString("nome").equals(nome)) {
				valido = true;
				retorno = rs.getInt("idcliente");
			}
		}
		ps.close();
		if(valido)
			return retorno;
		else
			throw new Exception("Cliente não encontrado!");
			
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
			System.out.println("Código: " + rs.getObject("idcliente"));
			System.out.println("Nome: " + rs.getObject("nome"));
			System.out.println("--------------");
		}
		ps.close();
	}
	
	 public void deletarCliente(int id) throws SQLException {
		String sql = "DELETE from Cliente WHERE idcliente=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ps.execute();
		ps.close();
	}	
	 
	public void alterarNomeCliente(int id, String nome) throws SQLException {
		String sql = "UPDATE Cliente SET nome =? WHERE idcliente=?;";
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
