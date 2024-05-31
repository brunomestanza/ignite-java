package primeirasAulas;
public class PrimeiraClasse {
  public static void main(String[] args) {
    /*
     * Números:
     * int -> Usado para números inteiros, sem quebra
     * double -> Usado para números decimais que exigem maior precisão
     * float -> Usado para números decimais com precisão mais simples
     * long -> Usado para números inteiros muito extensos que o int não consegue armazenar
     * 
     * String -> A string é uma classe usada para definir textos
     * boolean -> Pode ser verdadeiro ou falso
     * 
    */

    int intVariable = 10;
    // double doubleVariable = 3.14;
    // float floatVariable = 3.14f;
    // long longVariable = 9382908940109840L;
    // String stringVariable = "Texto aleatório";
    // boolean booleanVariable = true;

    /* If / Else */

    if(intVariable == 11) {
      System.out.println("Entrou no if");
    } else if (intVariable == 12) {
      System.out.println("Entrou no else if");
    } else {
      System.out.println("Entrou no else");
    }

    /* While */
    int startValue = 0;
    while (startValue < 3) {
      System.out.println("O valor inicial é menor que 3");
      startValue++;
    }

    /* For */
    for(int i = 0; i < 4; i++) {
      System.out.println("O valor de i é: " + i);
    }
  }  
}