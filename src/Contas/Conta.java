package Contas;

public class Conta implements Operacoes {

	private static int sequencia = 0;
	protected String agencia;
	protected int numero;
	protected double saldo = 0;
	protected String tipo;
	protected String titular;
	
	public Conta(String agencia, String tipo, String titular) {
		this.numero = sequencia++;
		this.agencia = agencia;
		if (tipo =="Corrente") {
			this.tipo = "Conta Corrente";
		} else if(tipo =="Poupança") {
			this.tipo = "Conta Poupança";
		}
		this.titular = titular;
	}
	
	
	public String getTitular() {
		return titular;
	}

	public String getTipo() {
		return tipo;
	}

	public String getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public void imprimirExtrato() {
		 System.out.println("\nTitular: "+ this.titular);
	 	   System.out.println("Agencia: "+ this.agencia);
		    System.out.println("Numero: "+ this.numero);
		     System.out.println("Saldo: "+ this.saldo);
	}


	@Override
	public void sacar(Double valor) {
		
		
	}


	
	public void tranferir(double valor, Conta contaDestino) {
		
	}
	
	

}
