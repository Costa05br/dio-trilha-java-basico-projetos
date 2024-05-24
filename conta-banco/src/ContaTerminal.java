/**
 * @author João Lucas Gomes Costa
 * Projeto proposto pela DIO. Segue o meu projeto:
 */

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //Declaração das variáveis:
        Scanner teclado = new Scanner (System.in); // Nomeei como teclado, pois associo com teclado do usuário;

        String agencia;
        String nomeCompleto;
        int conta;
        double saldo;

        //Exibir as mensagens para o nosso usuário e guadar informação nas variáveis:

        System.out.println("Digite o seu nome completo: ");
        nomeCompleto = teclado.nextLine ();

        System.out.println("Digite o número da sua Agência: ");
        agencia = teclado.nextLine ();

        System.out.println("Digite o número da sua Conta: ");
        conta = teclado.nextInt ();

        System.out.println("Digite o seu saldo: ");
        saldo = teclado.nextDouble ();


        //Exibir a mensagem conta criada

        System.out.println(concat (nomeCompleto, agencia, conta, saldo));

        teclado.close();
        
    }

    public static String concat (String nomeCompleto, String agencia, int conta, double saldo) {

        return "Olá [".concat(nomeCompleto).concat("]").concat (", obrigado por criar uma conta em nosso banco, sua agência é [") .concat(agencia).concat ("]").concat (", conta [").concat (String.valueOf(conta)).concat ("]").concat (" ").concat(" e seu saldo [").concat (String.valueOf(saldo)).concat ("]").concat (" ").concat ("já está disponível para saque.");
    }
}
