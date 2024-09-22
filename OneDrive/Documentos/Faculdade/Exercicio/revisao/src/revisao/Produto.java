package revisao;

public class Produto {
	private int codigo;
	protected float preco;
	private String descricao;
	
	public Produto (int codigo, float preco, String descricao) {
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override 
	public String toString() {
		return "\nCódigo: " + this.codigo + "\n"+
		"Preço: " + this.preco + "\n"+
		"Descrição: " + this.descricao;
	}

}
