package Ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        boolean system;
        do {

            try {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Eu sei dividir!");
                System.out.println("Informe o primeiro valor: ");
                int x = teclado.nextInt();
                System.out.println("Informe o segundo valor: ");
                int y = teclado.nextInt();
                if (x < 0 || y < 0) {
                    throw new IllegalArgumentException();
                }
                double r = (x / y);
                System.out.println("O resultado da operação é: " + r);
                system = false;
            } catch (ArithmeticException e) {
                System.err.println("O programa não pode dividir um número por zero");
                system = true;
            } catch (InputMismatchException e) {
                System.err.println("O programa só recebe números inteiros");
                system = true;
            } catch (IllegalArgumentException e) {
                System.err.println("O programa não recebe números negativos");
                system = true;
            }

        } while (system);
    }
}