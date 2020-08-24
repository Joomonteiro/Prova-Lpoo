package provalpoo2;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
	
Scanner teclado = new Scanner(System.in);
		
		int n = 1;
		int controle;
		int opcao;
		String numero;
		String agencia;
		String nomeagencia;
		String nome;
		double saldo;
		String cpf;
		ContaCorrente c;
		Poupanca2 p;
		ArrayList<Conta2> contas= new ArrayList<Conta2>();
		
		double deposito;
		
		while(n != 0) {
			System.out.println("Digite a opção desejada: ");
			System.out.println("1 - Cadastrar Conta");
			System.out.println("2 - Realizar depósito (procurar pelo CPF do cliente)");
			System.out.println("3 - Render Juros (Poupanca)");
			System.out.println("4 - Consultar dados de cliente (Digite o nome e número da Agência do cliente) ");
			System.out.println("5 - Alterar o número e nome da agência (buscar pelo nome do cliente) ");
			System.out.println("0 - Sair");
			
			controle = teclado.nextInt();
			switch(controle) {
			case 1:
				System.out.println(contas.size());
				if(contas.size()<10) {
					System.out.println("Digite a opção que quer escolher:");
					System.out.println("1 - ContaCorrente");
					System.out.println("2 - Poupança");
					teclado.nextLine();
					opcao = teclado.nextInt();
					if (opcao==1) {
						System.out.println("Digite o nome: ");
						teclado.nextLine();
						nome = teclado.nextLine();
						System.out.println("Digite o número da agencia: ");
						agencia = teclado.nextLine();
						System.out.println("Digite o nome da agencia: ");
						nomeagencia = teclado.nextLine();
						System.out.println("Digite o numero: : ");
						numero = teclado.nextLine();
						System.out.println("Digite o saldo: ");
						saldo = teclado.nextDouble();
						System.out.println("Digite o cpf: ");
						teclado.nextLine();
						cpf = teclado.nextLine();
						c = new ContaCorrente(numero, agencia,nomeagencia, nome, saldo,cpf);
						contas.add(c);
					}
					if(opcao==2) {
						System.out.println("Digite o nome: ");
						teclado.nextLine();
						nome = teclado.nextLine();
						System.out.println("Digite o número da agencia: ");
						agencia = teclado.nextLine();
						System.out.println("Digite o nome da agencia: ");
						nomeagencia = teclado.nextLine();
						System.out.println("Digite o numero: : ");
						numero = teclado.nextLine();
						System.out.println("Digite o saldo: ");
						saldo = teclado.nextDouble();
						System.out.println("Digite o cpf: ");
						teclado.nextLine();
						cpf = teclado.nextLine();
						p = new Poupanca2(numero, agencia, nomeagencia, nome, saldo,cpf);
						contas.add(p);
					}
				}else {
					System.out.println("Limite máximo de clientes atingidos!");
				}
				
				break;
			case 2:
				
				
				System.out.println("Digite o cpf do cliente: ");
				teclado.nextLine();
				cpf = teclado.nextLine();
				for(Conta2 c1: contas) {
					System.out.println(c1);
					if(c1.getCpf().equals(cpf)) {
						System.out.println("Digite o valor a ser depositado: ");
						deposito = teclado.nextDouble();
						c1.realizadeposito(deposito);
						}
					}
				
				break;
			case 3:
				System.out.println("Digite o CPF do cliente: ");
				teclado.nextLine();
				nome = teclado.nextLine();
				for(Conta2 c1: contas) {
					if(c1.getCpf().equals(nome)) {
						
						if(c1.getClass().getName()=="provalpoo2.Poupanca2") {
						
							c1.renderjuros();
							System.out.println(c1.getSaldo());
						}else {
							System.out.println("Não é uma poupança, somente a conta do tipo poupança pode render juros");
						}
						}
				}
				break;
			case 4:
				System.out.println("Digite o número da agência do cliente: ");
				teclado.nextLine();
				agencia = teclado.nextLine();
				System.out.println("Digite nome da agência da conta do cliente: ");
				nomeagencia = teclado.nextLine();
				for(Conta2 c1: contas) {
					if(c1.getAgencia().equals(agencia)&& c1.getNomeagencia().equals(nomeagencia)) {
						System.out.println("Seguem os dados do cliente (Nome e CPF):");
						System.out.println(c1.getNome());
						System.out.println(c1.getCpf());				
					}
				}
				break;
			case 5:
				System.out.println("Digite o nome do cliente: ");
				teclado.nextLine();
				nome = teclado.nextLine();
				for(Conta2 c1: contas) {
					if(c1.getNome().equals(nome)) {
						System.out.println("Digite o novo número da agência:");
						agencia = teclado.nextLine();
						System.out.println("Digite a nova agencia do cliente (digite o nome da nova agencia):");
						nomeagencia = teclado.nextLine();
						c1.setAgencia(agencia);
						c1.setNomeagencia(nomeagencia);
					}
				}
				break;
			case 0:
				n = 0;
				break;
			
			}
			
		}
		
		teclado.close();
	}


	}

