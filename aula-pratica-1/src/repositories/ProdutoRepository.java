package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class ProdutoRepository {
	
	private List<Produto> produtos;

	public ProdutoRepository() {
		this.produtos = new ArrayList<Produto>();
	}

	public boolean salvarProduto(Produto produto) {
		boolean result = false;

		if (!this.produtos.contains(produto))
			result = this.produtos.add(produto);

		return result;
	}

	public boolean consultarProduto(Produto produto) {
		return this.produtos.contains(produto);
	}

	public boolean removerProduto(Produto produto) {
		boolean result = false;

		if (this.produtos.contains(produto))
			result = this.produtos.remove(produto);
		
		return result;
	}

	public Produto[] listarProdutos() {
		return (Produto[]) this.produtos.toArray();
	}
}
