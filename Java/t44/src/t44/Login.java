/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t44;

import java.util.ArrayList;

/**
 *
 * @author victo
 */
public class Login {
    private ArrayList<Usuario> login; 
    
    public Login(){
        login = new ArrayList<>();
    }
    
    public void addUser(Usuario user){
        login.add(user);
    }

    public ArrayList<Usuario> getLogin() {
        return login;
    }
    
    public boolean buscaLogin(String login) throws Exception{
        boolean x = false;
        for(Usuario user : this.login){
            if(user.getUsername().equals(login))
                x = true;
        }
        if(x)
            return x;
        else
            throw new Exception("Usuário inválido");
    }
}
