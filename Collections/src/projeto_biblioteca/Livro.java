package projeto_biblioteca;

public class Livro {
	private String titulo;
	private String autor;
	private int anoPubli;
	private int numPag;
	private boolean disponivel;

	public Livro(String titulo, String autor, int anoPubli, int numPag, boolean disponivel) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoPubli = anoPubli;
		this.numPag = numPag;
		this.disponivel = disponivel;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPubli() {
		return anoPubli;
	}

	public void setAnoPubli(int anoPubli) {
		this.anoPubli = anoPubli;
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", anoPubli=" + anoPubli + ", numPag=" + numPag
				+ ", disponivel=" + disponivel + "]";
	}
}
