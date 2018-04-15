
public class Estrela {
    private String nome;
    private double temp;
    private String cor;
     
    public Estrela(String nome,double temp,String cor){
        this.nome = nome;
        this.temp = temp;
        this.cor = cor;        
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getTemp(){
        return temp;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void mostrar() {
    	System.out.println("Nome: " + nome);
    	System.out.println("Temperatura: " + temp + " K");
    	System.out.println("Cor: " + cor);
    	System.out.println();                                      
    }
    
    
}
