package Poo;

public class Professor extends Pessoa {
	
	public Professor(String nome, String email) {
		super(nome, email);
	
	}

	public Double salario;
	
	public void Pessoa(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
	
	public String getNome() {
		return nome;
	}

}
