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
class Usuario {
    private String username
    
    def Usuario(String username) {
        this.username=username
    }
    
    def getUsername() {
        username
    }
    
    def boasVindas(){
        System.out.println("Bem-vindo "+username+".")
    }
    def despedida(){
        System.out.println("Até logo "+username)
    }
    def permissoes(){
        System.out.println("Permissões padrão")
    }
    def group(){
        System.out.println("Grupo padrão")
    }
}

