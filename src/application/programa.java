package application;

import model.Exception.SaqueException;
import model.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class programa {

    public static void main(String[] args) throws SaqueException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;
        double balanco, limiteSaq;
        String titular;

        System.out.println("Digite as informações da conta: ");
        System.out.print("Número: ");
        numero = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        titular = sc.nextLine();
        System.out.print("Balanço inicial: ");
        balanco = sc.nextDouble();
        System.out.print("Limite de saque: ");
        limiteSaq = sc.nextDouble();

        Account account = new Account(numero, titular, balanco, limiteSaq);

        try {
            System.out.println("");
            System.out.print("Digite um valor para saque: ");
            double saque = sc.nextDouble();
            account.saque(saque);
            System.out.println("Novo balanço: " + String.format("%.2f", account.getBalanco()));
        } catch (SaqueException e) {
            System.out.println("Erro no saque: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Erro inesperado");
        }

        sc.close();

    }

}
