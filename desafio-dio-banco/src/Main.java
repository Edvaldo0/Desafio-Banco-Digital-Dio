
public class Main {
	
	public static void main(String[] args) {
		Cliente Edvaldo = new Cliente();
		Edvaldo.setNome("Edvaldo");
		
		
		Conta cc = new ContaCorrente(Edvaldo);
		Conta poupanca = new ContaPoupança(Edvaldo);
		
	
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
