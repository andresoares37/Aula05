import java.util.Random;
import java.util.Scanner;

public class TeacherHelper {

	public static final double HORA_AULA = 17.50;

	// final: transforma a variável horaAula em constante
	public static void main(String[] args) {
		int opcao = 0, numeroAulas, qtdeAlunos, i;
		double salarioBase, horaAtividade, descansoSemanalRemunerado, salario, notaAluno, mediaAlunos;

		Random gerador = new Random();

		Scanner leitor = new Scanner(System.in);

		while (opcao != 4) {
			System.out.println("FERRAMENTA DE AUX�LIO AO PROFESSOR!");
			System.out.println("Selecione a opçãoo desejada:");
			System.out.println("1 - Calcular salário");
			System.out.println("2 - Calcular média de notas dos alunos");
			System.out.println("3 - Exibir a motivação do dia!");
			opcao = leitor.nextInt();

			switch (opcao) {
			case 1:
				/*
				 * O sal�rio dos professores de escolas particulares em S�o Paulo � composto da
				 * seguinte forma http://www1.sinprosp.org.br/guia_consultas.asp?mat=8
				 */
				System.out.println(
						"Para calcular seu sal�rio base precisamos saber quantas aulas semanais o professor tem na institui��o");
				numeroAulas = leitor.nextInt();
				System.out.println("É preciso informar, também, o valor da hora aula praticado na instituição");
				double horaAula = leitor.nextDouble();
				salarioBase = numeroAulas * 4.5 * horaAula;
				horaAtividade = salarioBase * 0.05;
				descansoSemanalRemunerado = (salarioBase + horaAtividade) / 6;
				salario = salarioBase + horaAtividade + descansoSemanalRemunerado;

				System.out.println("O sal�rio do professor est� composto da seguinte forma:");
				System.out.println("Sal�rio base R$" + salarioBase);
				System.out.println("Hora-atividade R$" + horaAtividade);
				System.out.println("DSR R$" + descansoSemanalRemunerado);
				System.out.println("Sal�rio total R$" + salario);

				break;
			case 2:
				System.out.println(
						"Para calcularmos a média das notas dos alunos � preciso saber, primeiramente, quantos alunos estão na turma:");
				qtdeAlunos = leitor.nextInt();
				i = 0;
				mediaAlunos = 0;
				while (i < qtdeAlunos) {
					System.out.println("Digite a nota do " + (i + 1) + "º aluno:");
					notaAluno = leitor.nextDouble();
					mediaAlunos = mediaAlunos + notaAluno;
					i++;
				}
				mediaAlunos = mediaAlunos / qtdeAlunos;
				System.out.println("A média de notas dos alunos dessa turma é " + mediaAlunos);

				break;
			case 3:

				switch (gerador.nextInt(7)) {
				case 0:
					System.out.println("Não há bug que você não possa superar!");
					break;
				case 1:
					System.out.println("Você é um professor incrível!");
					break;
				case 2:
					System.out.println("Que o seu dia seja produtivo!");
					break;
				case 3:
					System.out.println("Que os seus alunos notem a paixão com que você ensina!");
					break;
				case 4:
					System.out.println("Seu trabalho ajuda a fazer do mundo um lugar melhor!");
					break;
				case 5:
					System.out.println("Quem ensina com o coração cria um tesouro para a vida toda!");
					break;
				case 6:
					System.out.println("Obrigado por se colocar à disposição do saber!");
					break;

				}

				break;
			case 4:
				System.out.println("Encerrando o sistema...");
				break;

			}
		}

		leitor.close();

	}

}
