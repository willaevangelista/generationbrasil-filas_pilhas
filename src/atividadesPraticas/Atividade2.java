/*
 * Escreva um programa contendo uma Collection Stack (Pilha) de Objetos string, para organizar a retirada de livros de uma pilha. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
2: Listar todos os livros da Pilha
3: Retirar um livro da pilha 
0: O programa deve ser finalizado. 
Caso a pilha esteja vazia, ao tentar retirar um livro da pilha, o programa deverá informar que a pilha está vazia.

 */


package atividadesPraticas;

import java.util.Stack;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Stack<String> livros = new Stack<String>();
		
		int opcoes;
		String tituloLivro;
		
		System.out.println("Olá! Seja muito bem-vindo(a) ao Programa de Pilhas!");
	
		do {
			
			System.out.println("\n******************************\n");
			System.out.println("1 - Adicionar Livro na Pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da Pilha");
			System.out.println("0 - Sair \n");
			System.out.println("\n******************************\n");
			System.out.println("\nEntre com a opção desejada:\n");
			opcoes = leia.nextInt();
			leia.nextLine();
		
			
			if (opcoes == 1) {
				
				System.out.println("\nDigite o nome: \n");
				tituloLivro = leia.nextLine();
				livros.add(tituloLivro);	
				System.out.println("\nPilha: \n\n" + ((Stack<String>) livros).peek() + "\n\nLivro Adicionado!\n");
				
			} else if (opcoes == 2) {
				
				System.out.println("\nLista de Livros na Pilha: \n");
				
				Iterator<String> iterator = livros.iterator();
				
				while (iterator.hasNext()) {
					
					System.out.println(iterator.next());
				}
				
			} else if (opcoes == 3) {
				
				if (livros.isEmpty() == false) {
					
					livros.pop();
					
					System.out.println("\nPilha: \n");
					
					Iterator<String> iterator = livros.iterator();
					
					while (iterator.hasNext()) {
						
						System.out.println(iterator.next());
					}
					
					System.out.println("\nUm Livro foi retirado da pilha!");
					
				} else {
					
					System.out.println("\nA Pilha está vazia!");
					
				}
				
			} else if (opcoes > 3 || opcoes > 4) {
				
				System.out.println("\nOpção não encontrada! Tente novamente.");
				
			}
			
			
		} while (opcoes != 0);
			
		System.out.println("\nPrograma Finalizado!");
		
		leia.close();
		
	}

}
