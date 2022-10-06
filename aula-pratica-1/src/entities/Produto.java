package entities;

public class Produto {

	private String nome;
	private String fabricante;
	private Double preco;

	public Produto(String nome, String fabricante, Double preco) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.preco = preco;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return this.fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Double getPreco() {
		return this.preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [ nome = " + nome + ", fabricante = " + fabricante + ", preço = " + preco + " ]";
	}
}
