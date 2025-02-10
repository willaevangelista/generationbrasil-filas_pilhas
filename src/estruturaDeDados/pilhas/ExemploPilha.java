package estruturaDeDados.pilhas;

import java.util.Stack;

public class ExemploPilha {

	public static void main(String[] args) {
		// PILHA - Last In, First Out
		
		// PUSH -> inserir elemento da fila
				
		// POP -> tirar elemento da fila
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Najla");
		pilha.push("Carol");
		pilha.push("Daniele");
		System.out.println(pilha);

		System.out.println(pilha.pop());
		System.out.println(pilha);
		
		System.out.println(pilha.contains("Carol"));
				
		//ForEach
		
		for (String nome : pilha) { //Criar uma string chamada nome a partir da pilha
			
			System.out.println("O nome " + nome + " está na pilha.");
			
		}

	}

}
