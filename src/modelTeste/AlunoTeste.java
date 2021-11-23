package modelTeste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import constantes.StatusAluno;
import model.Aluno;
import model.Disciplina;

public class AlunoTeste {

	public static void main(String[] args) {
	
		/*List<Aluno> alunoAprovado = new ArrayList<Aluno>();
		List<Aluno> alunoRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunoReprovado = new ArrayList<Aluno>();*/
		
		
		String login = JOptionPane.showInputDialog("Digite seu login");
		String senha = JOptionPane.showInputDialog("Digite sua senha");
		
		if(login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
			
	
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Disciplina> disciplinas =  new ArrayList<Disciplina>(); 
		
		for(int qtd = 0; qtd <= 2; qtd++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno :" + qtd);
			String idade = JOptionPane.showInputDialog("Digite a idade do aluno :" + qtd);
			
			Aluno aluno = new Aluno();
			aluno.setNome(nome);
			aluno.setIdade(Integer.valueOf(idade));
			
			
			alunos.add(aluno);
			
			for(int posicao = 0; posicao <=1; posicao++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina de numero "+ posicao );
				String notaDisciplina = JOptionPane.showInputDialog("Digite a nota da disciplina de numero "+ posicao );
				
				
				Disciplina disciplina = new Disciplina();
				disciplina.setNome(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));
				
				aluno.getDiciplinas().add(disciplina);
			
				
			}
			
			/*for (int posicao = 0; posicao < alunos.size(); posicao++) {
				Aluno aluno2 = alunos.get(posicao);
				if(aluno2.getNome().equalsIgnoreCase("luis")) {
					Aluno troca = new Aluno();
					troca.setNome("nome trocado");
					
					Disciplina disciplina = new Disciplina();
					disciplina.setNome("ingles");
					disciplina.setNota(87);
					
					troca.getDiciplinas().add(disciplina);
					
					alunos.set(posicao, troca);
					
					aluno2=alunos.get(posicao);
				}
			}*/
			
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina");
			if(escolha == 0) {
				int posicao = 1;
				int continuarRemovendo = 0;
				
				while (continuarRemovendo == 0) {
					String removerDisciplina = JOptionPane.showInputDialog("Digite o numero da disciplina a remover: 1, 2 ou 3");
					aluno.getDiciplinas().remove(Integer.valueOf(removerDisciplina).intValue()-posicao);
				
					posicao++;
					
					continuarRemovendo = JOptionPane.showConfirmDialog(null, "Deseja continuar removendo a disciplina");
					
				}
			}
			
			
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
		
		for (Aluno aluno1 : alunos) {
			if(aluno1.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno1);
			}else if(aluno1.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno1);
			}else {
				maps.get(StatusAluno.REPROVADO).add(aluno1);
			}
		}
		System.out.println("****************** aluno aprovado *****************");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Resultado: " + aluno.getAlunoAprovado() + "com média: " + aluno.getMedia());
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("****************** aluno em recuperação *****************");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Resultado: " + aluno.getAlunoAprovado() + "com média: " + aluno.getMedia());
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("****************** aluno em reprovado *****************");
		for (Aluno aluno :maps.get(StatusAluno.REPROVADO)){
			System.out.println("Resultado: " + aluno.getAlunoAprovado() + "com média: " + aluno.getMedia());
		}
	}
	}
}
