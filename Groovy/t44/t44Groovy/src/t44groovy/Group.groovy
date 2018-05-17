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
class Group {
    def Group(String username) {
        super(username)
    }
    //@Override
    def permissoes(){
        System.out.println("Pode participar de grupos.")
    }
    //@Override
    def group(){
        System.out.println("Você pode apagar usuários deste grupo")
    }
}

