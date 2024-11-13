import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuário

        // Obter pela scanner os valores do input

        // Exibir a mensagem da conta criada.
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente:");
        String nome_cliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + ", e seu saldo: "+ saldo + " já está disponível para saque!");

    }
}
