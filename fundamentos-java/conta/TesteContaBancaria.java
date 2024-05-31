package conta;

public class TesteContaBancaria {
  public static void main(String[] args) {
    ContaBancaria contaBancaria = new ContaBancaria("12345", "Bruno Mestanza", 100);

    contaBancaria.depositar(50);
    contaBancaria.sacar(30);
    contaBancaria.sacar(150);

    contaBancaria.consultar();
  }
}
