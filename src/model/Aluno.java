package model;

import java.util.ArrayList;
import java.util.List;


import javax.annotation.processing.SupportedAnnotationTypes;

import constantes.StatusAluno;

public class Aluno {

	
	private String nome;
	private int idade;
	private List<Disciplina> diciplinas = new ArrayList<Disciplina>();
	
	
	
	
	public Aluno() {
	}
	
	
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", diciplinas=" + diciplinas + "]";
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public List<Disciplina> getDiciplinas() {
		return diciplinas;
	}
	public void setDiciplinas(List<Disciplina> diciplinas) {
		this.diciplinas = diciplinas;
	}
	
	
	public double getMedia() {
		double media=0.0;
		for (Disciplina disciplina : diciplinas) {
			media = media + disciplina.getNota();
		}
		return media/diciplinas.size();
	}
	
	public String getAlunoAprovado() {
		if(getMedia() > 50) {
			if(getMedia() >=70) {
				return StatusAluno.APROVADO;
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}else {
			return StatusAluno.REPROVADO;
		}
	}
	
	
	
	
	

	
}
