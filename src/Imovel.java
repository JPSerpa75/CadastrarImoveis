
public class Imovel {
	private Double area;
	protected String tipo, localidade;

	
	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	
	public void ExibeImovel() {
		System.out.println();
		System.out.println("Tipo do imóvel: " + this.tipo);
		System.out.println("Localidade: " + this.localidade);
		System.out.println("Área: " + this.area +"m²");
	}

	
}
