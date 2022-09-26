public class Comercial extends Imovel {
	private int cnpj, contrato;
	
	public Comercial() {
		this.tipo = "Comercial";
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getContrato() {
		return contrato;
	}

	public void setContrato(int contrato) {
		this.contrato = contrato;
	}
	
}
