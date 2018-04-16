/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t34;
import java.util.ArrayList;

/**
 *
 * @author victo
 */
public class Usuario{
    
    private ArrayList<String> login;

    public Usuario(String login) {
        this.login = new ArrayList<>();
        this.login.add(login);  
    }
    
    public ArrayList<String> getLogin() {
        return login;
    }
    
    public boolean buscaLogin(String login){
        return this.login.contains(login);
    }
    
    public void boasVindas(){
        System.out.println("Bem-vindo "+login+".");
    }
}
