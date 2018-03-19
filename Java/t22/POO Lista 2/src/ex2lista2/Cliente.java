package ex2lista2;

public class Cliente {
	private String nome;
	private double limite,saldo;
	
	public Cliente(String nome,double saldo,double limite) {
		this.limite = Math.max(0,limite);
		this.saldo = Math.max(0,saldo);
		this.nome = nome;
	}
	
	public void sacar(double quantia) {
		
		if(this.saldo + this.limite >= quantia) {
			System.out.println("Sacar quantia desejada: " + quantia);
			this.saldo -= quantia;
		}else
			if(quantia<0)
				System.out.println("O valor do saque deve ser positivo.");
		else
			System.out.println("A quantia desejada ultrapassa o limite permitido. Nao sera possivel realizar esta operacao enquanto nao houver deposito de dinheiro nesta conta.");
	}
	
	public void depositar(double quantia) {
		saldo += quantia;
	}
	
	public double checarSaldo() {
		if(this.saldo<0) {
			this.limite = this.limite + this.saldo;
			this.saldo=0;
		}	
		return this.saldo + this.limite;
	}
	
	public String getNome() {
		return nome;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public double getLimite() {
		return this.limite;
	}
	
}
