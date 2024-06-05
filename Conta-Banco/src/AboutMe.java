import java.util.Locale;
import java.util.Scanner;

  public class AboutMe {

        public static void main(String[] args) {
              
          Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

          System.out.println("Digite o nome do cliente !");
          String nome = scanner.next();


          System.out.println("Por favor, digite o número da Agência !");
          String agencia = scanner.next();

          System.out.println("Digite o numero da conta !:");
          int numero = scanner.nextInt();


          System.out.print("saldo :");
          double saldo = scanner.nextDouble();
          
         
         System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco " );
         System.out.println("sua agência é:" + agencia );
         System.out.println("conta: "+ numero);
         System.out.println("e seu saldo " + saldo + " já está disponível para saque " );
         
          

          
          }
}