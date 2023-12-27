package projeto_biblioteca;

public class Projeto {
	public static void main(String[] args) {

		Biblioteca bluLivros = new Biblioteca(null);
		Usuario usu1 = new Usuario("Guilherme", 20, "M");

		Livro l1 = new Livro("A obra de natal", "Eduardo", 2018, 222, true);
		Livro l2 = new Livro("A arca de noe", "José", 2022, 203, true);
		Livro l3 = new Livro("O pequeno principe", "Roberto", 2010, 90, true);
		Livro l4 = new Livro("Como treinar o seu dragão", "Alessandra", 2023, 322, true);
		Livro l5 = new Livro("O milagre da manha", "Eduarda", 1999, 200, true);
		Livro l6 = new Livro("Biblia", "Desconhecido", 2000, 813, true);

		bluLivros.adicionarLivro(l1);
		bluLivros.adicionarLivro(l2);
		bluLivros.adicionarLivro(l3);
		bluLivros.adicionarLivro(l4);
		bluLivros.adicionarLivro(l5);
		bluLivros.adicionarLivro(l6);

		// System.out.println(bluLivros.procurarLivro("A obra de natal"));
		System.out.println(usu1.alugarLivro(l6, usu1));
		System.out.println(l6);
		System.out.println(usu1.realizarDevolucao(l6, usu1));
		System.out.println(l6);
		System.out.println(bluLivros.listarLivros());

	}
}
