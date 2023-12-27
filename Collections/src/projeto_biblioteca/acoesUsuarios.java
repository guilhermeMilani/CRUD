package projeto_biblioteca;

public interface acoesUsuarios {
	public boolean alugarLivro(Livro livro, Usuario usuario);
	public boolean realizarDevolucao(Livro livro, Usuario usuario);
}
