package Poo;

import java.util.ArrayList;
import java.util.Date;

public abstract class App {

	public abstract void main(String[] args);
	{
		Alunos aluno1 = new Alunos("Maiko Cunha", "maiko.cunha@db1.com.br");
		aluno1.nome = "Maiko Cunha";
		aluno1.email = "maiko.cunha@db1.com.br";
		
		Alunos aluno2 = new Alunos("João Silva", "joao.silva@db1.com.br");
		aluno1.nome = "João Silva";
		aluno1.email = "joao.silva@db1.com.br";
		
		Professor professor = new Professor("igor Silva", "igor.silva@db1.com.br");
		professor.nome = "igor Silva";
		professor.email = "igor.silva@db1.com.br";
		
		Materia materia = new Materia();
		materia.nome = "POO";
		materia.descricao =
		materia.cargaHoraria = 10.5;
		materia.quantAulas = 3;
		materia.prof = professor;
		
		Aula aula = new Aula();
		aula.data = new Date();
		aula.materia = new Materia();
		aula.chamada = new ArrayList<Alunos>();
		aula.chamada.add(aluno1);
		aula.chamada.add(aluno2);
		
		System.out.println(aula);
		
	}
	
}
