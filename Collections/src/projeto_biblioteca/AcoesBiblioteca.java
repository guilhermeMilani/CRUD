package projeto_biblioteca;

import java.util.List;

public interface AcoesBiblioteca {
	public void adicionarLivro(Livro livro);
	public void removerLivro(Livro livro);
	public String procurarLivro(String titulo);
	public List<Livro> listarLivros();
}
