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
public class Usuario{
    
    private String username;
    
    public Usuario(String username) {
        this.username=username;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void boasVindas(){
        System.out.println("Bem-vindo "+username+".");
    }
    public void despedida(){
        System.out.println("Até logo "+username);
    }
    public void permissoes(){
        System.out.println("Permissões padrão");
    }
    public void group(){
        System.out.println("Grupo padrão");
    }
}
