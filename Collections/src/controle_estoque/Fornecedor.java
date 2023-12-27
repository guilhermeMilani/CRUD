package controle_estoque;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor implements Gerenciavel<Produto> {
	private int id;
	private String nome;
	private List<Produto> listaProdutosFornecidos;

	public Fornecedor(int id, String nome) {
		this.id = id;
		this.nome = nome;
		this.listaProdutosFornecidos = new ArrayList<Produto>();
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

	public List<Produto> getListaProdutosFornecidos() {
		return listaProdutosFornecidos;
	}

	public void setListaProdutosFornecidos(List<Produto> listaProdutosFornecidos) {
		this.listaProdutosFornecidos = listaProdutosFornecidos;
	}

	public Produto possuiProduto(Produto prod) {
		for (Produto produto : listaProdutosFornecidos) {
			if (produto.getId() == prod.getId()) {
				return prod;
			}
		}
		return null;
	}

	@Override
	public void adicionar(Produto t) {
		listaProdutosFornecidos.add(t);
	}

	@Override
	public void remover(Produto t) {
		listaProdutosFornecidos.remove(t);
	}

	@Override
	public List<Produto> listar() {
		return this.listaProdutosFornecidos;
	}

	@Override
	public String toString() {
		return "Fornecedor [id=" + id + ", nome=" + nome + ", listaProdutosFornecidos=" + listaProdutosFornecidos + "]";
	}
}
