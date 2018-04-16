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
public class Regular extends Usuario{

    public Regular(String login) {
        super(login);
    }
    
    public void despedidaRegular(){
        System.out.println("Até logo "+super.getLogin());
    }
    public void descricaoRegular(){
        System.out.println("Pode consultar suas informações.");
    }
    public void dashboard(){
        System.out.println("Usuario: "+super.getLogin());
        System.out.println("Tipo: Regular");
        System.out.print("Permissoes: ");
        this.descricaoRegular();
    }
}
