public class Banco {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo";
        paulo.cpf ="222.222.222-22";
        paulo.profissao = "programador";

        Conta contadoPaulo = new Conta();
        contadoPaulo.deposita(100);
    }
}
