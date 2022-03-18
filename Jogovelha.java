package jogoVelha;

// Importando a blibioteca Scanner

import java.util.Scanner;

public class Jogovelha {

	public static void main(String[] args){
		
		// Inicializando as variaves
		
		int cds = 1;
		int l = 0;
		int c = 0;
		char jumx = 'X';
		boolean start = true;
		String name = "Jogo da Velha";
		String jum = "Jogador 1";
		String jois = "Jogador 2";
		String vitoria = "Vitoria do Jogador 1";
		String seta = "<-";

// Inicializando a função scanner
		
		
		Scanner sc = new Scanner(System.in);
		
		
// Inicializando e criando a matriz
		
		
		char[][] tabela = new char[3][3];


// Criando o loop para rodar o nosso "jogo da velha"
		
		
		while(start) {
			cds = cds * -1;
			if(cds == -1) {
				seta = "<-";
				jumx = 'X';
			}
			if(cds == 1) {
				seta = "->";
				jumx = 'O';
			}
			
			System.out.println("::::::::::::"+name+"::::::::::::");
			System.out.println(jum+"        "+seta+"         "+jois);
			System.out.println(" ");
			System.out.println(" ");
			
			
// Mostrando o jogo da velha
			
			
			for(int i = 0; i < tabela.length ;i++) {
				for(int j = 0; j < tabela[i].length; j++) {
					System.out.print("        " + tabela[i][j] + ")");
				}
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
			}
			
			
// recebendo e colocar as letras(x,o) no tabuleiro

			System.out.println(" ");
			System.out.println("(Numero de 1 a 3)");
			System.out.println(" ");
			System.out.print("Linha: ");
			l = sc.nextInt();
			System.out.print("Coluna: ");
			c = sc.nextInt();
			
			if(l == 1 & c == 1) {
				tabela[0][0] = jumx;
			}
			if(l == 1 & c == 2) {
				tabela[0][1] = jumx;
			}
			if(l == 1 & c == 3) {
				tabela[0][2] = jumx;
			}
			if(l == 2 & c == 1) {
				tabela[1][0] = jumx;
			}
			if(l == 2 & c == 2) {
				tabela[1][1] = jumx;
			}
			if(l == 2 & c == 3) {
				tabela[1][2] = jumx;
			}
			if(l == 3 & c == 1) {
				tabela[2][0] = jumx;
			}
			if(l == 3 & c == 2) {
				tabela[2][1] = jumx;
			}
			if(l == 3 & c == 3) {
				tabela[2][2] = jumx;
			}
			
			
// Checando a Vitoria do Jogador 1
			

			if(tabela[0][0] == 'X' & tabela[0][1] == 'X' & tabela[0][2] == 'X') {
				start = false;
				vitoria = "Vitoria do Jogador 1";
			}
			if(tabela[1][0] == 'X' & tabela[1][1] == 'X' & tabela[1][2] == 'X') {
				start = false;
				vitoria = "Vitoria do Jogador 1";
			}
			if(tabela[2][0] == 'X' & tabela[2][1] == 'X' & tabela[2][2] == 'X') {
				start = false;
				vitoria = "Vitoria do Jogador 1";
			}
			if(tabela[0][0] == 'X' & tabela[1][1] == 'X' & tabela[2][2] == 'X') {
				start = false;
				vitoria = "Vitoria do Jogador 1";
			}
			if(tabela[2][0] == 'X' & tabela[1][1] == 'X' & tabela[0][2] == 'X') {
				start = false;
				vitoria = "Vitoria do Jogador 1";
			}
			
			
// Checando a Vitoria do Jogador 2
			
			
			if(tabela[0][0] == 'O' & tabela[0][1] == 'O' & tabela[0][2] == 'O') {
				start = false;
				vitoria = "Vitoria do Jogador 2";
				}
			if(tabela[1][0] == 'O' & tabela[1][1] == 'O' & tabela[1][2] == 'O') {
				start = false;
				vitoria = "Vitoria do Jogador 2";
				}
			if(tabela[2][0] == 'O' & tabela[2][1] == 'O' & tabela[2][2] == 'O') {
				start = false;
				vitoria = "Vitoria do Jogador 2";
				}
			if(tabela[0][0] == 'O' & tabela[1][1] == 'O' & tabela[2][2] == 'O') {
				start = false;
				vitoria = "Vitoria do Jogador 2";
				}
			if(tabela[2][0] == 'O' & tabela[1][1] == 'O' & tabela[0][2] == 'O') {
				start = false;
				vitoria = "Vitoria do Jogador 2";
				}
		}
		
		
// Mostrando quem ganhou
		
		
		System.out.println("::::::::::::"+name+"::::::::::::");
		System.out.println(vitoria);
		System.out.println(" ");
		
		for(int i = 0; i < tabela.length ;i++) {
			for(int j = 0; j < tabela[i].length; j++) {
				System.out.print("        " + tabela[i][j] + ")");
			}
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
		}

		sc.close();
	}

}
