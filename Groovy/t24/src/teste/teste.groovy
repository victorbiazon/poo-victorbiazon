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
public class teste{  
    static void main(String[] args){
        Livraria l = new Livraria(115);
        Livro livro =  new Livro(FormatoLivro.livrofisico);
        l.venderLivro(2);
        println("Formato do livro: " + livro.mostrarTipo());
        println("Pre�o: " + livro.mostrarPreco());
        println("Disponivel em estoque: " + l.estoque());
    }
}


