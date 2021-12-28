
public class ContaCorrente extends Conta {
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato de Conta Corrente ===");
		super.imprimirInfosComuns();
		
	}
}