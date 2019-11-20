package Poo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class TestesGerais {

	@Test
	 void deveCriarProfessorPorMeioDoConstrutor() {
		String email = "email.fake@email.com";
		String nome = "Fake";
		
		Professor professor = new Professor(nome, email);
		Assert.assertEquals(email, professor.getEmail());
		Assert.assertEquals(nome, professor.getNome());
	}

}