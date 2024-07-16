import java.util.Scanner;
public class Desafio {
    public static void main(String[] args) {
        String nome = "Giovana Silverio";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome da conta: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        
        String mensagem = """
                Digite a opção desejada: 
                Operações
                1 - Consultar saldo
                2 - Receber Valor
                3 - Transferir Valor
                4 - Sair
                """;

        while (num != 4){
            System.out.println(mensagem);
            num = scanner.nextInt();
            if (num == 1){
                System.out.println("O saldo disponível é R$" + saldo);
            } else if (num == 2) {
                System.out.print("Digite o valor a ser recebido: " );
                double recebimento = scanner.nextInt();
                double totalRecebimento = saldo + recebimento;
                System.out.println("O valor disponível é R$" + totalRecebimento);
            } else if (num == 3) {
                System.out.print("Digite o valor a ser transferido: ");
                double transferencia = scanner.nextInt();
                if (transferencia > saldo) {
                    System.out.println("O valor a ser transferido é maior do que o disponível na conta");
                } else {
                    double totalTransferencia = saldo - transferencia;
                    System.out.println("O valor disponível é R$" + totalTransferencia);
                }
            }else if (num != 4){
                System.out.println("O número digitado não corresponde a nenhuma operação");
            }
        }
        System.out.println("Operação cancelada!");


    }

}
