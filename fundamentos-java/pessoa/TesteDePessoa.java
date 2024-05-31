package pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Ana", 23, "12");

    pessoa.imprimirDadosDaPessoa();

    Professor professor = new Professor("Bruno", 24, "13", 1000);

    professor.imprimirDadosDaPessoa();

    Aluno aluno = new Aluno("João", 20, "14", "3128979");

    aluno.imprimirDadosDaPessoa();
  }
}
