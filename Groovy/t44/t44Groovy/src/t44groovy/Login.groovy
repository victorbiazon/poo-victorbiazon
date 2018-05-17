/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t44groovy

/**
 *
 * @author victo
 */
class Login {
    private ArrayList<Usuario> login
    
    def Login(){
        login = new ArrayList<>()
    }
    
    def addUser(Usuario user){
        login.add(user)
    }

    def ArrayList<Usuario> getLogin() {
        login
    }
    
    def buscaLogin(String login) throws Exception{
        boolean x = false
        for(Usuario user : this.login){
            if(user.getUsername().equals(login))
                x = true
        }
        if(x)
            x
        else
            throw new Exception("Usuário inválido");
    }
}

