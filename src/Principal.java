import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opcao=0;
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
							R1.setCodigo(leitor.nextInt());
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
							
						}else if(opcao==2) {
							Comercial C1 = new Comercial();
							System.out.print("Digite o código do imóvel: ");
							C1.setCodigo(leitor.nextInt());							
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
						}
					}
					opcao=0;
					break;
				case 2:
					break;
				case 3:
					while(opcao!=1) {
						System.out.println();
						System.out.println("Lista de imóveis cadastrados");
						for(int i=0;i<listaImovel.size();i++) {
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
