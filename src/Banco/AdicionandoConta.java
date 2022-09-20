package Banco;
import java.util.Scanner;

import Contas.ContaCorrente;
import Contas.ContaPouoanca;
import Contas.Conta;


public class AdicionandoConta {
	public Conta adicionarConta() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Olá, Criando sua conta bancaria");
		System.out.println("Digite o nome do titular: ");
		String titular = scan.next();
		
		System.out.println("Em qual agência abrirá sua conta?");
		String agencia = scan.next();
		
		System.out.println("\nDigite 1 para criar uma conta corrente");
		System.out.println("Digite 2 para criar uma conta poupanca");
		int opcao = scan.nextInt();
		
		if (opcao == 1) {
			ContaCorrente conta = new ContaCorrente(agencia, "Corrente", titular);
			System.out.println(conta.getTipo()+" criada com sucesso\n");
			return conta;
			
		} else {
			ContaPouoanca conta = new ContaPouoanca(agencia, "Poupança", titular);
			System.out.println(conta.getTipo()+" criada com sucesso\n");
			return conta; }

	
	
	
			
	}
}
