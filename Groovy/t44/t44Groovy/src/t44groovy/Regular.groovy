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
class Regular {
    public Regular(String username) {
        super(username);
    }
    //@Override
    public void permissoes(){
        System.out.println("Pode consultar suas informações.");
    }
    //@Override
    public void group(){
        System.out.println("Usuario: "+super.getUsername());
        System.out.println("Tipo: Regular");
        System.out.print("Permissoes: ");
        this.permissoes();
    }
}

