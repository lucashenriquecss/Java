public class CriaConta{
    public static void main(String[] args) {
      Conta primeiraConta = new Conta();
      primeiraConta.saldo = 200;
      System.out.println(primeiraConta);
      primeiraConta.saldo +=100;
      Conta segundaConta = new Conta();
      segundaConta.saldo = 600;
      Conta terceiraConta = new Conta();
      terceiraConta.saldo =150;
    }
}