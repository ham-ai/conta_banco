import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome_cliente = entrada.next();

        System.out.println("Insira o número da agência: ");
        int numero = entrada.nextInt();

        System.out.println("Insira sua agência: ");
        String agencia = entrada.next();

        System.out.println("Insira o valor do seu saldo: ");
        double saldo = entrada.nextDouble();

        System.out.println("\nOlá "+nome_cliente
        +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia
        +", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}