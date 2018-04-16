/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t34;

/**
 *
 * @author victo
 */
public class Root extends Usuario{
    
    public Root(String login) {
        super(login);
    }
    
    public void despedidaRoot(){
        System.out.println("Até logo "+super.getLogin());
    }
    public void descricaoRoot(){
        System.out.println("Pode tudo.");
    }
    
    public void excluirTodos(){
        System.out.println("Você pode excluir todos os usuários");
    }
}
