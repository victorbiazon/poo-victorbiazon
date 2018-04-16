/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t34groovy
import java.util.Scanner

/**
 *
 * @author victo
 */
class Menu {
    private Scanner entrada = new Scanner(System.in)
    private int opcao = 0
    private String activeUser = "nenhum",login
    private Guest guest = new Guest("guest")
    private Regular regular = new Regular("regular")
    private Group group = new Group("group")
    private Root root = new Root("root")
    
    def login(){
        
        while(!login.equals(activeUser)){
            /*while(entrada.hasNext("\n")){
                entrada.next()
            }*/
            println("Digite seu login: ")
            login = entrada.nextLine()
            if(root.buscaLogin(login)){
                activeUser = login
            }else{
                if(guest.buscaLogin(login)){
                    activeUser = login
                }else{
                    if(regular.buscaLogin(login)){
                        activeUser = login
                    }else{
                        if(group.buscaLogin(login)){
                            activeUser = login
                        }else{
                            println("Usuário não existe.")
                        }
                    }
                }
            }
        }
    }
    
    def menu(){
        while(opcao!=9){
            login()
            if(activeUser.equals("root")){
                while(opcao!=9&&opcao!=8){
                    root.boasVindas()
                    System.out.println("Menu:")
                    System.out.println("1-Permissões")
                    System.out.println("2-Opções de grupo")
                    System.out.println("8-Troca Usuário")
                    System.out.println("9-Sair")
                    System.out.println("Opção: ")
                    opcao = entrada.nextInt()
                    switch(opcao){
                        case 1:
                            root.descricaoRoot()
                            break
                        case 2:
                            root.excluirTodos()
                            break
                        case 8:
                            root.despedidaRoot()
                            activeUser = "nenhum"
                            break
                        case 9:
                            root.despedidaRoot()
                            break
                        default:
                            println("Opção inválida!")
                    }
                }
            }
            if(activeUser.equals("guest")){
                while(opcao!=9&&opcao!=8){
                    guest.boasVindas()
                    System.out.println("Menu:")
                    System.out.println("1-Permissões")
                    System.out.println("8-Troca Usuário")                    
                    System.out.println("9-Sair");
                    System.out.println("Opção: ")
                    opcao = entrada.nextInt()
                    switch(opcao){
                        case 1:
                            guest.descricaoGuest()
                            break
                        case 8:
                            guest.despedidaGuest()
                            activeUser = "nenhum"
                            break
                        case 9:
                            guest.despedidaGuest()
                            break
                        default:
                            println("Opção inválida!")
                    }
                }
            }
            if(activeUser.equals("group")){
                while(opcao!=9&&opcao!=8){
                    group.boasVindas()
                    System.out.println("Menu:")
                    System.out.println("1-Permissões")
                    System.out.println("2-Opções de grupo")
                    System.out.println("8-Troca Usuário")
                    System.out.println("9-Sair")
                    System.out.println("Opção: ")
                    opcao = entrada.nextInt()
                    switch(opcao){
                        case 1:
                            group.descricaoGroup()
                            break
                        case 2:
                            group.groupBoard()
                            break
                        case 8:
                            group.despedidaGroup()
                            activeUser = "nenhum"
                            break
                        case 9:
                            group.despedidaGroup()
                            break
                        default:
                            println("Opção inválida!")
                    }
                }
            }
            if(activeUser.equals("regular")){
                while(opcao!=9&&opcao!=8){
                    regular.boasVindas()
                    System.out.println("Menu:")
                    System.out.println("1-Permissões")
                    System.out.println("2-Dashboard")
                    System.out.println("8-Troca Usuário")
                    System.out.println("9-Sair")
                    System.out.println("Opção: ")
                    opcao = entrada.nextInt()
                    switch(opcao){
                        case 1:
                            regular.descricaoRegular()
                            break
                        case 2:
                            regular.dashboard()
                            break
                        case 8:
                            regular.despedidaRegular()
                            activeUser = "nenhum"
                            break
                        case 9:
                            regular.despedidaRegular()
                            break
                        default:
                            println("Opção inválida!")
                    }
                }
            }
        }
    }
}

