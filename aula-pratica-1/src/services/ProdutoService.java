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

	public Produto[] listarProdutos() {
		return this.produtoRepository.listarProdutos();
	}
}
