/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t34groovy
import java.util.ArrayList

/**
 *
 * @author victo
 */
class Usuario {
	
    private ArrayList<String> login
        
    def Usuario(String login){
        this.login = new ArrayList<>()
        this.login.add(login)
    }
    
    def getLogin(){
        login
    }
    
    def buscaLogin(String login){
        this.login.contains(login)
    }
    
    def boasVindas(){
        println("Bem-vindo"+login+".")
    }
}

