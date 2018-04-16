/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t34groovy

/**
 *
 * @author victo
 */
class Guest extends Usuario{
    
    def Guest(String login){
        super(login)
    }
    
    def despedidaGuest(){
        println("Até logo "+super.getLogin())
    }
    
    def descricaoGuest(){
        println("É guest, só pode ficar olhando, não faz nada.")
    }
}

