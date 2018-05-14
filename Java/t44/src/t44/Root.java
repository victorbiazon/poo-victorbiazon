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
public class Root extends Usuario{
    
    public Root(String username) {
        super(username);
    }
    @Override
    public void permissoes(){
        System.out.println("Pode tudo.");
    }
    
    @Override
    public void group(){
        System.out.println("Você pode excluir todos os usuários");
    }
}
