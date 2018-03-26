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
class Bateria {
    private int carga;
    
    public Bateria() {
        this.carga = 100;
    }
    
    void carrega(int valor){
        if (this.carga != 100){
            this.carga += valor;
        }
    }
    
    void descarrega(int valor){
        if (this.carga != 0){
            this.carga -= valor;
        }
    }

    public int getCarga() {
        return carga;
    }
    
}
