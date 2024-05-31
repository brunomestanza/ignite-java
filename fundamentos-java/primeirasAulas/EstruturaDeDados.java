package primeirasAulas;
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
  public static void main(String[] args) {
    // Lista
    List<String> nomes = new ArrayList<>();
    nomes.add("Bruno");
    nomes.add("Clara");
    nomes.add("Gabriel");

    System.out.println(nomes.get(0));

    // For em listas
    for(String nome: nomes) {
      System.out.println(nome);
    }

    // forEach em listas
    nomes.forEach(nome -> System.out.println("Nome"));
  }
}
