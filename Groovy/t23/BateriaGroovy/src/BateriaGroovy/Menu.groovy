/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BateriaGroovy
import java.util.Scanner

/**
 *
 * @author victo
 */
class Menu {
    private Scanner entrada = new Scanner(System.in)
    private int opcao
    private Celular celular = new Celular(1,"victor")
    
    def menu(){
        while(opcao != 9){
            if(celular.isLigado()==true){
                celular.mostraInfo()
            }
            if(celular.isCarregando()==true){
                celular.carrega(5)
            }
            println("1-Liga");
            println("2-Desliga");
            println("3-Coloca para carregar");
            println("4-Tira do carregador");
            println("5-Toca");
            println("6-Troca bateria");
            println("9-Encerra");
            println("Opcao: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    celular.liga()
                    break
                case 2:
                    celular.desliga()
                    break
                case 3:
                    celular.setCarregando(true)
                    break
                case 4:
                    celular.setCarregando(false)
                    break
                case 5:
                    celular.toca()
                    break
                case 6:
                    celular.trocaBateria()
                    break
                case 9:
                    println("Fim")
                    break
                default:
                    println("Opcao invalida!")
            }
        }
    }
}

