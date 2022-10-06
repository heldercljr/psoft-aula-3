package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class ProdutoRepository {
	
	private static ProdutoRepository instance;
	
	private List<Produto> produtos;

	private ProdutoRepository() {
		this.produtos = new ArrayList<Produto>();
	}

	public static ProdutoRepository getInstance() {
		if (instance == null)
			instance = new ProdutoRepository();
		
		return instance;
	}

	public boolean salvarProduto(Produto produto) {
		boolean result = false;

		if (!this.produtos.contains(produto))
			result = this.produtos.add(produto);

		return result;
	}

	public boolean existeProduto(Produto produto) {
		return this.produtos.contains(produto);
	}

	public boolean removerProduto(Produto produto) {
		boolean result = false;

		if (this.produtos.contains(produto))
			result = this.produtos.remove(produto);
		
		return result;
	}

	public Produto[] listarProdutos() {
		return this.produtos.toArray(new Produto[0]);
	}
}
