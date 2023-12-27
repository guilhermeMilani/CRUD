package controle_estoque;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	private String nome;
	private Estoque estoque;
	private List<Fornecedor> listaDeFornecedores;
	private List<Venda> listaDeVendas;

	public Loja(String nome, Estoque estoque) {
		super();
		this.nome = nome;
		this.estoque = estoque;
		this.listaDeFornecedores = new ArrayList<Fornecedor>();
		this.listaDeVendas = new ArrayList<Venda>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public List<Fornecedor> getListaDeFornecedores() {
		return listaDeFornecedores;
	}

	public void setListaDeFornecedores(List<Fornecedor> listaDeFornecedores) {
		this.listaDeFornecedores = listaDeFornecedores;
	}

	public List<Venda> getListaDeVendas() {
		return listaDeVendas;
	}

	public void setListaDeVendas(List<Venda> listaDeVendas) {
		this.listaDeVendas = listaDeVendas;
	}

	public void adicionarFornecedor(Fornecedor fornecedor) {
		listaDeFornecedores.add(fornecedor);
	}

	public void removerFornecedor(Fornecedor fornecedor) {
		listaDeFornecedores.remove(fornecedor);
	}

	public void adicionarVenda(Venda venda) {
		listaDeVendas.add(venda);
	}

}
