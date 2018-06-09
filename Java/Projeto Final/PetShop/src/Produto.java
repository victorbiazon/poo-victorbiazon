
public class Produto {
	private int id;
	private String nome;
	private double preco;
	private String servico;
	
	public Produto(String nome, double preco, String servico) {
		this.nome = nome;
		this.preco = preco;
		this.servico = servico;
	}
	public Produto(int id, String nome, double preco,String servico) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.servico = servico;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public String getServico() {
		return servico;
	}
}
