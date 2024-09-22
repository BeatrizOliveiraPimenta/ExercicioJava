package revisao;

public class Livro extends Produto implements Caixa {
	private String autor;
	public Livro (int codigo, float preco, String descricao, String autor) {
		super(codigo, preco, descricao);
		this.autor = autor;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public float calculaDesconto() {
		float precoFinal = preco - (preco * 0.10f);
		return precoFinal;
	}
	public String toString() {
		return super.toString() + "\nAutor: " + this.autor + "\nPreço Final: " + calculaDesconto();
	}

}
