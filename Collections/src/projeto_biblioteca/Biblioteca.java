package projeto_biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Biblioteca implements AcoesBiblioteca {
	public Livro livro;
	List<Livro> livrosArmazenados;

	public Biblioteca(List<Livro> livrosArmazenados) {
		this.livrosArmazenados = new ArrayList<Livro>();
	}

	@Override
	public void adicionarLivro(Livro livro) {
		livrosArmazenados.add(livro);
	}

	@Override
	public void removerLivro(Livro livro) {
		livrosArmazenados.remove(livro);
	}
	@Override
	public List<Livro> listarLivros() {
		return this.livrosArmazenados;
	}

	@Override
	public String procurarLivro(String titulo) {
		for (Livro livro : livrosArmazenados) {
			if (livro.getTitulo().equals(titulo)) {
				return "Livro encontrado!";
			}
		}
			return "Livro não encontrado!";
	}

	@Override
	public int hashCode() {
		return Objects.hash(livro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Biblioteca other = (Biblioteca) obj;
		return Objects.equals(livro, other.livro);
	}
	
	
}
