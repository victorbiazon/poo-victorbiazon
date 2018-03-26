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
class Bateria {
    private int carga
        
    public def Bateria(){
        this.carga = 100
    }
    
    def carrega(int valor){
        if(this.carga != 100){
            this.carga += valor
        }
    }
    
    def descarrega(int valor){
        if(this.carga != 0){
            this.carga -= valor
        }
    }
    
    public def getCarga(){
        carga
    }
}

