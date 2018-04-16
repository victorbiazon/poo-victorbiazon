/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ursamaior

/**
 *
 * @author victo
 */
class Constelacao {
	private ArrayList<Estrela> star
        
    Constelacao(){
        this.star = new ArrayList<Estrela>()
    }
    
   def adicionar(Estrela e){
        star.add(e);
    }
    
   def infoEstrelas(){
        println("Informacoes das estrelas desta constelacao: ");
        for(Estrela e: star){
            println "Nome = " + e.getNome()
            println "Temperatura = " + e.getTemp()
            println "Cor = " + e.getCor();
            println()
        }
    }   
    def tempConstelacao(){
        double total = 0
        for(Estrela e: star){
             total += e.getTemp();
        }
         println "Soma das temperaturas das estrelas listadas: " + total
            
    }
      
    def introducao(){
        println "CONSTELACAO URSA MAIOR"
        println()
        println "Lista de estrelas desta constelacao: "
        println()
    }
    
}

