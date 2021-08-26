package br.com.gerenciador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulasMutaveis);
		System.out.println(aulasMutaveis);
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
		

	}

}
