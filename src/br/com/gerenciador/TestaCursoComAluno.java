package br.com.gerenciador;

public class TestaCursoComAluno {

	public static void main(String[] args) throws Exception {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turini","12345");
		Aluno a2 = new Aluno("Guilherme Silveira", "5617");
		Aluno a3 = new Aluno("Willian de Freitas", "17645");
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println(javaColecoes.estaMatriculado(a1));
	}
}
