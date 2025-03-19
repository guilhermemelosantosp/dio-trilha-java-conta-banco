import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        double saldo = 237.48;
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Por favor, digite o número da Conta !");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência ! ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome. ");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu Sobrenome. ");
        String sobrenome = scanner.next();

        scanner.close();

        //System.out.println("Por favor, digite seu Saldo. ");
        //double saldo = scanner.nextDouble();

       // int conta = Integer.valueOf(args[0]);
       // String agencia = args [1];
       // String nome = args [2];
       //String sobrenome = args [3];
       //double saldo = Double.valueOf(args[4]);

        System.out.println("Testando");

       System.out.println("Olá " + nome + " " +sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + conta +" e seu saldo " + saldo + " já está disponível para saque");

    }
    
}
