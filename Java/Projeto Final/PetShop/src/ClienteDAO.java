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
				+ "nome varchar(30), "
				+ "login varchar(30), "
				+ "senha varchar(30), "
				+ "tipousuario varchar(3) );";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		ps.close();
	}
	
	public void insert(Cliente c) throws SQLException {
		String sql = "INSERT INTO Cliente (nome,login,senha,tipousuario) "
				+ "VALUES (?,?,?,?);";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, c.getNome());
		ps.setString(2, c.getLogin());
		ps.setString(3, c.getSenha());
		ps.setString(4, c.getTipoUsuario());
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
	
	public String buscaTipoUsuario(String login) throws SQLException {
		String sql = "SELECT tipousuario from Cliente WHERE login=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, login);
		ResultSet rs = ps.executeQuery();
		String retorno="";
		while(rs.next()){
			retorno = rs.getString("tipousuario");
		}
		ps.close();
		return retorno;
	}
	
	public boolean login(String login, String senha) throws SQLException, Exception{
		String sql = "SELECT * from Cliente WHERE login=? AND senha=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, login);
		ps.setString(2, senha);
		ResultSet rs = ps.executeQuery();
		boolean retorno = false;
		while(rs.next()) {
			if(rs.getString("login").equals(login)&&rs.getString("senha").equals(senha))
				retorno = true;
			else
				retorno = false;
		}
		ps.close();
		if(retorno)
			return retorno;
		else
			throw new Exception("Usuário ou senha incorretos");
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
	
	public String validarLogin(String login) throws SQLException, Exception{
		String sql = "SELECT login from Cliente WHERE login=?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, login);
		ResultSet rs = ps.executeQuery();
		boolean retorno = false;
		while(rs.next()) {
			if(rs.getString("login").equals(login))
				retorno = true;
			else
				retorno = false;
		}
		ps.close();
		if(!retorno)
			return login;
		else
			throw new Exception("Username já está em uso");
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
