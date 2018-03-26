/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bateria;
import java.util.Scanner;

/**
 *
 * @author victo
 */
class Menu {
    private Scanner entrada = new Scanner(System.in);
    private int opcao;
    private Celular celular = new Celular(1,"victor");
    
    void menu(){
        do{
            if(celular.isLigado()==true){
                celular.mostraInfo();
            }
            if(celular.isCarregando()==true){
                celular.carrega(5);
            }
            System.out.println("1-Liga");
            System.out.println("2-Desliga");
            System.out.println("3-Coloca para carregar");
            System.out.println("4-Tira do carregador");
            System.out.println("5-Toca");
            System.out.println("6-Troca bateria");
            System.out.println("9-Encerra");
            System.out.println("Opcao: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    celular.liga();
                    break;
                case 2:
                    celular.desliga();
                    break;
                case 3:
                    celular.setCarregando(true);
                    break;
                case 4:
                    celular.setCarregando(false);
                    break;
                case 5:
                    celular.toca();
                    break;
                case 6:
                    celular.trocaBateria();
                    break;
                case 9:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }while(opcao !=9);
    }
    
}
