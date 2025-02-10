/*
 * Escreva um programa contendo uma Collection Queue (Fila) de Objetos do tipo string, para organizar uma fila por ordem de chegada dos Clientes de um Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
2: Listar todos os Clientes na fila
3: Chamar (retirar) uma pessoa da fila 
0: O programa deve ser finalizado. 
Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila.
 */


package atividadesPraticas;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		
		int opcoes;
		String nome;
		
		
		System.out.println("Olá! Seja muito bem-vindo(a) ao Programa de Filas!");
	
		
		do {
			
			System.out.println("\n******************************\n");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair \n");
			System.out.println("\n******************************\n");
			System.out.println("\nEntre com a opção desejada:\n");
			opcoes = leia.nextInt();
			leia.nextLine();
			
			if (opcoes == 1) {
				
				System.out.println("\nDigite o nome: ");
				nome = leia.nextLine();
				fila.add(nome);	
				
				System.out.println("\nFila: \n\n" + ((LinkedList<String>) fila).peekLast() + "\n\nCliente Adicionado!\n");
				
			} else if (opcoes == 2) {
				
				System.out.println("\nLista de Clientes na Fila:\n");
				
				Iterator<String> iterator = fila.iterator();
				
				while (iterator.hasNext()) {
					
					System.out.println(iterator.next());
				}
				
			} else if (opcoes == 3) {
				
				if (fila.isEmpty() == false) {
					
					fila.remove();
					
					System.out.println("\nFila: \n");
					
					Iterator<String> iterator = fila.iterator();
					
					while (iterator.hasNext()) {
						
						System.out.println(iterator.next());
					}
					
					System.out.println("\nO Cliente foi Chamado!");
					
				} else {
					
					System.out.println("\nA Fila está vazia!");
					
				}
			
			} else if (opcoes > 3 || opcoes < 0){
				
				System.out.println("\nOpção não encontrada! Tente novamente.");
				
			} 
			
		} while (opcoes != 0 );
		
		System.out.println("\nPrograma Finalizado!");
		
		leia.close();

	}

}
