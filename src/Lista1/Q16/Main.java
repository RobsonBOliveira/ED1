package Lista1.Q16;

import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        //Fatorial iterativo
        int n = 400;
        double xn = 1;
        for(int i = n; i > 0; i--){
            xn *= i;
        }
        System.out.println("iterativo = " + xn);
        System.out.println("recursivo = " + fat(n));
    }

    //Fatorial recursivo
    public static double fat(int n){
        if(n == 0) {
            return 1;
        }
        else {
            return fat(n - 1) * n;
        }
    }
}
