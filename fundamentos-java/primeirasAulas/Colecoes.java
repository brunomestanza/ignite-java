package primeirasAulas;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {
  public static void main(String[] args) {
    // O valor do map deve ser uma classe!
    Map<String, Integer> notas = new HashMap<>();
    notas.put("Bruno", 10);
    notas.put("Clara", 7);
    notas.put("Gabriel", 7);
    notas.put("Gabriel", 2); // Ao fazer uma inserção com a mesma chave, apenas o ultimo valor fica.

    // String nome = "Bruno";

    // var nota = notas.get(nome);
    // System.out.println("A nota do " + nome + "foi" + nota);

    for (Map.Entry<String, Integer> entry : notas.entrySet()) {
      String nome = entry.getKey();
      Integer nota = entry.getValue();

      System.out.println("O aluno " + nome + "teve a nota " + nota);
    }
  }
}
