package ex2lista2;

import java.util.Scanner;

public class TelaBanco {
	
	Scanner s = new Scanner(System.in);
	Cliente c1 = new Cliente("Adam",2000,800);
	Cliente c2 = new Cliente("William",1000,500);
	Doc d = new Doc();
				
	public void menu() {
		int opcao;																			//String nome;
		double quantia=0;
					
		System.out.println("Nome: " + c1.getNome());										
		
		do {																				//System.out.println("Digite o seu nome: ");
			System.out.println("Escolha uma das opcoes abaixo: ");							//nome = s.nextLine();		
			System.out.println("1) Sacar dinheiro");
			System.out.println("2) Transferir dinheiro");
			System.out.println("3) Checar saldo desta conta");
			System.out.println("4) Sair da conta");
			opcao = s.nextInt();
			
			switch(opcao) {
			
			case 1:
				System.out.println("Informe a quantia que deseja sacar: ");
				quantia = s.nextDouble();
				c1.sacar(quantia);
				break;
				
			case 2:
				System.out.println("Informe a quantia que deseja transferir: ");
				quantia = s.nextDouble();
				d.transferir(c1,c2,quantia);
				break;
				
			case 3:
				System.out.println("Saldo atual = " + c1.getSaldo());
				System.out.println("Limite = " + c1.getLimite());
				System.out.println("Disponivel = " + c1.checarSaldo());
				break;
			
			case 4:
				System.out.println("Programa finalizado.");
				break;
				
			default:
				System.out.println("Opcao invalida.");
				break;
			}
			
		}while(opcao!=4);	
		}
}
