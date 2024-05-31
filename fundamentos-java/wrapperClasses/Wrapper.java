package wrapperClasses;

public class Wrapper {
  // Wrapper é uma forma de criarmos uma instancia de classe de um tipo primitivo
  // para que possamos ter mais métodos e funcionalidades dele, similar ao que já temos
  // por padrão com a String

  public static void main(String[] args) {
    int numero = 1;
    float numeroFlutuante = 10f;
    boolean verdadeiro = true;

    // Importante lembrar que wrapper classes ocupam mais memória por serem estruturas mais complexas
    Integer numeroWrapper = 1;
    Float numeroFlutuanteWrapper = 10f;
    Boolean verdadeiroWrapper = true;
  }
}
