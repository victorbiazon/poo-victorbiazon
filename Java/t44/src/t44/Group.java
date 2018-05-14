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
public class Group extends Usuario{

    public Group(String username) {
        super(username);
    }
    @Override
    public void permissoes(){
        System.out.println("Pode participar de grupos.");
    }
    @Override
    public void group(){
        System.out.println("Você pode apagar usuários deste grupo");
    }
}
