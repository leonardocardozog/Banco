package Contas;




public class BancoMain {
	
	public static void main(String[] args) {
	        Conta cc = new ContaCorrente(null, null, null);
	        cc.depositar(100);

	        Conta cp = new ContaPouoanca(null, null, null);
	        cc.transferir(50,cp);

	        cc.imprimirExtrato();
	        cp.imprimirExtrato();
		
		
		
		
		
		
		
		
		
		
		
	}

}
