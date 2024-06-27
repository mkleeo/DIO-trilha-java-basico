import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número de sua agência: ");
        String Agencia = sc.nextLine();
        System.out.println();

        System.out.print("Agora digite o número de sua conta: ");
        String numeroContaStr = sc.nextLine();
        int Numero = Integer.parseInt(numeroContaStr);
        System.out.println();

        System.out.print("Informe seu nome completo: ");
        String NomeCliente = sc.nextLine();
        System.out.println();

        System.out.print("Informe o valor do depósito inicial: ");
        String saldoStr = sc.nextLine();
        double Saldo = Double.parseDouble(saldoStr);

        sc.close();

        DadosCliente cliente = new DadosCliente(Numero, Agencia, NomeCliente, Saldo);

        System.out.println(cliente.toString());
    }
}

class DadosCliente {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public DadosCliente(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. " +
               "Sua agência é " + agencia + ", conta número " + numero + " e seu saldo " +
               "inicial de R$ " + String.format("%.2f", saldo) + " já está disponível para saque.";
    }
}
