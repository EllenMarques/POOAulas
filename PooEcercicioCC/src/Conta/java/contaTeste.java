package Conta.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class contaTeste {
	
	Conta contaTeste = new Conta("Teste", "08108208336", 0.0, 1234, 200.0);
	Conta contaTeste2 = new Conta("Teste2", "08108208336", 200.0, 1234, 200.0);

	@Test
	void depositoTest() {
		contaTeste.deposito(250.0);
		
		assertEquals(250.0, contaTeste.saldo);
	}
	
	@Test
	void saqueTest() {
		contaTeste.deposito(250.0);
		contaTeste.saque(150.0);
		
		assertEquals(100.0, contaTeste.saldo);
	}
	
	@Test
	void tranferenciaTeste() {
		contaTeste2.transferencia(contaTeste, 100.0);
		
		assertEquals(100.0, contaTeste2.saldo);
		assertEquals(100.0, contaTeste.saldo);
	}

}
