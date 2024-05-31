package conta;

public class ContaBancaria {
  public ContaBancaria(String numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }

  private String numero;
  private String titular;
  private double saldo;

  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public String getNumero() {
    return this.numero;
  }

  public String getTitular() {
    return this.titular;
  }

  public double getSaldo() {
    return this.saldo;
  }

  void depositar(double valor) {
    if (valor > 0) {
      saldo = saldo + valor;
      System.err.println(ANSI_BLUE + "Deposito de R$ " + valor + ANSI_RESET);
      System.out.println(ANSI_GREEN + "O novo saldo é R$ " + saldo + ANSI_RESET);
    } else {
      System.out.println(ANSI_RED + "O valor de depósito deve ser maior do que zero." + ANSI_RESET);
    }
    System.out.println("-------");
  }

  void sacar(double valor) {
    if (valor <= 0) {
      System.out.println(ANSI_RED + "O valor de saque deve ser maior do que zero." + ANSI_RESET);
    } else if (valor > saldo) {
      System.err.println(ANSI_RED + "Não é possível sacar um valor maior do que o saldo da conta." + ANSI_RESET);
    } else {
      saldo = saldo - valor;
      System.err.println(ANSI_BLUE + "Saque de R$ " + valor + ANSI_RESET);
      System.out.println(ANSI_GREEN + "O novo saldo é R$ " + saldo + ANSI_RESET);
    }
    System.out.println("-------");
  }

  void consultar() {
    System.out.println(ANSI_BLUE + "O saldo atual da conta é de " + saldo + ANSI_RESET);
    System.out.println("-------");
  }
}
