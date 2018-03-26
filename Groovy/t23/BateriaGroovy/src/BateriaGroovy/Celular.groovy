/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BateriaGroovy

/**
 *
 * @author victo
 */
class Celular {
	private int numero
        private String nome
        private Bateria bateria
        private boolean ligado = false
        private boolean carregando = false
        
    def Celular(int numero,String nome){
        this.numero = numero
        this.nome = nome
        bateria = new Bateria()
    }
        
    void carrega(int valor){
        bateria.carrega(valor)
    }
    
    def isLigado(){
        ligado
    }
    
    def isCarregando(){
        carregando
    }
    
    def setCarregando(boolean carregando){
        this.carregando = carregando
    }
    
    def liga(){
        if(ligado==false){
            ligado = true
            bateria.descarrega(20)
        }
    }
    
    def mostraInfo(){
        println("Celular: "+numero+"\nNome: "+nome)
        print("Bateria")
        if(bateria.getCarga() < 20){
            print(" fraca")
        }
        if(carregando==true){
            print(" carregando")
        }
        println(": "+bateria.getCarga()+"%")
    }
    
    def desliga(){
        if(ligado==true){
            ligado = false
            carregando = false
            bateria.descarrega(10)
            if(bateria.getCarga() >= 20){
                println("Desligando, até logo")
            }
        }
    }
    
    def toca(){
        if(ligado==true&&bateria.getCarga() >= 10){
            println("beep")
            if(carregando==false){
                bateria.descarrega(10)
            }
        }
    }
    
    def trocaBateria(){
        desliga()
        bateria = new Bateria()
        println("Bateria trocada, pode ligar o celular novamente")
    }
}

