package pessoa;

public class Pessoa {
  public Pessoa(String nome, int idade, String cpf) {
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
  }

  private String nome;
  private int idade;
  private String cpf;

  public void imprimirDadosDaPessoa() {
    System.out.println(nome + " possui " + idade + " anos de idade e tem o CPF " + cpf);
  }
}
