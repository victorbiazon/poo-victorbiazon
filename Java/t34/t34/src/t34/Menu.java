/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t34;
import java.util.Scanner;

/**
 *
 * @author victo
 */
public class Menu {
    private Scanner entrada = new Scanner(System.in);
    private int opcao;
    private String activeUser,login;
    private Guest guest = new Guest("guest");
    private Regular regular = new Regular("regular");
    private Group group = new Group("group");
    private Root root = new Root("root");
    
    public void login(){
        do{
            System.out.println("Digite seu login: ");
            while(entrada.hasNext("\n")){
                entrada.next();
            } 
            login = entrada.nextLine();
            if(root.buscaLogin(login)){
                activeUser = login;
            }else if(guest.buscaLogin(login)){
                activeUser = login;
            }else if(regular.buscaLogin(login)){
                activeUser = login;
            }else if(group.buscaLogin(login)){
                activeUser = login;
            }else{
                System.out.println("Usuário não existe.");
            }
        }while(!login.equals(activeUser));
    }
    
    public void menu(){
        do{
            login();
            if(activeUser.equals("root")){
                do{
                    root.boasVindas();
                    System.out.println("Menu:");
                    System.out.println("1-Permissões");
                    System.out.println("2-Opções de grupo");
                    System.out.println("8-Troca Usuário");
                    System.out.println("9-Sair");
                    System.out.println("Opção: ");
                    opcao = entrada.nextInt();
                    switch(opcao){
                        case 1:
                            root.descricaoRoot();
                            break;
                        case 2:
                            root.excluirTodos();
                            break;
                        case 8:
                            root.despedidaRoot();
                            break;
                        case 9:
                            root.despedidaRoot();
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                }while(opcao!=9&&opcao!=8);
            }
            if(activeUser.equals("guest")){
                do{
                    guest.boasVindas();
                    System.out.println("Menu:");
                    System.out.println("1-Permissões");
                    System.out.println("8-Troca Usuário");
                    System.out.println("9-Sair");
                    System.out.println("Opção: ");
                    opcao = entrada.nextInt();
                    switch(opcao){
                        case 1:
                            guest.descricaoGuest();
                            break;
                        case 8:
                            guest.despedidaGuest();
                            break;
                        case 9:
                            guest.despedidaGuest();
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                }while(opcao!=9&&opcao!=8);
            }
            if(activeUser.equals("group")){
                do{
                    group.boasVindas();
                    System.out.println("Menu:");
                    System.out.println("1-Permissões");
                    System.out.println("2-Opções de grupo");
                    System.out.println("8-Troca Usuário");
                    System.out.println("9-Sair");
                    System.out.println("Opção: ");
                    opcao = entrada.nextInt();
                    switch(opcao){
                        case 1:
                            group.descricaoGroup();
                            break;
                        case 2:
                            group.groupBoard();
                            break;
                        case 8:
                            group.despedidaGroup();
                            break;
                        case 9:
                            group.despedidaGroup();
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                }while(opcao!=9&&opcao!=8);
            }
            if(activeUser.equals("regular")){
                do{
                    regular.boasVindas();
                    System.out.println("Menu:");
                    System.out.println("1-Permissões");
                    System.out.println("2-Dashboard");
                    System.out.println("8-Troca Usuário");
                    System.out.println("9-Sair");
                    System.out.println("Opção: ");
                    opcao = entrada.nextInt();
                    switch(opcao){
                        case 1:
                            regular.descricaoRegular();
                            break;
                        case 2:
                            regular.dashboard();
                            break;
                        case 8:
                            regular.despedidaRegular();
                            break;
                        case 9:
                            regular.despedidaRegular();
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                }while(opcao!=9&&opcao!=8);
            }
        }while(opcao!=9);
    }
}
