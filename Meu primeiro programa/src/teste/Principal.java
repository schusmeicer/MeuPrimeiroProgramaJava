package teste;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		System.out.println("ola amigo!\nQual � o seu nome?"); // uso o println (print ln pula linhas)
	
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		System.out.printf("Ol� %s\n", nome);
	}

}

