
public class ICMS extends Imposto {
		
	protected ICMS(String nome,double preco){
		super(nome,preco);
	}
	
	@Override
	protected double aliquota() {
		return getPreco() - getPreco()*0.10;
	}
	
	protected void exibir() {
		System.out.println("Nome: " + getNome());
		System.out.println("Preço sem imposto: " + aliquota());
	}	
}
