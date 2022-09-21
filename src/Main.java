
public class Main {

	public static void main(String[] args) {
		Cliente marcelo = new Cliente();
		marcelo.setNome("Marcelo");
		
		Conta cc = new ContaCorrente(marcelo);
		Conta poupanca = new ContaPoupanca(marcelo);

		cc.depositar(800);
		cc.transferir(600, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
