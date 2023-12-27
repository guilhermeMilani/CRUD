package controle_estoque;

public class Produto {
	private int id;
	private String nome;
	private double preco;
	private int qtd_estoque;

	public Produto(int id, String nome, double preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.qtd_estoque = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd_estoque() {
		return qtd_estoque;
	}

	public void setQtd_estoque(int qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}

	public void adicionar(int qtd) {
		qtd_estoque += qtd;
	}

	public void remover(int qtd) {
		qtd_estoque -= qtd;
		if (qtd_estoque < 0) {
			qtd_estoque = 0;
		}
	}
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + ", qtd_estoque=" + qtd_estoque + "]";
	}
}
