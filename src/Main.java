
public class Main {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca();
		cc.transferir(80, poupanca);
		
		cc.imprimirExtrato();
		System.out.println();
		poupanca.imprimirExtrato();
	}

}
