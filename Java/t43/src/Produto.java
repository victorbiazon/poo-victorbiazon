
public class Produto {
	
	private String nome;
	private double preco;
	private Imposto imp;
	
	Produto(String nome,double preco,Imposto imp){
		this.nome = nome;
		this.preco = preco;
		this.imp = imp;
	}

	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public Imposto getImp() {
		return imp;
	}
	
	public void exibir() {
		System.out.println("Nome: " + getNome());
		System.out.println("Preço com imposto descontado: " + getPreco()*imp.aliquota());
	}


}
