package services;

import java.util.Date;

import entities.Lote;
import entities.Produto;

import repositories.LoteRepository;
import repositories.ProdutoRepository;

public class LoteService {

	private LoteRepository loteRepository;
	private ProdutoRepository produtoRepository;

	public LoteService() {
		this.loteRepository = new LoteRepository();
		this.produtoRepository = ProdutoRepository.getInstance();
	}

	public boolean adicionarLote(Produto produto, Integer quantidade, Date dataDeValidade) {
		boolean result = false;

		if (this.produtoRepository.existeProduto(produto)) {
			Lote novoLote = new Lote(produto, quantidade, dataDeValidade);

			result = this.loteRepository.salvarLote(novoLote);
		}

		return result;
	}

	public boolean excluirLote(Produto produto, Integer quantidade, Date dataDeValidade) {
		boolean result = false;

		if (this.produtoRepository.existeProduto(produto)) {
			Lote lote = new Lote(produto, quantidade, dataDeValidade);

			result = this.loteRepository.removerLote(lote);
		}

		return result;
	}

	public String listarLotes() {
		Lote[] lotes = this.loteRepository.listarLotes();
		String listaDeLotes = new String();

		for (int i = 0; i < lotes.length; i++)
			listaDeLotes += lotes[i].toString() + "\n";
		
		return listaDeLotes;
	}
}
