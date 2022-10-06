package services;

import entities.Produto;

import repositories.ProdutoRepository;

public class ProdutoService {

	private ProdutoRepository produtoRepository;

	public ProdutoService() {
		this.produtoRepository = ProdutoRepository.getInstance();
	}

	public boolean adicionarProduto(String nome, String fabricante, Double preco) {
		Produto novoProduto = new Produto(nome, fabricante, preco);

		return this.produtoRepository.salvarProduto(novoProduto);
	}

	public boolean excluirProduto(String nome, String fabricante, Double preco) {
		Produto produto = new Produto(nome, fabricante, preco);

		return this.produtoRepository.removerProduto(produto);
	}

	public String listarProdutos() {
		Produto[] produtos = this.produtoRepository.listarProdutos();
		String listaDeProdutos = new String();

		for (int i = 0; i < produtos.length; i++)
			listaDeProdutos += produtos[i].toString() + "\n";

		return listaDeProdutos;
	}
}
