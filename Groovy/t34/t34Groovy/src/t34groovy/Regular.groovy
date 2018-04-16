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
class Regular extends Usuario{
    
    def Regular(String login){
        super(login)
    }
    
    def despedidaRegular(){
        println("Até logo "+super.getLogin())
    }
    
    def descricaoRegular(){
        println("Pode consultar suas informações.")
    }
    
    def dashboard(){
        println("Usuario: "+super.getLogin())
        println("Tipo: Regular")
        println("Permissões: ")
        this.descricaoRegular()
    }
}

