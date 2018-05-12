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
class Produto {
	
	private String nome
	private double preco
	
	Produto(String nome,double preco){
		this.nome = nome
		this.preco = preco
	}

	def getNome() {
		nome
	}
	
	def getPreco() {
		preco
	}

}

