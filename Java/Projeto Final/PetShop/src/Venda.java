
public class Venda {
	private int id;
	private int idProduto;
	private int qtdade;
	private int idCliente;
	private double precoVenda;
	
	public Venda(int id, int idProduto, int qtdade, int idCliente, double precoVenda) {
		this.id = id;
		this.idProduto = idProduto;
		this.qtdade = qtdade;
		this.idCliente = idCliente;
		this.precoVenda = precoVenda;
	}

	public int getId() {
		return id;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public int getQtdade() {
		return qtdade;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}
}
