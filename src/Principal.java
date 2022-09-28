import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opcao=0;
		int i=0, valido=0;
		Scanner leitor = new Scanner(System.in);
		List<Imovel> listaImovel = new ArrayList<Imovel>(); 
				
		while(opcao!=4){
			System.out.println();
			System.out.println("Cadastro de Imóveis");
			System.out.println("1 - Cadastrar imóvel");
			System.out.println("2 - Excluir imóvel");
			System.out.println("3 - Listar imóveis");
			System.out.println("4 - Sair");
			System.out.print("Opção: ");
			try {
				opcao = leitor.nextInt();
			} catch (InputMismatchException e) {
				leitor.nextLine();
			}
			
			switch(opcao) {
				case 1:
					while(opcao!=3) {
						System.out.println();
						System.out.println("1 - Residencial");
						System.out.println("2 - Comercial");
						System.out.println("3 - Voltar");
						System.out.print("Digite qual imóvel deseja cadastrar: ");
						try {
							opcao = leitor.nextInt();
						} catch (InputMismatchException e) {
							leitor.nextLine();
						}
						if(opcao==1) {
							Residencial R1 = new Residencial();
							System.out.print("Digite o código do imóvel: ");
							int codigo = leitor.nextInt();
							valido=0;
							for(i=0;i<listaImovel.size();i++) {
								Imovel temp = listaImovel.get(i);
								if(temp.getCodigo()==codigo) {
									System.out.println("Imóvel já cadastrado!");
									valido=1;
									break;
								}
							}
							
							if(valido==0) {
								R1.setCodigo(codigo);
								System.out.print("Digite a localidade do imóvel: ");
								leitor.nextLine();
								R1.setLocalidade(leitor.nextLine());
								System.out.print("Digite a área do imóvel (em m²): ");
								R1.setArea(leitor.nextDouble());
								System.out.print("Digite a quantidade de banheiros: ");
								R1.setQtdBanheiro(leitor.nextInt());
								System.out.print("Digite a quantidade de quartos: ");
								R1.setQtdQuartos(leitor.nextInt());
								
								listaImovel.add(R1);
								System.out.println();
								System.out.println("Imóvel cadastrado com sucesso!");
							}

							
						}else if(opcao==2) {
							Comercial C1 = new Comercial();
							System.out.print("Digite o código do imóvel: ");
							C1.setCodigo(leitor.nextInt());
							int codigo = leitor.nextInt();
							valido=0;
							for(i=0;i<listaImovel.size();i++) {
								Imovel temp = listaImovel.get(i);
								if(temp.getCodigo()==codigo) {
									System.out.println("Imóvel já cadastrado!");
									valido=1;
									break;
								}
							}
							if(valido==0) {
								C1.setCodigo(codigo);
								System.out.print("Digite a localidade do imóvel: ");
								leitor.nextLine();
								C1.setLocalidade(leitor.nextLine());
								System.out.print("Digite a área do imóvel (em m²): ");
								C1.setArea(leitor.nextDouble());
								System.out.print("Digite o cnpj do locatário: ");
								C1.setCnpj(leitor.nextInt());
								System.out.print("Digite o número do alvará de funcionamento: ");
								C1.setCdgAlvara(leitor.nextInt());
								
								listaImovel.add(C1);
								System.out.println();
								System.out.println("Imóvel cadastrado com sucesso!");
							}

						}
					}
					opcao=0;
					break;
				case 2:
					while(opcao!=1) {
						System.out.println();
						System.out.println("Excluir imóvel");
						System.out.print("Digite o código do imóvel: ");
						int cod = leitor.nextInt();
						
						i=0;
						int apagado=0;
						while(i<listaImovel.size()) {
							Imovel temp = listaImovel.get(i);
							if(temp.getCodigo()==cod) {
								System.out.println("Imóvel " + temp.tipo + " excluido com sucesso!");
								listaImovel.remove(i);
								apagado=1;
								break;
							}else {
								i++;
							}
						}
						System.out.println();
						if(apagado==0) {
							System.out.println("Imóvel não encontrado");
						}
						System.out.print("Digite 1 para voltar: ");
						opcao = leitor.nextInt();
						
					}
					break;
				case 3:
					while(opcao!=1) {
						if(listaImovel.size()<=0) {
							System.out.println("Não existem imóveis cadastrados!");
							break;
						}
						System.out.println();
						System.out.println("Lista de imóveis cadastrados");
						for(i=0;i<listaImovel.size();i++) {
							Imovel temp = listaImovel.get(i);
							temp.ExibeImovel();
						}
						System.out.println();
						System.out.print("Digite 1 para voltar: ");
						opcao = leitor.nextInt();
					}

					
					break;
				case 4:
					System.out.println("Programa finalizado");
					break;
				default:
					System.out.println("Opção Invalida!, Por favor digite uma opção válida");
					break;
			}
			
		}
		

	}

}
