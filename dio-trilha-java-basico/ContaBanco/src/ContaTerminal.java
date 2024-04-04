
import java.util.Scanner;
    /**<h1>Conta Bancária</h1>
    * O programa realiza a função de mostrar o saldo da pessoa 
    *
    * 
    * @author Luiz Sorrentino
    * @version 1.0
    * @since 04/04/2024
    */
public class ContaTerminal {
   /**
   * @param agencia este é o primeiro parâmetro do método
   * @param numero este é o segundo parâmetro do método
   * @param nome este é o terceiro parâmetro do método
   */

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner contaTerminal = new Scanner (System.in);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = contaTerminal.next();

        System.out.println("Por favor, digite o número da Conta !");
        int numero = contaTerminal.nextInt();

        System.out.println("Por favor, digite o seu nome !");
        String nome = contaTerminal.next();

        double saldo = 1500.49;

        System.out.println("Olá "+ nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
   
    }
}
