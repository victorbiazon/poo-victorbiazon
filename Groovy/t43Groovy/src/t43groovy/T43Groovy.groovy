/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t43groovy

/**
 *
 * @author victo
 */
class T43Groovy {
    public static void main(String[] args) {
        ICMS i1 = new ICMS("Chá",10)
        ICMS i2 = new ICMS("Bolacha",4)
        IPI ip1 = new IPI("Carne",27)
        IPI ip2 = new IPI("Café",13)
    
        Colecao c = new Colecao()
        c.adicionar(i1)
        c.adicionar(i2)
        c.adicionar(ip1)
        c.adicionar(ip2)
        c.infoProduto()
    }
}

