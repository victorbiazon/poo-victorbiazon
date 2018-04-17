package ursamaior

class Estrela {
	private String nome
        private double temp
        private String cor
        
        def Estrela(String nome,double temp,String cor){
            this.nome = nome
            this.temp = temp
            this.cor = cor
        }
        
        def String getNome(){
            nome
        }
        
        def double getTemp(){
            temp
        }
        
        def String getCor(){
            cor
        }
        
        def mostrar(){
            println "Nome: " + nome
            println "Temperatura: " + temp + " K"
            println "Cor: " + cor
        }
        
}
        

