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
class Root extends Usuario{
    
    def Root(String login){
        super(login)
    }
    
    def despedidaRoot(){
        println("Até logo "+super.getLogin())
    }
    
    def descricaoRoot(){
        println("Pode tudo.")
    }
     def excluirTodos(){
         println("Você pode excluir todos os usuários.")
    }
}

