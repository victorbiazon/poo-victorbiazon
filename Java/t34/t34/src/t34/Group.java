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
public class Group extends Usuario{

    public Group(String login) {
        super(login);
    }
    
    public void despedidaGroup(){
        System.out.println("Até logo "+super.getLogin());
    }
    public void descricaoGroup(){
        System.out.println("Pode participar de grupos.");
    }
    public void groupBoard(){
        System.out.println("Você pode apagar usuários deste grupo");
    }
}
