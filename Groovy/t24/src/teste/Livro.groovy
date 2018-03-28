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
class Livro {
    
    private FormatoLivro livro;
  
    public Livro(FormatoLivro livro) {
        this.livro = livro;   
    }
        
    
    public Double mostrarPreco() {
        if (livro == FormatoLivro.Epub) {
            return 20.0;
                    }
        if (livro == FormatoLivro.PDF) {
            return 40.0;
                    }    
        if (livro == FormatoLivro.livrofisico) {
            return 80.0;
                    }
            return 0.0;
                
    }
    
    
    public String mostrarTipo() {
        if (livro == FormatoLivro.Epub) {
            return "EPUB";
        }
        if (livro == FormatoLivro.PDF) {
            return "PDF";
        }    
        if (livro == FormatoLivro.livrofisico) {
            return "Fisico";
        }
        return null;    
        
        }

}

