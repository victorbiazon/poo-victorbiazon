/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t44groovy
import java.util.Scanner

/**
 *
 * @author victo
 */
class Menu {
    private Scanner entrada = new Scanner(System.in)
    private int opcao
    private String activeUser=null,login,password
    private Login user = new Login()
    public Menu(){
        user.addUser(new Guest("guest"))
        user.addUser(new Regular("regular"))
        user.addUser(new Group("group"))
        user.addUser(new Root("root"))
    }
    
    def login(){
        while(!login.equals(activeUser)){
            System.out.println("Digite seu login: ")
            while(entrada.hasNext("\n")){
                entrada.nextLine()
            }
            login = entrada.nextLine()
            try{
                user.buscaLogin(login)
            }catch(Exception e){
                System.out.println(e.getMessage())
            }
            activeUser = login
        }
    }
    
    def menu(){
        
        while(opcao!=9){
            login()
            if(activeUser.equals("root")){
                while(opcao!=9&&opcao!=8){
                    ((Root) user.getLogin().get(3)).boasVindas()
                    System.out.println("Menu:")
                    System.out.println("1-Permissões")
                    System.out.println("2-Opções de grupo")
                    System.out.println("8-Troca Usuário")
                    System.out.println("9-Sair")
                    System.out.println("Opção: ")
                    opcao = entrada.nextInt()
                    switch(opcao){
                        case 1:
                            ((Root) user.getLogin().get(3)).permissoes()
                            break
                        case 2:
                            ((Root) user.getLogin().get(3)).group()
                            break
                        case 8:
                            ((Root) user.getLogin().get(3)).despedida()
                            break
                        case 9:
                            ((Root) user.getLogin().get(3)).despedida()
                            break
                        default:
                            System.out.println("Opção inválida!")
                    }
                }
            }
            if(activeUser.equals("guest")){
                while(opcao!=9&&opcao!=8){
                    ((Guest) user.getLogin().get(0)).boasVindas()
                    System.out.println("Menu:")
                    System.out.println("1-Permissões")
                    System.out.println("8-Troca Usuário")
                    System.out.println("9-Sair")
                    System.out.println("Opção: ")
                    opcao = entrada.nextInt()
                    switch(opcao){
                        case 1:
                            ((Guest) user.getLogin().get(0)).permissoes()
                            break
                        case 8:
                            ((Guest) user.getLogin().get(0)).despedida()
                            break
                        case 9:
                            ((Guest) user.getLogin().get(0)).despedida()
                            break
                        default:
                            System.out.println("Opção inválida!")
                    }
                }
            }
            if(activeUser.equals("group")){
                while(opcao!=9&&opcao!=8){
                    ((Group) user.getLogin().get(2)).boasVindas()
                    System.out.println("Menu:")
                    System.out.println("1-Permissões")
                    System.out.println("2-Opções de grupo")
                    System.out.println("8-Troca Usuário")
                    System.out.println("9-Sair")
                    System.out.println("Opção: ")
                    opcao = entrada.nextInt()
                    switch(opcao){
                        case 1:
                            ((Group) user.getLogin().get(2)).permissoes()
                            break
                        case 2:
                            ((Group) user.getLogin().get(2)).group()
                            break
                        case 8:
                            ((Group) user.getLogin().get(2)).despedida()
                            break
                        case 9:
                            ((Group) user.getLogin().get(2)).despedida()
                            break
                        default:
                            System.out.println("Opção inválida!")
                    }
                }
            }
            if(activeUser.equals("regular")){
                while(opcao!=9&&opcao!=8){
                    ((Regular) user.getLogin().get(1)).boasVindas()
                    System.out.println("Menu:")
                    System.out.println("1-Permissões")
                    System.out.println("2-Dashboard")
                    System.out.println("8-Troca Usuário")
                    System.out.println("9-Sair")
                    System.out.println("Opção: ")
                    opcao = entrada.nextInt()
                    switch(opcao){
                        case 1:
                            ((Regular) user.getLogin().get(1)).permissoes()
                            break
                        case 2:
                            ((Regular) user.getLogin().get(1)).group()
                            break
                        case 8:
                            ((Regular) user.getLogin().get(1)).despedida()
                            break
                        case 9:
                            ((Regular) user.getLogin().get(1)).despedida()
                            break
                        default:
                            System.out.println("Opção inválida!")
                    }
                }
            }
        }
    }
}

