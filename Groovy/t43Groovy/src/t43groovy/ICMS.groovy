/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t43groovy

/**
 *
 * @author victo
 */
class ICMS extends Imposto {
		
	ICMS(String nome,double preco){
		super(nome,preco)
	}
	
	def aliquota() {
		return getPreco() - getPreco()*0.10
	}
	
	def exibir() {
		System.out.println("Nome: " + getNome())
		System.out.println("Preço sem imposto: " + aliquota())
	}	
}

