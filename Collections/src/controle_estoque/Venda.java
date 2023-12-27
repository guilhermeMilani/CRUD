package controle_estoque;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	private int id;
	private String data;
	private List<Produto> produtosVendidos;
	private double totalVenda;

	public Venda(int id, String data) {
		super();
		this.id = id;
		this.data = data;
		this.produtosVendidos = new ArrayList<Produto>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<Produto> getProdutosVendidos() {
		return produtosVendidos;
	}

	public void setProdutosVendidos(List<Produto> produtosVendidos) {
		this.produtosVendidos = produtosVendidos;
	}

	public double getTotalVenda() {
		return totalVenda;
	}

	public void setTotalVenda(double totalVenda) {
		this.totalVenda = totalVenda;
	}

	public void adicionarItemVenda(Produto prod, int qtd) {
		if (qtd > 0 && prod.getQtd_estoque() >= qtd) {
			produtosVendidos.add(prod);
			prod.setQtd_estoque(prod.getQtd_estoque() - qtd);
		}
		totalVenda += prod.getPreco() * qtd;
	}

	public double calcularTotalVenda() {
		return this.totalVenda;
	}

	@Override
	public String toString() {
		return "Venda [id=" + id + ", data=" + data + ", produtosVendidos=" + produtosVendidos + ", totalVenda="
				+ totalVenda + "]";
	}

}
