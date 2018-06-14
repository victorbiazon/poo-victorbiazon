
public class Cliente {
	private int id;
	private String nome,login,senha,tipoUsuario;
	
	public Cliente(String nome, String login, String senha, String tipoUsuario) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.tipoUsuario = tipoUsuario;
	}
	
	public Cliente(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
}
