package br.com.gerenciador;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) throws Exception {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turini",12345);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Willian de Freitas", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println(javaColecoes.getAlunos());
		System.out.println("Quem é o aluno com matricula 5617?");
		Aluno alunoM = javaColecoes.buscaMatriculado(5617);
		System.out.println(alunoM);
	}
}
