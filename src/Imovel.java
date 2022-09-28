import java.util.List;

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

	public int verificaCodigo(int codigo, List<Imovel> listaImoveis) {
		int valido=0;
		for(int i=0;i<listaImoveis.size();i++) {
			Imovel temp = listaImoveis.get(i);
			if(temp.getCodigo()==codigo) {
				System.out.println("Imóvel já cadastrado!");
				valido=1;
				break;
			}
		}
		return valido;
	}
	
}
