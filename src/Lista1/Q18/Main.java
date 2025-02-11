package Lista1.Q18;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        int tam = in.nextInt();

        double [] vet = new double[tam];

        for (int i = 0; i < tam; i++) {
            System.out.printf("Digite o valor da posição [%d]: ", i);
            vet[i] = in.nextInt();
        }

        System.out.println("\nValores do vetor:");
        for (int i = 0; i < tam; i++) {
            System.out.printf("Posição [%d]: %f \n", i,  vet[i]);
        }
    }
}
