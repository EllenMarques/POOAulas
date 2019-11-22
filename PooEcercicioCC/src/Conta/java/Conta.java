package Conta.java;



public class Conta {
	public String cliente;
	private String cpf;
	public Integer numeroDaConta;
	protected Double saldo;
	protected Double limite;
	
	public Conta (String cliente, String cpf, Double saldo, Integer numeroDaConta, Double limite) {
		this.cliente = cliente;
		this.cpf = cpf;
		this.saldo = saldo;
		this.numeroDaConta = numeroDaConta;
		this.limite = limite;
	}
		
	public void imprimirSaldo() {
		System.out.println("Saldo: " + this.saldo);
	}
	
	public void ImprimirExtrato (){ 
		System.out.println("Cliente: " + this.cliente);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Numero da conta: " + this.numeroDaConta);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Limite: " + this.limite);
	}
	
	
	public void deposito(Double deposito) {
		this.saldo += deposito;
		System.out.println("Depósito no valor de R$" + deposito);
	}
	
	public void saque(Double saque) {
		if (this.saldo < saque) {
			System.out.println("O saldo não é suficiente para realizar a operação.");
		} else {			
			this.saldo -= saque;
			System.out.println("Saque no valor de R$" + saque);
		}
	}

	public void transferencia(Conta contaReceptora, Double valorTransferencia){
		if (this.saldo < valorTransferencia) {
			System.out.println("O saldo não é suficiente para realizar a operação.");
		} else {
			this.saque(valorTransferencia);
			contaReceptora.deposito(valorTransferencia);
		}
	}
}
