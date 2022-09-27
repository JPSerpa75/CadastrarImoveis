public class Comercial extends Imovel {
	private int cnpj, cdgAlvara;
	
	public Comercial() {
		this.tipo = "Comercial";
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getCdgAlvara() {
		return cdgAlvara;
	}

	public void setCdgAlvara(int cdgAlvara) {
		this.cdgAlvara = cdgAlvara;
	}
	
	public void ExibeImovel() {
		super.ExibeImovel();
		System.out.println("CNPJ do locatário: " + this.cnpj);
		System.out.println("Número do alvará de funcionamento: " + this.cdgAlvara);
	}
	
}
