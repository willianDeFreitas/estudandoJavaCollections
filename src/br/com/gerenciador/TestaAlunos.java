package br.com.gerenciador;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo");
		alunos.add("Alberto");
		alunos.add("Nico");
		alunos.add("Sergio");
		alunos.add("Renan");
		alunos.add("Mauricio");
		
		boolean contemPaulo = alunos.contains("Paulo");
		System.out.println(contemPaulo);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println(alunos);
		
	}

}
