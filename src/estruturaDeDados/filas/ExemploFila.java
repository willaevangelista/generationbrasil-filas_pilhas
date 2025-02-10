package estruturaDeDados.filas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class ExemploFila {

	public static void main(String[] args) {
		// Exemplo Pratico de Aplicacao de Fila
		// LIFO (Last In, First Out (primeiro que entra, primeiro que sai)
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Jacque");
		fila.add("Eliane");
		fila.add("Sandra");
		
		System.out.println(fila);
		
		fila.remove(); // remove a 1º pessoa da fila
		//fila.clear(); zera/limpa a fila inteira
		System.out.println(fila); 
		
		System.out.println(fila.size());
		
		System.out.println("Proóxima pessoa da fila " + fila.peek()); // exibe a proxima pessoa da fila
		System.out.println(fila); 
		
		System.out.println("Último Atendimento: " + fila.poll()); // mostra ultimo atendido e o remove da lista
		System.out.println(fila); 
		
		fila.add("Ana");
		fila.add("Gaby");
		fila.add("Mariana");
		fila.add("Willa");
		
		System.out.println(fila);
		
		Iterator<String> iterator = fila.iterator();
		
		while (iterator.hasNext()) {
			
			System.out.println("Próximo atendimento: " + iterator.next());
			//System.out.println("Próximo atendimento: " + fila.poll());
			
		}
		
		System.out.println(fila);
		

	}

}
