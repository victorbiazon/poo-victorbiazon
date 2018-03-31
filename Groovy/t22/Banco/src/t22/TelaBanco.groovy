/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t22
import java.util.Scanner

/**
 *
 * @author victo
 */
class TelaBanco {
	
	Scanner s = new Scanner(System.in)
	Cliente c1 = new Cliente("Adam",2000,800)
	Cliente c2 = new Cliente("William",1000,500)
	Doc d = new Doc()
				
	def menu() {
		int opcao																			//String nome;
		double quantia=0
					
		println("Nome: " + c1.getNome())										
		
		while(opcao!=4){																				//System.out.println("Digite o seu nome: ");
			println("Escolha uma das opcoes abaixo: ")							//nome = s.nextLine();		
			println("1) Sacar dinheiro")
			println("2) Transferir dinheiro")
			println("3) Checar saldo desta conta")
			println("4) Sair da conta")
			opcao = s.nextInt()
			
			switch(opcao) {
			
			case 1:
				println("Informe a quantia que deseja sacar: ")
				quantia = s.nextDouble()
				c1.sacar(quantia)
				break
				
			case 2:
                                println("Informe a quantia que deseja transferir: ")
				quantia = s.nextDouble()
				d.transferir(c1,c2,quantia)
				break
			case 3:
				println("Saldo atual = " + c1.getSaldo())
				println("Limite = " + c1.getLimite())
				println("Disponivel = " + c1.checarSaldo())
				break
			
			case 4:
				println("Programa finalizado.")
				break
				
			default:
                                println("Opcao invalida.")
				break
			}
			
		}	
		}
}

