package controle_estoque;

public class Programa {
	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		
		Loja minhaLoja = new Loja("Vale Ofertas", estoque);
		
		estoque = new Estoque(minhaLoja);
		
		Produto prod1 = new Produto(1, "Celular", 800.50);
		Produto prod2 = new Produto(2, "SmartWatch", 400.99);
		Produto prod3 = new Produto(3, "Tablet", 300);
		
		Fornecedor fornecedor1 = new Fornecedor(1, "Magazine Luiza");
		fornecedor1.adicionar(prod3);
		
		Fornecedor fornecedor2 = new Fornecedor(2, "Shopee");
		fornecedor2.adicionar(prod2);
		fornecedor2.adicionar(prod1);
		
		minhaLoja.adicionarFornecedor(fornecedor1);
		minhaLoja.adicionarFornecedor(fornecedor2);
		System.out.println(minhaLoja.getListaDeFornecedores());
		
		estoque.adicionarProdutoEstoque(prod3, 10);
		estoque.adicionarProdutoEstoque(prod1, 10);
		System.out.println(minhaLoja.getListaDeFornecedores());
		
		Venda venda = new Venda(0, "05/10/2020");
		
		System.out.println(estoque.listarProdutosEmEstoque());
		
		venda.adicionarItemVenda(prod3, 2);
		venda.adicionarItemVenda(prod1, 1);
		
		System.out.println(venda.calcularTotalVenda());
		
		System.out.println(estoque.listarProdutosEmEstoque());
		
		System.out.println(minhaLoja.getListaDeVendas());
		
		
	}
}
