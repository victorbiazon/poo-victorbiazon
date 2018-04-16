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
public class Guest extends Usuario{

    public Guest(String login) {
        super(login);
    }
    
    public void despedidaGuest(){
        System.out.println("Até logo "+super.getLogin());
    }
    public void descricaoGuest(){
        System.out.println("É guest, só pode ficar olhando, não faz nada.");
    }
}
