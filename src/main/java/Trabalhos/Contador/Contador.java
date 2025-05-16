package Trabalhos.Contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numberOne = leitura.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numberTwo = leitura.nextInt();


        try {
            contar(number1);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e);
        }
    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException("Numeros invalidos. Numero 1 deve ser menor que Numero 2.");
        } else {
            for (i = 0; i < (numero2 - numero1); i++) {
                System.out.printf("Imprimindo numero %d", i + 1);
            }
        }
    }
}