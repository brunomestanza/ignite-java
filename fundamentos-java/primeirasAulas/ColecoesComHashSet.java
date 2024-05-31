package primeirasAulas;
import java.util.HashSet;

public class ColecoesComHashSet {
  public static void main(String[] args) {
    HashSet<Integer> numeros = new HashSet<>();
    // Não existe index, e ele não é importante no uso do hashset
    numeros.add(10);
    numeros.add(11);
    numeros.add(12);
    numeros.add(13);
    numeros.add(13); // Números iguais não são adicionados e não geram erro

    System.out.println(numeros.size());

    numeros.remove(12);

    for (Integer elemento: numeros) {
      System.out.println(elemento);
    }

    System.out.println(numeros.contains(13));
  }
}
