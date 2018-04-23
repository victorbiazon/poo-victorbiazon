package ursamaior

class Constelacao {
	private ArrayList<Estrela> star
        
    Constelacao(){
        this.star = new ArrayList<Estrela>()
    }
    
   def adicionar(Estrela e){
        star.add(e)
    }
    
   def infoEstrelas(){
        println("Informacoes das estrelas desta constelacao: ")
	println()
        for(Estrela e: star){
            e.mostrar()
        }
    }   
    def tempConstelacao(){
        double total = 0
        for(Estrela e: star){
             total += e.getTemp()
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

