
public class Conta {
    double saldo;
    int agencia,numero;
    String titular;
    String cpf;
    String profissao;
    //METODOS
    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean transferir(double valor,Conta destino){
        if (this.saldo >= valor) {
            this.saldo -=valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }
}
