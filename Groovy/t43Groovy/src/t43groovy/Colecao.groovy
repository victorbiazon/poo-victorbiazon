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
class Colecao {

	private ArrayList<Produto> prod

	Colecao(){
		this.prod = new ArrayList<Produto>()
	}
	
	def adicionar(Produto p) {
		prod.add(p)
	}
	
	def infoProduto() {
		for(Produto p: prod) {
			if(p instanceof ICMS)
				((ICMS) p).exibir()
			else
				((IPI) p).exibir()		
		}
	}
}

