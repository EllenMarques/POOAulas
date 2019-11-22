package Conta.java;

public class DadosConta {
	public static void main (String[] args) {
		
		Conta contaEllen = new Conta("Ellen Marques", "08108208336", 0.0, 1234, 200.0);
		
		contaEllen.ImprimirExtrato();
		System.out.println("-----------------------------------------");
		contaEllen.imprimirSaldo();
		System.out.println("-----------------------------------------");
		contaEllen.saque(200.0);
		System.out.println("-----------------------------------------");
		contaEllen.deposito(200.0);
		System.out.println("-----------------------------------------");
		contaEllen.imprimirSaldo();
		System.out.println("-----------------------------------------");
		contaEllen.saque(150.0);
		System.out.println("-----------------------------------------");
		contaEllen.imprimirSaldo();
		System.out.println("-----------------------------------------");
		contaEllen.saque(100.0);
	}
}
