package prioridade;

import java.util.Scanner;

public class AlgoritmoTeste {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero;
		int numPrograma;
		Algoritmo teste = new Algoritmo();
		
		
		System.out.printf("Selecione o grupo que deseja executar.\nMicrosoft\nSteam\n");
		String selecao = scan.next();
		selecao = selecao.toLowerCase();
		
		
		switch(selecao) {
			case("microsoft"):
				Microsoft microsoft = new Microsoft();
			
				System.out.println(microsoft.padrao());
				System.out.println("Digite o numero do programa e defina a prioridade que deseja atribuir.");
				
				for(int i = 0; i < 9; i++) {
					if(i != 0) System.out.println("Próximo");
					numPrograma = scan.nextInt();
					numero = scan.nextInt();
					teste.adicionarExe(teste.nomePrograma(selecao, numPrograma), numero);
				}
				for(int i = 0; i < 9; i++) {
					System.out.println(teste.mostrarFila());
				}
				break;
				
			case("steam"):
				Steam steam = new Steam();
			
				System.out.println(steam.padrao());
				System.out.println("Digite o numero do programa e defina a prioridade que deseja atribuir.");
				
				for(int i = 0; i < 10; i++) {	
					if(i != 0) System.out.println("Próximo");
					numPrograma = scan.nextInt();
					numero = scan.nextInt();
					teste.adicionarExe(teste.nomePrograma(selecao, numPrograma), numero);
					}
				
				for(int i = 0; i < 10; i++) {
					System.out.println(teste.mostrarFila());
				}
				break;
				
			default:
				System.out.println("Encerrando programa.");
				break;
		}
		
		
		scan.close();
	}
}
