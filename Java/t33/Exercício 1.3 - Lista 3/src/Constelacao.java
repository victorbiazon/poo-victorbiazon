import java.util.ArrayList;

public class Constelacao {

private ArrayList<Estrela> star;										//nomear o arraylist da classe Estrela
    
    public Constelacao(){
        this.star = new ArrayList<Estrela>();							//construtor que atribui os elementos que aparecem na classe Estrela
    }																	//ao vetor star
    
    public void adicionar(Estrela e){									//adiciona ao vetor star todos os elementos elencados na classe Estrela
        star.add(e);
    }
       
    public void infoEstrelas(){											//exibe todas as informa��es sobre as estrelas nomeadas na classe principal(Teste)
    	
    	System.out.println("Informa��es das estrelas desta constela��o: ");
    	System.out.println();                                           //apenas para pular linha
		for(Estrela e: star) {											//para cada �ndice do vetor star, s�o atribu�dos os tr�s atributos listados
																		//abaixo, extra�dos da classe Estrela
            System.out.println("Nome: " + e.getNome());				    //recebe os valores do atributo "nome" da classe Estrela
            System.out.println("Temperatura: " + e.getTemp() + " K");	//recebe os valores do atributo "temp" da classe Estrela
            System.out.println("Cor: " + e.getCor());					//recebe os valores do atributo "cor" da classe Estrela
            System.out.println();                                      //apenas para pular linha			
		}		
    }
    
    public void tempConstelacao(){
        double total = 0;
        for(Estrela e: star){											
            total += e.getTemp();										//soma todas as temperaturas das estrelas elencadas na classe principal (Teste)
        }
        System.out.println("Soma das temperaturas das estrelas listadas = " + total);
    }
    
    public void introducao() {
    	System.out.println("CONSTELA��O URSA MAIOR");
    	System.out.println();										   //apenas para pular linha
    	System.out.println("Lista de estrelas desta constela��o, com suas respectivas temperaturas e cores: ");
    	System.out.println();
    }
}

