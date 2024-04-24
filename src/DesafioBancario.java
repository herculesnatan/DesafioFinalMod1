import java.util.Scanner;

public class DesafioBancario {
    public static void main(String[] args) {
        // Dados do Cliente
        String nomeCliente = "Agamenón Atanagildo";
        String tipoConta = "Corrente";
        double saldo = 4500.00;

        System.out.println("*********************************");
        System.out.println("\nNome do Cliente: " + nomeCliente);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Atual: " +saldo);
        System.out.println("\n*********************************");

        // Menu de operações
        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair
                
                """;
        Scanner leitura = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println(menu);
            System.out.println("Digite a opção desejada: ");
            int opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo atual é de R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor à receber? ");
                double valorRecebe = leitura.nextDouble();
                saldo += valorRecebe;
                String resultado = String.format("%.2f", saldo);
                System.out.println("Saldo atualizado...R$ " + resultado);
                System.out.println("Operação realizada com sucesso!");
            } else if (opcao == 3) {
                System.out.println("Informe o calor que deseja transferir? ");
                double transferir = leitura.nextDouble();
                if (transferir > saldo){
                    System.out.println("Não há saldo suficiente para fazer a transferêcia   !");
                } else {
                    saldo -= transferir;
                    String resultado = String.format("%.2f", saldo);
                    System.out.println("Saldo atualizado...R$ " + resultado);
                }
            } else if (opcao == 4) {
                System.out.println("Finalizando...");
                break;
            } else {
                System.out.println("Inválida. Digite novamente");
            }

        }

    }
}
