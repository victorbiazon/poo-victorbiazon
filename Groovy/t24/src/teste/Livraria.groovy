/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teste

/**
 *
 * @author victo
 */
class Livraria {
    private int estoque;
    private Livro livro;
    
    public Livraria(int estoque) {
        this.estoque = Math.max(0, estoque);        
        
    }
    
    public void venderLivro(int quantidade) {
        int qtVendas = Math.max(0, quantidade);
        if(qtVendas <= estoque) {
            estoque -= qtVendas;
        }
    }
    
    public int estoque() {
        return estoque;
    }


}

