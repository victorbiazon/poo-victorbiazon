
public class Imposto extends Produto {

	public Imposto(String nome,double preco){
		super(nome,preco);
	}
	
	public double aliquota() {
		return 1.0;
	}
		
}
