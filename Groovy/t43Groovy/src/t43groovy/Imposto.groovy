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
class Imposto extends Produto {

	Imposto(String nome,double preco){
		super(nome,preco)
	}
	
	def aliquota() {
		1.0
	}
		
}

