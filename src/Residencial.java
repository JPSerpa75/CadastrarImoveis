public class Residencial extends Imovel {
	private int qtdBanheiro, qtdQuartos;
	
	public Residencial() {
		this.tipo = "Residencial";
	}

	public int getQtdBanheiro() {
		return qtdBanheiro;
	}

	public void setQtdBanheiro(int qtdBanheiro) {
		this.qtdBanheiro = qtdBanheiro;
	}

	public int getQtdQuartos() {
		return qtdQuartos;
	}

	public void setQtdQuartos(int qtdQuartos) {
		this.qtdQuartos = qtdQuartos;
	}
	
	public void ExibeImovel() {
		super.ExibeImovel();
		System.out.println("Quantidade de banheiros: " + this.qtdBanheiro);
		System.out.println("Quantidade de quartos: " + this.qtdQuartos);
	}
	
}
