package Poo;



public abstract class Pessoa {
	public String nome;
	public String email;
	
	@Override
	public String toString( ) {
		return email + " -- "  + nome;
	}
	
	public Pessoa(String nome, String email) {
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
