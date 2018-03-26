/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bateria;

/**
 *
 * @author victo
 */
class Celular {
    private int numero;
    private String nome;
    private Bateria bateria;
    private boolean ligado = false;
    private boolean carregando = false;
    
    public Celular(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        bateria = new Bateria();
    }
    
    public void carrega(int valor){
        bateria.carrega(valor);
    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean isCarregando() {
        return carregando;
    }

    public void setCarregando(boolean carregando) {
        this.carregando = carregando;
    }
    
    void liga(){
        if(ligado==false){
            ligado = true;
            bateria.descarrega(20);
        }
    }
    
    void mostraInfo(){
        System.out.println("Celular: "+numero+"\nNome: "+nome);
        System.out.print("Bateria");
        if(bateria.getCarga() < 20){
            System.out.print(" fraca");
        }
        if(carregando==true){
            System.out.print(" carregando");
        }
        System.out.println(": "+bateria.getCarga()+"%");
    }
    
    void desliga(){
        if(ligado==true){
            ligado = false;
            carregando = false;
            bateria.descarrega(10);
            if(bateria.getCarga() >= 20){
                System.out.println("Desligando, até logo");
            }
        }
    }
    
    void toca(){
        if(ligado==true&&bateria.getCarga()>=10){
            System.out.println("beep");
            if(carregando==false){
                bateria.descarrega(10);
            }
        }
    }
    
    void trocaBateria(){
        this.desliga();
        this.bateria = new Bateria();
        System.out.println("Bateria trocada, pode ligar o celular novamente");
    }
}
