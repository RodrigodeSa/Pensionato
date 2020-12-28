
//A dona de um pensionato possui 10 quartospara alugar para estudantes, sendo identificados de 0-9.
//Fazer um programa que inicie os 10 quartos vazios, e depois leia uma quantidade N representando o numero de estudantes
//que vão alugar(N pode ser de 1-10). Em seguida, resgistre o aluguel dos N estudantes. Para cada registro, informar o nome e e-mail
//do estudante, bem como qual dos quartos ele escolheu(0-9). Suponha que seja escolhido um quarto vago. Ao final, seu programa deve 
//imprimir um relatório de todas as ocupações do pensionato, por ordem de quarto.

package Application;


import java.util.Locale;
import java.util.Scanner;

import entitiesExerc.ProductExerc;

public class ProgramExerc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ProductExerc[] quartos = new ProductExerc[10];
		
		System.out.println("Quantos quartos serão alugados? ");
		int nEstudantes = sc.nextInt();
		
		for(int i=0; i<nEstudantes; i++) {
			sc.nextLine();
			System.out.print("Digite o nome: ");
			String name = sc.nextLine();
			System.out.print("Digite o e-mail: ");
			String email = sc.nextLine();
			System.out.print("Qual dos quartos vc prefere? ");
			int quarto = sc.nextInt();
			System.out.print("Digite o número de alugueis: ");
			int aluguel = sc.nextInt();
			System.out.println();
			quartos[i] = new ProductExerc(name, email, quarto, aluguel);
			
		}
		
		//Arrays.sort();
		for (int i=1; i<=quartos.length; i++) {
		System.out.println("Rent: " + quartos[i].getAluguel());
		System.out.println("Name: " + quartos[i].getName());
		System.out.println("e-mail: " + quartos[i].getEmail());
		System.out.println("Room: " + quartos[i].getQuarto());
		System.out.println();
		}			
								
		sc.close();
	}
}