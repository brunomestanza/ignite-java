package excecoes;

public class Excecoes {
  // Checked exceptions -> Compilador do Java exige tratativas, previstas pela aplicação
  // Geralmente são classes que extendem de uma class Throw

  // Unchecked exceptions -> Exceções inesperadas que não são previstas na aplicação.
  // São apenas gerados durante a utilização da aplicação (em Runtime)
  // Geralmente são classes que extendem de uma class RuntimeException
  // Exemplo: Tentativa de acesso de uma informação nula


  // Exemplo de código com tratativa de exceções:

  // O código abaixo faz com que a exceção seja escalada para o componente acima, de forma que ele deve lidar com a exceção

  // public static void main(String[] args) throws Exception {
  //   int numero = 10;

  //   if(numero < 100) {
  //     throw new Exception("O número é menor que 100");
  //   }
  // }

  // Exemplo de código com tratativa de exceções usando try catch

  // O código abaixo faz com que caso haja uma checked exception, ela seja tratada pela função main, que a chama
  // Essa tratativa é feita através de um Try Catch
  public static void main(String[] args) {
    try {
      validarNumero();
    } catch (Exception e) {
      System.out.println("Deu ruim");
      e.printStackTrace();
    }
  }

  public static void validarNumero() throws Exception {
    int numero = 10;
    if (numero < 100) {
      throw new Exception("O número é menor que 100");
    }
  }
}
