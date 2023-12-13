package listaEstruturaDados08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EstruturaDados01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> fila = new LinkedList<String>();
		String nome;
		int entrada = 1;
		Scanner leia = new Scanner(System.in);
		
		while (entrada != 0) {
		
		System.out.println("\n Digite um Número: ");
		System.out.println("\n 1 - Adicionar Cliente a fila ");
		System.out.println("\n 2 - Listar todos os Clientes ");
		System.out.println("\n 3 - Retirar Cliente da fila ");
		System.out.println("\n 0 - Sair ");
		entrada = leia.nextInt(); 
		leia.nextLine();
		
		switch (entrada) {
		
		case 1:System.out.println("\n Digite um nome para adicionar: ");
			   nome = leia.nextLine();
			   fila.add(nome);
			   System.out.println("\n Cliente "+nome+" adicionado a fila");
			   break;
		case 2:System.out.println(fila);
			   break;
		case 3:fila.remove();
			   System.out.println("\n Cliente foi chamado !");
		
		}
		
		}
		System.out.println("Programa finalizado!");		
	}

}
