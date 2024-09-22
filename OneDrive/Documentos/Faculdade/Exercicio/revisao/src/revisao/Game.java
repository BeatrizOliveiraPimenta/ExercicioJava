package revisao;

public class Game extends Produto implements Caixa{
	public Game (int codigo, float preco, String descricao) {
		super (codigo, preco, descricao);
	}
	@Override 
	public float calculaDesconto() {
		float precoFinal = preco - (preco * 0.15f);
		return precoFinal;
	}
	public String toString() {
		return super.toString() + "\nPreço final: " + calculaDesconto();
	}
}
