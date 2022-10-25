

public class Condicionais {
    public static void main(String[] args) {
        
                System.out.println("testando condicionais");
    
                int idade = 20;
                int quantidadePessoas = 3;    
                boolean acompanhado;
    
                if (quantidadePessoas >= 2) {
                    acompanhado = true;
                }else {
                    acompanhado = false;
                }
    
                if (idade >=18 || acompanhado){
    
                    System.out.println("Seja bem vindo"); 
                } else {
                    System.out.println("infelizmente voce nao pode entrar");
            }
            //SWITCH CASE
            int mes = 10;

            switch (mes) {
                case 1:
                    System.out.println("O mês é Janeiro");
                    break;
                case 2:
                    System.out.println("O mês é Fevereiro");
                    break;
                case 3:
                    System.out.println("O mês é Março");
                    break;
                case 4:
                    System.out.println("O mês é Abril");
                    break;
                case 5:
                    System.out.println("O mês é Maio");
                    break;
                case 6:
                    System.out.println("O mês é Junho");
                    break;
                case 7:
                    System.out.println("O mês é Julho");
                    break;
                case 8:
                    System.out.println("O mês é Agosto");
                    break;
                case 9:
                    System.out.println("O mês é Setembro");
                    break;
                case 10:
                    System.out.println("O mês é Outubro");
                    break;
                case 11:
                    System.out.println("O mês é Novembro");
                    break;
                case 12:
                    System.out.println("O mês é Dezembro");
                    break;
                default:
                    System.out.println("Mês inválido");
                    break;
            }
        //WHILE
        int contador = 0;
        while (contador <=10) {
            System.out.println(contador);
            contador++;
        }
        //FOR
        for (int i=0;i<=5;i++) {
            System.out.println(i);
        }
    }
}
  
