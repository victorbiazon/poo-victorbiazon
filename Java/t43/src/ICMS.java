
public class ICMS extends Imposto {
		
	public ICMS(String nome,double preco){
		super(nome,preco);
	}
	
	@Override
	public double aliquota() {
		return getPreco() - getPreco()*0.10;
	}
	
	public void exibir() {
		System.out.println("Nome: " + getNome());
		System.out.println("Preço sem imposto: " + aliquota());
	}	
}
