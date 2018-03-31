/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t22

/**
 *
 * @author victo
 */
class Cliente {
	private String nome
	private double limite,saldo
	
	def Cliente(String nome,double saldo,double limite) {
		this.limite = Math.max(0,limite)
		this.saldo = Math.max(0,saldo)
		this.nome = nome
	}
	
	def sacar(double quantia) {
		
		if(this.saldo + this.limite >= quantia) {
			println("Sacar quantia desejada: " + quantia)
			this.saldo -= quantia
		}else
			if(quantia<0)
				println("O valor do saque deve ser positivo.")
		else
			println("A quantia desejada ultrapassa o limite permitido. Nao sera possivel realizar esta operacao enquanto nao houver deposito de dinheiro nesta conta.")
	}
	
	def depositar(double quantia) {
		saldo += quantia
	}
	
	def checarSaldo() {
		if(this.saldo<0) {
			this.limite = this.limite + this.saldo
			this.saldo=0
		}	
		this.saldo + this.limite
	}
	
	def getNome() {
            nome
	}
	def getSaldo() {
            saldo
        }
	def getLimite() {
            limite
	}
	
}

