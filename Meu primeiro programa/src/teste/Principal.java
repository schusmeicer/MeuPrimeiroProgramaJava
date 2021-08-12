package teste;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		System.out.println("ola amigo!\nQual é o seu nome?"); // uso o println (print ln pula linhas)
		
		Scanner in = new Scanner(System.in);
		// Este codigo serve para cirar o objeto
		String nome = in.nextLine();
		System.out.printf("Olá %s\n", nome);
		// outro teste
		String a = "Weslley";
		// este codigo serve para printar o nome
		// alteração para simular merge
		String b = "Errado";
	}

}

