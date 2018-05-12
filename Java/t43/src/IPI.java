
public class IPI extends Imposto {

	public IPI(String nome,double preco){
		super(nome,preco);
	}
	
	@Override
	public double aliquota() {
		return getPreco() - getPreco()*0.05;		
	}
	
	public void exibir() {
		System.out.println("Nome: " + getNome());
		System.out.println("Preço sem imposto: " + aliquota());
	}
}
