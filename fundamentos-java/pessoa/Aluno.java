package pessoa;

public class Aluno extends Pessoa {
  public Aluno(String nome, int idade, String cpf, String matricula) {
    super(nome, idade, cpf);

    this.matricula = matricula;
  }

  private String matricula;

  public void imprimirDadosDaPessoa() {
    System.out.println("Você é um aluno e sua matrícula é " + matricula);
    super.imprimirDadosDaPessoa();
  }
}
