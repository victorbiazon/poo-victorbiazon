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
class Group extends Usuario{
    
    def Group(String login){
        super(login)
    }
    
    def despedidaGroup(){
        println("Até logo "+super.getLogin())
    }
    
    def descricaoGroup(){
        println("Pode participar de grupos.")
    }
    
    def groupBoard(){
        println("Você pode apagar usuários deste grupo.")
    }
}

