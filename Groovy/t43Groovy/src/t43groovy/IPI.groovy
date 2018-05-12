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
class IPI extends Imposto {

	IPI(String nome,double preco){
		super(nome,preco)
	}
	
	def aliquota() {
		return getPreco() - getPreco()*0.05	
	}
	
	def exibir() {
		println ("Nome: " + getNome())
		println ("Preço sem imposto: " + aliquota())
	}
}

