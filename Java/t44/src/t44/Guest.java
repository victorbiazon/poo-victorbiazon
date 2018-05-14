/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t44;

/**
 *
 * @author victo
 */
public class Guest extends Usuario{

    public Guest(String username) {
        super(username);
    }
    @Override
    public void permissoes(){
        System.out.println("É guest, só pode ficar olhando, não faz nada.");
    }
}
