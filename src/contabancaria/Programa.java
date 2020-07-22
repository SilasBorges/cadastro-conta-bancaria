package contabancaria;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Conta Conta;
		System.out.println("Informe o nome do Titular: ");
		String nome = sc.nextLine();
		System.out.println("Informe o número da conta: ");
		int numeroConta = sc.nextInt();
	
		
		System.out.println("Você deseja realizar um deposito inicial? (s/n):");
		char res = sc.next().charAt(0);
		
		if(res == 's') {
			
			System.out.println("Informe o valor do deposito: ");
			double saldo = sc.nextDouble();
			
			Conta = new Conta(nome, numeroConta, saldo);
			
		}else {
			
			Conta = new Conta(nome, numeroConta);
			
		}
		
		int opcao = 1;
		
		System.out.println("Digite (1) para realizar um saque(É cobrado 5.0 por saque)\nDigite (2) para realizar um deposito\nDigite(3)para saber o saldo\nDigite(0) para finalizar");
		while(opcao != 0) {
			
			
			System.out.println("Deseja realizar alguma transação ");
			 opcao = sc.nextInt();
			
			if(opcao == 1) {
				
				System.out.println("Qual o valor do saque:");
				double saldo = sc.nextDouble();
				
				Conta.saque(saldo);
				
			}else if(opcao == 2) {
				
				System.out.println("Qual o valor do deposito:");
				double saldo = sc.nextDouble();
				
				Conta.deposito(saldo);
				
			}else if(opcao == 3) {
				
				System.out.println("Conta "+ Conta.getNumeroConta() + "\nNome " + Conta.getNome() + "\nSaldo: " + Conta.getSaldo());
			}
			else if(opcao == 0){}
			else{
				System.out.println("Operação invalida !!");
				
			}
				
			
		}
	}
}
		
		
		
		