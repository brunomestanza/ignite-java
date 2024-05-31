package pessoa;

public class Professor extends Pessoa {
  public Professor(String nome, int idade, String cpf, double salario) {
    super(nome, idade, cpf);
    this.salario = salario;
  }

  private double salario;

  public void imprimirDadosDaPessoa() {
    System.out.println("Você é um professor e possui um salário de " + salario);
    super.imprimirDadosDaPessoa();
  }
}
