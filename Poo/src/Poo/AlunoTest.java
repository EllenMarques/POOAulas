package Poo;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AlunosTest {

	@Test
	public void deveCRiarAlunoPorMeioDoConstrutor() {
		String email = "email.fake@email.com";
		String nome = "Fake";
		Alunos alunos = new Alunos(nome, email);
		Assert.assertEquals(email, alunos.getEmail());
		Assert.assertEquals(nome, alunos.getNome());
	}

	
}
