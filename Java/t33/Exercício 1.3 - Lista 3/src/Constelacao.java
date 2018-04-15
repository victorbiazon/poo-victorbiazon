import java.util.ArrayList;

public class Constelacao {

private ArrayList<Estrela> star;										//nomear o arraylist da classe Estrela
    
    public Constelacao(){
        this.star = new ArrayList<Estrela>();							//construtor que atribui os elementos que aparecem na classe Estrela
    }																	//ao vetor star
    
    public void adicionar(Estrela e){									//adiciona ao vetor star todos os elementos elencados na classe Estrela
        star.add(e);
    }
       
    public void infoEstrelas(){											//exibe todas as informações sobre as estrelas nomeadas na classe principal(Teste)
    	
    	System.out.println("Informações das estrelas desta constelação: ");
    	System.out.println();                                           //apenas para pular linha
		for(Estrela e: star) {											//para cada índice do vetor star, são atribuídos os três atributos listados
			e.mostrar();															//abaixo, extraídos da classe Estrela
            //System.out.println("Nome: " + e.getNome());				    //recebe os valores do atributo "nome" da classe Estrela
            //System.out.println("Temperatura: " + e.getTemp() + " K");	//recebe os valores do atributo "temp" da classe Estrela
            //System.out.println("Cor: " + e.getCor());					//recebe os valores do atributo "cor" da classe Estrela
            //System.out.println();                                      //apenas para pular linha			
		}		
    }
    
    public double tempConstelacao(){
        double total = 0;
        for(Estrela e: star){											
            total += e.getTemp();										//soma todas as temperaturas das estrelas elencadas na classe principal (Teste)
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

	

