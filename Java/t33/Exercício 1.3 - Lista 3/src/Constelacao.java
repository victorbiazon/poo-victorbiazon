import java.util.ArrayList;

public class Constelacao {

private ArrayList<Estrela> star;										
    
    public Constelacao(){
        this.star = new ArrayList<Estrela>();							
    }																	
    
    public void adicionar(Estrela e){									
        star.add(e);
    }
       
    public void infoEstrelas(){											
    	
    	System.out.println("Informações das estrelas desta constelação: ");
    	System.out.println();                                           
		for(Estrela e: star) {											
																		
            System.out.println("Nome: " + e.getNome());				    
            System.out.println("Temperatura: " + e.getTemp() + " K");	
            System.out.println("Cor: " + e.getCor());					
            System.out.println();                                      			
		}		
    }
    
    public void tempConstelacao(){
        double total = 0;
        for(Estrela e: star){											
            total += e.getTemp();										
        }
        System.out.println("Soma das temperaturas das estrelas listadas = " + total);
    }
    
    public void introducao() {
    	System.out.println("CONSTELAÇÃO URSA MAIOR");
    	System.out.println();										   
    	System.out.println("Lista de estrelas desta constelação, com suas respectivas temperaturas e cores: ");
    	System.out.println();
    }
}

