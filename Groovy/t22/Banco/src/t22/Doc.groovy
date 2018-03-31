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
public class Doc {

	def transferir(Cliente c1,Cliente c2,double quantia) {		
		c1.sacar(quantia)												//Saca de uma conta
		c2.depositar(quantia)											//e deposita em outra

	}
}

