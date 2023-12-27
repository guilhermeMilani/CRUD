package controle_estoque;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	private List<Produto> produtosEmEstoque;
	//private List<Fornecedor> listaDeFornecedores;
	private Loja loja;

	public Estoque() {
		this.produtosEmEstoque = new ArrayList<Produto>();
		//this.listaDeFornecedores = new ArrayList<Fornecedor>();
	}
	public Estoque(Loja loja) {
		this.produtosEmEstoque = new ArrayList<Produto>();
		this.loja = loja;
		//this.listaDeFornecedores = new ArrayList<Fornecedor>();
	}

	public List<Produto> getProdutosEmEstoque() {
		return produtosEmEstoque;
	}

	public void setProdutosEmEstoque(List<Produto> produtosEmEstoque) {
		this.produtosEmEstoque = produtosEmEstoque;
	}

//	public void adicionarProdutoEstoque(Produto prod, int qtd) {
//		boolean existe = false;
//		for (Fornecedor fornecedor : listaDeFornecedores) {
//			if (fornecedor.possuiProduto(prod) != null) {
//				for (Produto produto : produtosEmEstoque) {
//					if (produto.getId() == prod.getId()) {
//						produto.setQtd_estoque(produto.getQtd_estoque() + qtd);
//						existe = true;
//					}
//				}
//				if (qtd > 0 && existe == false) {
//					prod.setQtd_estoque(qtd);
//					produtosEmEstoque.add(prod);
//				}
//			}
//		}
//
//	}
	
	public void adicionarProdutoEstoque(Produto prod, int qtd) {
		boolean existe = false;
		List<Fornecedor> fornecedores = loja.getListaDeFornecedores();
		for (Fornecedor fornecedor : fornecedores) {
			if (fornecedor.possuiProduto(prod) != null) {
				for (Produto produto : produtosEmEstoque) {
					if (produto.getId() == prod.getId()) {
						produto.setQtd_estoque(produto.getQtd_estoque() + qtd);
						existe = true;
					}
				}
				if (qtd > 0 && existe == false) {
					prod.setQtd_estoque(qtd);
					produtosEmEstoque.add(prod);
				}
			}
		}

	}

	public void removerProdutoEstoque(Produto prod, int qtd) {
		for (Produto produto : produtosEmEstoque) {
			if (produto.getId() == prod.getId()) {
				if (produto.getQtd_estoque() >= qtd && qtd > 0) {
					produto.setQtd_estoque(produto.getQtd_estoque() - qtd);
				}
			}
		}
	}

	public List<Produto> listarProdutosEmEstoque() {
		return this.produtosEmEstoque;
	}

	public String buscarProdutoPorNome(String nome) {
		for (Produto produto : produtosEmEstoque) {
			if (produto.getNome().equals(nome)) {
				return "Produto encontrado";
			}
		}
		return "Produto não encontrado";
	}

	@Override
	public String toString() {
		return "Estoque [produtosEmEstoque=" + produtosEmEstoque + "]";
	}
}
