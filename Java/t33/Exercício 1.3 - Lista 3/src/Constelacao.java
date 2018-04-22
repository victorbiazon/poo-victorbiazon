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
			e.mostrar();		
                }		
    }
    
    public double tempConstelacao(){
        double total = 0;
        for(Estrela e: star){											
            total += e.getTemp();										
        }
        return total;
    }
    
    public void mostraTempConstelacao() {
    	System.out.println("A soma das temperaturas das estrelas elencadas é igual a " + tempConstelacao() + " K." );
    }
    
    public void introducao() {
    	System.out.println("CONSTELAÇÃO URSA MAIOR");
    	System.out.println();										   //apenas para pular linha
    	System.out.println("Lista de estrelas desta constelação, com suas respectivas temperaturas e cores: ");
    	System.out.println();
    }
}

	

