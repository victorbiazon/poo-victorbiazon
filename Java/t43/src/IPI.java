
public class IPI extends Imposto {

	protected IPI(String nome,double preco){
		super(nome,preco);
	}
	
	@Override
	protected double aliquota() {
		return getPreco() - getPreco()*0.05;		
	}
	
	protected void exibir() {
		System.out.println("Nome: " + getNome());
		System.out.println("Preço sem imposto: " + aliquota());
	}
}
