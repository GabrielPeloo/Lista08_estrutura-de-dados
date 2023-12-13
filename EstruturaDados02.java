package listaEstruturaDados08;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class EstruturaDados02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pilha = new Stack<String>();
		String nome;
		int entrada = 1;
		Scanner leia = new Scanner(System.in);
		
		while (entrada != 0) {
		
		System.out.println("\n Digite um Número: ");
		System.out.println("\n 1 - Adicionar Livro a pilha ");
		System.out.println("\n 2 - Listar todos os Livros ");
		System.out.println("\n 3 - Retirar Livro da pilha ");
		System.out.println("\n 0 - Sair ");
		entrada = leia.nextInt(); 
		leia.nextLine();
		
		switch (entrada) {
		
		case 1:System.out.println("\n Digite um livro para adicionar: ");
			   nome = leia.nextLine();
			   pilha.add(nome);
			   System.out.println("\n Livro adicionado a pilha");
			   break;
		case 2:System.out.println(pilha);
			   break;
		case 3:pilha.pop();
			   System.out.println("\n O livro foi retirado !");
		
		}
		
		}
		System.out.println("Programa finalizado!");		
	}

}
