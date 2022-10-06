package facades;

import java.util.Date;

import entities.Produto;

import services.LoteService;
import services.ProdutoService;

public class ProdutoLoteFacade {
	
	private ProdutoService produtoService;
	private LoteService loteService;

	public ProdutoLoteFacade() {
		this.produtoService = new ProdutoService();
		this.loteService = new LoteService();
	}

	public boolean adicionarNovoProduto(String nome, String fabricante, Double preco) {
		return this.produtoService.adicionarProduto(nome, fabricante, preco);
	}

	public boolean adicionarNovoLote(Produto produto, Integer quantidade, Date dataDeValidade) {
		return this.loteService.adicionarLote(produto, quantidade, dataDeValidade);
	}

	public boolean removerProdutoExistente(String nome, String fabricante, Double preco) {
		return this.produtoService.excluirProduto(nome, fabricante, preco);
	}

	public boolean removerLoteExistente(Produto produto, Integer quantidade, Date dataDeValidade) {
		return this.loteService.excluirLote(produto, quantidade, dataDeValidade);
	}

	public String listarTodosOsProdutos() {
		return this.produtoService.listarProdutos();		
	}

	public String listarTodosOsLotes() {
		return this.loteService.listarLotes();
	}
}
