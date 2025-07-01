import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Olá, seja bem vindo ao Banco Dio!");

        System.out.println("Digite o número da sua conta: ");
        int account = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da sua agência: ");
        var agency = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        var name = scanner.nextLine();

        System.out.println("Digite o seu saldo: ");
        double balance = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco!\n", name);
        System.out.printf("Sua agência é %s, conta %s e seu saldo de R$%.2f já está disponível para saque.\n", account, agency, balance);


        scanner.close();
    }
}
