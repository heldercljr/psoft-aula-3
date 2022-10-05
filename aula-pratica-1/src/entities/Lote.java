package entities;

import java.util.Date;

public class Lote {
	
	private Produto produto;
	private Integer quantidade;
	private Date dataDeValidade;

	public Lote(Produto produto, Integer quantidade, Date dataDeValidade) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.dataDeValidade = dataDeValidade;
	}

	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Date getDataDeValidade() {
		return this.dataDeValidade;
	}

	public void setDataDeValidade(Date dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}

	@Override
	public String toString() {
		return "Lote [ produto = " + produto.getNome() + ", quantidade = " + quantidade + ", dataDeValidade = " + dataDeValidade + " ]";
	}
}
