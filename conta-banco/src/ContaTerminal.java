import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //O programa deverá apresentar a seguinte mensagem em sua conclusão.
        //Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque". Substituindo o que tiver em [] pelas informações inseridas pelo usuário.
        System.out.println("Insira seu nome completo:");
            String nome = scanner.nextLine();
        System.out.println("Insira o número da sua agência, sem pontos ou traços:");
            int numeroAgencia = scanner.nextInt();
        System.out.println("Insira o número de sua conta, sem pontos ou traços:");
            int numeroConta = scanner.nextInt();
        System.out.println("Insira o valor que deseja sacar:");
            double valorSaque = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + valorSaque + " já está disponível para saque.");
    }
}