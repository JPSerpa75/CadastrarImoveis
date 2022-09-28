
public class Imovel {
	private int codigo;
	private Double area;
	protected String tipo, localidade;

	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	
	public void ExibeImovel() {
		System.out.println();
		System.out.println("Tipo do imóvel: " + this.tipo);
		System.out.println("Código: " + this.codigo);
		System.out.println("Localidade: " + this.localidade);
		System.out.println("Área: " + this.area +"m²");
	}

	
}
