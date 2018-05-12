
public class Imposto extends Produto {

	protected Imposto(String nome,double preco){
		super(nome,preco);
	}
	
	protected double aliquota() {
		return 1.0;
	}
		
}
